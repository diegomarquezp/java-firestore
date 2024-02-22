/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.firestore;

import com.google.api.core.ApiFuture;
import com.google.api.core.InternalExtensionOnly;
import com.google.api.core.SettableApiFuture;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamController;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.v1.FirestoreSettings;
import com.google.common.collect.ImmutableMap;
import com.google.firestore.v1.RunAggregationQueryRequest;
import com.google.firestore.v1.RunAggregationQueryResponse;
import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.StructuredAggregationQuery;
import com.google.firestore.v1.StructuredAggregationQuery.Aggregation;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** A query that calculates aggregations over an underlying query. */
@InternalExtensionOnly
public class AggregateQuery {
  @Nonnull private final Query query;

  @Nonnull private final List<AggregateField> aggregateFieldList;

  @Nonnull private final Map<String, String> aliasMap;

  AggregateQuery(@Nonnull Query query, @Nonnull List<AggregateField> aggregateFields) {
    this.query = query;
    this.aggregateFieldList = aggregateFields;
    this.aliasMap = new HashMap<>();
  }

  /** Returns the query whose aggregations will be calculated by this object. */
  @Nonnull
  public Query getQuery() {
    return query;
  }

  /**
   * Executes this query.
   *
   * @return An {@link ApiFuture} that will be resolved with the results of the query.
   */
  @Nonnull
  public ApiFuture<AggregateQuerySnapshot> get() {
    return get(null);
  }

  /**
   * Plans and optionally executes this query. Returns an ApiFuture that will be resolved with the
   * planner information, statistics from the query execution (if any), and the query results (if
   * any).
   *
   * @return An ApiFuture that will be resolved with the planner information, statistics from the
   *     query execution (if any), and the query results (if any).
   */
  @Nonnull
  public ApiFuture<ExplainResults<AggregateQuerySnapshot>> explain(ExplainOptions options) {
    AggregateQueryResponseDeliverer responseDeliverer =
        new AggregateQueryResponseDeliverer(
            /* transactionId= */ null,
            /* startTimeNanos= */ query.rpcContext.getClock().nanoTime(),
            /* isExplainQuery= */ true);
    runQuery(responseDeliverer, options);
    return responseDeliverer.getExplainResultsFuture();
  }

  @Nonnull
  ApiFuture<AggregateQuerySnapshot> get(@Nullable final ByteString transactionId) {
    AggregateQueryResponseDeliverer responseDeliverer =
        new AggregateQueryResponseDeliverer(
            transactionId,
            /* startTimeNanos= */ query.rpcContext.getClock().nanoTime(),
            /* isExplainQuery= */ false);
    runQuery(responseDeliverer, /* explainOptions= */ null);
    return responseDeliverer.getAggregateQuerySnapshotFuture();
  }

  private void runQuery(
      AggregateQueryResponseDeliverer responseDeliverer, ExplainOptions explainOptions) {
    RunAggregationQueryRequest request = toProto(responseDeliverer.getTransactionId());
    AggregateQueryResponseObserver responseObserver =
        new AggregateQueryResponseObserver(responseDeliverer, explainOptions);
    ServerStreamingCallable<RunAggregationQueryRequest, RunAggregationQueryResponse> callable =
        query.rpcContext.getClient().runAggregationQueryCallable();
    query.rpcContext.streamRequest(request, responseObserver, callable);
  }

  @Nonnull
  private Map<String, Value> convertServerAggregateFieldsMapToClientAggregateFieldsMap(
      @Nonnull Map<String, Value> data) {
    ImmutableMap.Builder<String, Value> builder = ImmutableMap.builder();
    data.forEach((serverAlias, value) -> builder.put(aliasMap.get(serverAlias), value));
    return builder.build();
  }

  private final class AggregateQueryResponseDeliverer {

    @Nullable private final ByteString transactionId;
    private final long startTimeNanos;
    private final boolean isExplainQuery;
    private final SettableApiFuture<AggregateQuerySnapshot> aggregateQuerySnapshotFuture =
        SettableApiFuture.create();
    private final SettableApiFuture<ExplainResults<AggregateQuerySnapshot>> explainFuture =
        SettableApiFuture.create();
    private final AtomicBoolean isAggregateQuerySnapshotFutureCompleted = new AtomicBoolean(false);
    private final AtomicBoolean isExplainFutureCompleted = new AtomicBoolean(false);

    AggregateQueryResponseDeliverer(
        @Nullable ByteString transactionId, long startTimeNanos, boolean isExplainQuery) {
      this.transactionId = transactionId;
      this.startTimeNanos = startTimeNanos;
      this.isExplainQuery = isExplainQuery;
    }

    ApiFuture<AggregateQuerySnapshot> getAggregateQuerySnapshotFuture() {
      return aggregateQuerySnapshotFuture;
    }

    ApiFuture<ExplainResults<AggregateQuerySnapshot>> getExplainResultsFuture() {
      return explainFuture;
    }

