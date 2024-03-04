// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface StructuredAggregationQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.StructuredAggregationQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   * @return Whether the structuredQuery field is set.
   */
  boolean hasStructuredQuery();
  /**
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   * @return The structuredQuery.
   */
  com.google.firestore.v1.StructuredQuery getStructuredQuery();
  /**
   * <pre>
   * Nested structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 1;</code>
   */
  com.google.firestore.v1.StructuredQueryOrBuilder getStructuredQueryOrBuilder();

  /**
   * <pre>
   * Optional. Series of aggregations to apply over the results of the
   * `structured_query`.
   *
   * Requires:
   *
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.firestore.v1.StructuredAggregationQuery.Aggregation> 
      getAggregationsList();
  /**
   * <pre>
   * Optional. Series of aggregations to apply over the results of the
   * `structured_query`.
   *
   * Requires:
   *
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.firestore.v1.StructuredAggregationQuery.Aggregation getAggregations(int index);
  /**
   * <pre>
   * Optional. Series of aggregations to apply over the results of the
   * `structured_query`.
   *
   * Requires:
   *
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAggregationsCount();
  /**
   * <pre>
   * Optional. Series of aggregations to apply over the results of the
   * `structured_query`.
   *
   * Requires:
   *
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.firestore.v1.StructuredAggregationQuery.AggregationOrBuilder> 
      getAggregationsOrBuilderList();
  /**
   * <pre>
   * Optional. Series of aggregations to apply over the results of the
   * `structured_query`.
   *
   * Requires:
   *
   * * A minimum of one and maximum of five aggregations per query.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.StructuredAggregationQuery.Aggregation aggregations = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.firestore.v1.StructuredAggregationQuery.AggregationOrBuilder getAggregationsOrBuilder(
      int index);

  com.google.firestore.v1.StructuredAggregationQuery.QueryTypeCase getQueryTypeCase();
}
