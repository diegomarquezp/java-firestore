/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query_profile.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface ExplainMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ExplainMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   *
   * @return Whether the planSummary field is set.
   */
  boolean hasPlanSummary();
  /**
   *
   *
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   *
   * @return The planSummary.
   */
  com.google.firestore.v1.PlanSummary getPlanSummary();
  /**
   *
   *
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   */
  com.google.firestore.v1.PlanSummaryOrBuilder getPlanSummaryOrBuilder();

  /**
   *
   *
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   *
   * @return Whether the executionStats field is set.
   */
  boolean hasExecutionStats();
  /**
   *
   *
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   *
   * @return The executionStats.
   */
  com.google.firestore.v1.ExecutionStats getExecutionStats();
  /**
   *
   *
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   */
  com.google.firestore.v1.ExecutionStatsOrBuilder getExecutionStatsOrBuilder();
}