    @Nullable
    ByteString getTransactionId() {
      return transactionId;
    }

    long getStartTimeNanos() {
      return startTimeNanos;
    }

    void deliverResult(
        @Nonnull Map<String, Value> serverData,
        Timestamp readTime,
        @Nullable ExplainMetrics metrics) {
      if (isExplainQuery) {
        if (isExplainFutureCompleted.compareAndSet(false, true)) {
          AggregateQuerySnapshot snapshot =
              new AggregateQuerySnapshot(
                  AggregateQuery.this,
                  readTime,
                  convertServerAggregateFieldsMapToClientAggregateFieldsMap(serverData));
          explainFuture.set(new ExplainResults<>(metrics, snapshot));
        }
      } else {
        if (isAggregateQuerySnapshotFutureCompleted.compareAndSet(false, true)) {
          aggregateQuerySnapshotFuture.set(
              new AggregateQuerySnapshot(
                  AggregateQuery.this,
                  readTime,
                  convertServerAggregateFieldsMapToClientAggregateFieldsMap(serverData)));
        }
      }
    }

    void deliverError(Throwable throwable) {
      if (isExplainQuery) {
        if (isExplainFutureCompleted.compareAndSet(false, true)) {
          explainFuture.setException(throwable);
        }
      } else {
        if (isAggregateQuerySnapshotFutureCompleted.compareAndSet(false, true)) {
          aggregateQuerySnapshotFuture.setException(throwable);
        }
      }
    }
  }

  private final class AggregateQueryResponseObserver
      implements ResponseObserver<RunAggregationQueryResponse> {

    private final AggregateQueryResponseDeliverer responseDeliverer;
    @Nullable private final ExplainOptions explainOptions;
    private StreamController streamController;
    private Timestamp readTime = Timestamp.MAX_VALUE;
    private Map<String, Value> aggregateFieldsMap = Collections.emptyMap();
    private ExplainMetrics metrics;

    AggregateQueryResponseObserver(
        AggregateQueryResponseDeliverer responseDeliverer,
        @Nullable ExplainOptions explainOptions) {
      this.responseDeliverer = responseDeliverer;
      this.explainOptions = explainOptions;
    }

    @Override
    public void onStart(StreamController streamController) {
      this.streamController = streamController;
    }

    @Override
    public void onResponse(RunAggregationQueryResponse response) {
      if (response.hasReadTime()) {
        readTime = Timestamp.fromProto(response.getReadTime());
      }

      if (response.hasResult()) {
        aggregateFieldsMap = response.getResult().getAggregateFieldsMap();
      }

      if (response.hasStats()) {
        // create ExplainMetrics.
      }

      if (explainOptions == null) {
        // Deliver the result; even though the `RunAggregationQuery` RPC is a "streaming" RPC,
        // meaning that `onResponse()` can be called multiple times, it _should_ only be called
        // once in NORMAL mode. But even if it is called more than once, `responseDeliverer` will
        // drop superfluous results. In modes other than NORMAL, there will be more than one
        // response, and the last response will contain stats.
        onComplete();
      }
    }

    @Override
    public void onError(Throwable throwable) {
      if (shouldRetry(throwable)) {
        runQuery(responseDeliverer, explainOptions);
      } else {
        responseDeliverer.deliverError(throwable);
      }
    }

    private boolean shouldRetry(Throwable throwable) {
      // Do not retry EXPLAIN requests because it'd be executing
      // multiple queries. This means stats would have to be aggregated,
      // and that may not even make sense for many statistics.
      if (explainOptions != null) {
        return false;
      }

      Set<StatusCode.Code> retryableCodes =
          FirestoreSettings.newBuilder().runAggregationQuerySettings().getRetryableCodes();
      return query.shouldRetryQuery(
          throwable,
          responseDeliverer.getTransactionId(),
          responseDeliverer.getStartTimeNanos(),
          retryableCodes);
    }

    @Override
    public void onComplete() {
      responseDeliverer.deliverResult(aggregateFieldsMap, readTime, metrics);

      // Close the stream to avoid it dangling, since we're not expecting any more responses.
      streamController.cancel();
    }
  }

  /**
   * Returns the {@link RunAggregationQueryRequest} that this AggregateQuery instance represents.
   * The request contain the serialized form of all aggregations and Query constraints.
   *
   * @return the serialized RunAggregationQueryRequest
   */
  @Nonnull
  public RunAggregationQueryRequest toProto() {
    return toProto(null);
  }

