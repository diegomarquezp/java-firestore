package com.google.cloud.firestore;

import java.util.Map;
import javax.annotation.Nonnull;

/** A QueryProfile contains information about planning, execution, and results of a query. */
public final class QueryProfileInfo<T> {
  /** A Map that contains information about the query plan. Contents are subject to change. */
  @Nonnull public final Map<String, Object> plan;

  /**
   * A Map that contains statistics about the execution of the query. Contents are subject to
   * change.
   */
  @Nonnull public final Map<String, Object> stats;

  /** The snapshot that contains the results of executing the query. */
  @Nonnull public final T snapshot;

  QueryProfileInfo(
      @Nonnull Map<String, Object> plan, @Nonnull Map<String, Object> stats, @Nonnull T snapshot) {
    this.plan = plan;
    this.stats = stats;
    this.snapshot = snapshot;
  }
}
