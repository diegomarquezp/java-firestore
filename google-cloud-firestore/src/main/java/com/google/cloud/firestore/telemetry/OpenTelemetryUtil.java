/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.firestore.telemetry;

import com.google.api.core.ApiFunction;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.ManagedChannelBuilder;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Helper class that facilitates integration of the Firestore SDK with OpenTelemetry Trace, Metrics,
 * and Logs APIs.
 *
 * <p>This class currently supports tracing utility functions. Metrics and Logging methods will be
 * added in the future.
 */
public abstract class OpenTelemetryUtil {
  static final String ENABLE_OPEN_TELEMETRY_ENV_VAR_NAME = "FIRESTORE_ENABLE_OPEN_TELEMETRY";
  static final String OPEN_TELEMETRY_TRACE_SAMPLING_RATE_ENV_VAR_NAME = "FIRESTORE_OPEN_TELEMETRY_TRACE_SAMPLING_RATE";
  static final String SERVICE = "Firestore";

  /** Returns the Tracing utility object. */
  public abstract TraceUtil getTraceUtil();

  /** Initiates an orderly shutdown in which remaining operations are finished, but no new work will be accepted. */
  public abstract void shutdown();

  /**
   * Returns a channel configurator for gRPC, or {@code null} if telemetry collection is disabled.
   */
  @Nullable
  public abstract ApiFunction<ManagedChannelBuilder, ManagedChannelBuilder> getChannelConfigurator();

  @VisibleForTesting
  @Nullable
  static String getEnableOpenTelemetryEnvVar() {
    return System.getenv(ENABLE_OPEN_TELEMETRY_ENV_VAR_NAME);
  }

  /**
   * Creates and returns an instance of the OpenTelemetryUtil class.
   *
   * @param firestoreOptions The FirestoreOptions object that is requesting an instance of
   *     OpenTelemetryUtil.
   * @return An instance of the OpenTelemetryUtil class.
   */
  public static OpenTelemetryUtil getInstance(@Nonnull FirestoreOptions firestoreOptions) {
    boolean createEnabledInstance = firestoreOptions.getOpenTelemetryOptions().getEnabled();

    // The environment variable can override options to enable/disable telemetry collection.
    String enableOpenTelemetryEnvVar = getEnableOpenTelemetryEnvVar();
    if (enableOpenTelemetryEnvVar != null) {
      if (enableOpenTelemetryEnvVar.equalsIgnoreCase("true") || enableOpenTelemetryEnvVar.equalsIgnoreCase("on")) {
        createEnabledInstance = true;
      }
      if (enableOpenTelemetryEnvVar.equalsIgnoreCase("false") || enableOpenTelemetryEnvVar.equalsIgnoreCase("off")) {
        createEnabledInstance = false;
      }
    }

    if (createEnabledInstance) {
      return new EnabledOpenTelemetryUtil(firestoreOptions);
    } else {
      return new DisabledOpenTelemetryUtil();
    }
  }
}
