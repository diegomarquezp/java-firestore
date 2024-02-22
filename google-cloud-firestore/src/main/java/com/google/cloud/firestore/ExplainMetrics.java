/*
 * Copyright 2024 Google LLC
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** ExplainResults contains information about planning and execution of a query. */
public class ExplainMetrics {
  @Nonnull private final PlanSummary planSummary;
  @Nullable private final ExecutionStats executionStats;

  ExplainMetrics(@Nonnull PlanSummary planSummary, @Nullable ExecutionStats executionStats) {
    this.planSummary = planSummary;
    this.executionStats = executionStats;
  }

  /** Returns the information about the query plan. */
  @Nonnull
  public PlanSummary getPlanSummary() {
    return planSummary;
  }

  /**
   * Returns the information about the execution of the query, or null if the query was not
   * executed.
   */
  @Nullable
  public ExecutionStats getExecutionStats() {
    return executionStats;
  }
}