  @Nonnull
  RunAggregationQueryRequest toProto(@Nullable final ByteString transactionId) {
    RunQueryRequest runQueryRequest = query.toProto();

    RunAggregationQueryRequest.Builder request = RunAggregationQueryRequest.newBuilder();
    request.setParent(runQueryRequest.getParent());
    if (transactionId != null) {
      request.setTransaction(transactionId);
    }

    StructuredAggregationQuery.Builder structuredAggregationQuery =
        request.getStructuredAggregationQueryBuilder();
    structuredAggregationQuery.setStructuredQuery(runQueryRequest.getStructuredQuery());

    // We use this set to remove duplicate aggregates.
    // For example, `aggregate(sum("foo"), sum("foo"))`
    HashSet<String> uniqueAggregates = new HashSet<>();
    List<StructuredAggregationQuery.Aggregation> aggregations = new ArrayList<>();
    int aggregationNum = 0;
    for (AggregateField aggregateField : aggregateFieldList) {
      // `getAlias()` provides a unique representation of an AggregateField.
      boolean isNewAggregateField = uniqueAggregates.add(aggregateField.getAlias());
      if (!isNewAggregateField) {
        // This is a duplicate AggregateField. We don't need to include it in the request.
        continue;
      }

      // If there's a field for this aggregation, build its proto.
      StructuredQuery.FieldReference field = null;
      if (!aggregateField.getFieldPath().isEmpty()) {
        field =
            StructuredQuery.FieldReference.newBuilder()
                .setFieldPath(aggregateField.getFieldPath())
                .build();
      }
      // Build the aggregation proto.
      Aggregation.Builder aggregation = Aggregation.newBuilder();
      if (aggregateField instanceof AggregateField.CountAggregateField) {
        aggregation.setCount(Aggregation.Count.getDefaultInstance());
      } else if (aggregateField instanceof AggregateField.SumAggregateField) {
        aggregation.setSum(Aggregation.Sum.newBuilder().setField(field).build());
      } else if (aggregateField instanceof AggregateField.AverageAggregateField) {
        aggregation.setAvg(Aggregation.Avg.newBuilder().setField(field).build());
      } else {
        throw new RuntimeException("Unsupported aggregation");
      }
      // Map all client-side aliases to a unique short-form alias.
      // This avoids issues with client-side aliases that exceed the 1500-byte string size limit.
      String serverAlias = "aggregate_" + aggregationNum++;
      aliasMap.put(serverAlias, aggregateField.getAlias());
      aggregation.setAlias(serverAlias);
      aggregations.add(aggregation.build());
    }
    structuredAggregationQuery.addAllAggregations(aggregations);
    return request.build();
  }

  /**
   * Returns an AggregateQuery instance that can be used to execute the provided {@link
   * RunAggregationQueryRequest}.
   *
   * <p>Only RunAggregationQueryRequests that pertain to the same project as the Firestore instance
   * can be deserialized.
   *
   * @param firestore a Firestore instance to apply the query to.
   * @param proto the serialized RunAggregationQueryRequest.
   * @return a AggregateQuery instance that can be used to execute the RunAggregationQueryRequest.
   */
  @Nonnull
  public static AggregateQuery fromProto(Firestore firestore, RunAggregationQueryRequest proto) {
    RunQueryRequest runQueryRequest =
        RunQueryRequest.newBuilder()
            .setParent(proto.getParent())
            .setStructuredQuery(proto.getStructuredAggregationQuery().getStructuredQuery())
            .build();
    Query query = Query.fromProto(firestore, runQueryRequest);

    List<AggregateField> aggregateFields = new ArrayList<>();
    List<Aggregation> aggregations = proto.getStructuredAggregationQuery().getAggregationsList();
    aggregations.forEach(
        aggregation -> {
          if (aggregation.hasCount()) {
            aggregateFields.add(AggregateField.count());
          } else if (aggregation.hasAvg()) {
            aggregateFields.add(
                AggregateField.average(aggregation.getAvg().getField().getFieldPath()));
          } else if (aggregation.hasSum()) {
            aggregateFields.add(AggregateField.sum(aggregation.getSum().getField().getFieldPath()));
          } else {
            throw new RuntimeException("Unsupported aggregation.");
          }
        });
    return new AggregateQuery(query, aggregateFields);
  }

  /**
   * Calculates and returns the hash code for this object.
   *
   * @return the hash code for this object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(query, aggregateFieldList);
  }

  /**
   * Compares this object with the given object for equality.
   *
   * <p>This object is considered "equal" to the other object if and only if all of the following
   * conditions are satisfied:
   *
   * <ol>
   *   <li>{@code object} is a non-null instance of {@link AggregateQuery}.
   *   <li>{@code object} performs the same aggregations as this {@link AggregateQuery}.
   *   <li>The underlying {@link Query} of {@code object} compares equal to that of this object.
   * </ol>
   *
   * @param object The object to compare to this object for equality.
   * @return {@code true} if this object is "equal" to the given object, as defined above, or {@code
   *     false} otherwise.
   */
  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    } else if (!(object instanceof AggregateQuery)) {
      return false;
    }
    AggregateQuery other = (AggregateQuery) object;
    return query.equals(other.query) && aggregateFieldList.equals(other.aggregateFieldList);
  }
}
