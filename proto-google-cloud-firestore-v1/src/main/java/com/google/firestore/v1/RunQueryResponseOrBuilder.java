// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface RunQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.RunQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The transaction that was started as part of this request.
   * Can only be set in the first response, and only if
   * [RunQueryRequest.new_transaction][google.firestore.v1.RunQueryRequest.new_transaction]
   * was set in the request. If set, no other fields will be set in this
   * response.
   * </pre>
   *
   * <code>bytes transaction = 2;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * A query result, not set when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * A query result, not set when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   *
   * @return The document.
   */
  com.google.firestore.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * A query result, not set when reporting partial progress.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 1;</code>
   */
  com.google.firestore.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the document was read. This may be monotonically
   * increasing; in this case, the previous documents in the result stream are
   * guaranteed not to have changed between their `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `document` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * The time at which the document was read. This may be monotonically
   * increasing; in this case, the previous documents in the result stream are
   * guaranteed not to have changed between their `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `document` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * The time at which the document was read. This may be monotonically
   * increasing; in this case, the previous documents in the result stream are
   * guaranteed not to have changed between their `read_time` and this one.
   *
   * If the query returns no results, a response with `read_time` and no
   * `document` will be sent, and this represents the time at which the query
   * was run.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of results that have been skipped due to an offset between
   * the last response and the current response.
   * </pre>
   *
   * <code>int32 skipped_results = 4;</code>
   *
   * @return The skippedResults.
   */
  int getSkippedResults();

  /**
   *
   *
   * <pre>
   * If present, Firestore has completely finished the request and no more
   * documents will be returned.
   * </pre>
   *
   * <code>bool done = 6;</code>
   *
   * @return Whether the done field is set.
   */
  boolean hasDone();
  /**
   *
   *
   * <pre>
   * If present, Firestore has completely finished the request and no more
   * documents will be returned.
   * </pre>
   *
   * <code>bool done = 6;</code>
   *
   * @return The done.
   */
  boolean getDone();

  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunQueryRequest.explain_options][google.firestore.v1.RunQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 11;</code>
   *
   * @return Whether the explainMetrics field is set.
   */
  boolean hasExplainMetrics();
  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunQueryRequest.explain_options][google.firestore.v1.RunQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 11;</code>
   *
   * @return The explainMetrics.
   */
  com.google.firestore.v1.ExplainMetrics getExplainMetrics();
  /**
   *
   *
   * <pre>
   * Query explain metrics. This is only present when the
   * [RunQueryRequest.explain_options][google.firestore.v1.RunQueryRequest.explain_options]
   * is provided, and it is sent only once with the last response in the stream.
   * </pre>
   *
   * <code>.google.firestore.v1.ExplainMetrics explain_metrics = 11;</code>
   */
  com.google.firestore.v1.ExplainMetricsOrBuilder getExplainMetricsOrBuilder();

  com.google.firestore.v1.RunQueryResponse.ContinuationSelectorCase getContinuationSelectorCase();
}
