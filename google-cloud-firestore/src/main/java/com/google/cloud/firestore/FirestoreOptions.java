/*
 * Copyright 2017 Google LLC
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

import static io.opentelemetry.semconv.resource.attributes.ResourceAttributes.SERVICE_NAME;

import com.google.api.core.ApiFunction;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.auth.Credentials;
import com.google.cloud.ServiceDefaults;
import com.google.cloud.ServiceOptions;
import com.google.cloud.TransportOptions;
import com.google.cloud.firestore.spi.v1.FirestoreRpc;
import com.google.cloud.firestore.spi.v1.GrpcFirestoreRpc;
import com.google.cloud.firestore.v1.FirestoreSettings;
import com.google.cloud.grpc.GrpcTransportOptions;
import com.google.cloud.opentelemetry.trace.TraceExporter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import io.grpc.ManagedChannelBuilder;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.exporter.logging.LoggingSpanExporter;
import io.opentelemetry.instrumentation.grpc.v1_6.GrpcTelemetry;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** A Factory class to create new Firestore instances. */
public final class FirestoreOptions extends ServiceOptions<Firestore, FirestoreOptions> {

  private static String OPEN_TELEMETRY_ENV_VAR_NAME = "ENABLE_OPEN_TELEMETRY";
  private static final String API_SHORT_NAME = "Firestore";
  private static final Set<String> SCOPES =
      ImmutableSet.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/datastore")
          .build();
  private static final long serialVersionUID = -5853552236134770090L;

  private static final String FIRESTORE_EMULATOR_SYSTEM_VARIABLE = "FIRESTORE_EMULATOR_HOST";

  private final String databaseId;
  private final TransportChannelProvider channelProvider;
  private final CredentialsProvider credentialsProvider;
  private final String emulatorHost;

  private boolean enableOpenTelemetry = false;

  public static class DefaultFirestoreFactory implements FirestoreFactory {

    private static final FirestoreFactory INSTANCE = new DefaultFirestoreFactory();

    @Nonnull
    @Override
    public Firestore create(@Nonnull FirestoreOptions options) {
      return new FirestoreImpl(options);
    }
  }

  /** Returns a default {@code FirestoreOptions} instance. */
  public static FirestoreOptions getDefaultInstance() {
    return newBuilder().build();
  }

  public static class DefaultFirestoreRpcFactory implements FirestoreRpcFactory {

    private static final FirestoreRpcFactory INSTANCE = new DefaultFirestoreRpcFactory();

    @Nonnull
    @Override
    public FirestoreRpc create(@Nonnull FirestoreOptions options) {
      try {
        return new GrpcFirestoreRpc(options);
      } catch (IOException e) {
        throw FirestoreException.forIOException(e, false);
      }
    }
  }

  @Override
  protected boolean projectIdRequired() {
    return false;
  }

  @Override
  protected String getDefaultHost() {
    return FirestoreDefaults.INSTANCE.getHost();
  }

  public String getDatabaseId() {
    return databaseId;
  }

  public CredentialsProvider getCredentialsProvider() {
    return credentialsProvider;
  }

  public TransportChannelProvider getTransportChannelProvider() {
    return channelProvider;
  }

  public String getEmulatorHost() {
    return emulatorHost;
  }

  public static class OtelGrpcChannelConfigurator
      implements ApiFunction<ManagedChannelBuilder, ManagedChannelBuilder> {
    @Override
    public ManagedChannelBuilder apply(ManagedChannelBuilder managedChannelBuilder) {
      // TODO(ehsann): only add intercept if otel is not null.
      GrpcTelemetry grpcTelemetry = GrpcTelemetry.create(GlobalOpenTelemetry.get());
      return managedChannelBuilder.intercept(grpcTelemetry.newClientInterceptor());
    }
  }

  public static class Builder extends ServiceOptions.Builder<Firestore, FirestoreOptions, Builder> {

    @Nullable private String databaseId = null;
    @Nullable private TransportChannelProvider channelProvider = null;
    @Nullable private CredentialsProvider credentialsProvider = null;
    @Nullable private String emulatorHost = null;

    private Builder() {}

    private Builder(FirestoreOptions options) {
      super(options);
      this.databaseId = options.databaseId;
      this.channelProvider = options.channelProvider;
      this.credentialsProvider = options.credentialsProvider;
      this.emulatorHost = options.emulatorHost;
    }

    /**
     * Sets the {@link TransportOptions} to use with this Firestore client.
     *
     * @param transportOptions A GrpcTransportOptions object that defines the transport options for
     *     this client.
     */
    @Nonnull
    @Override
    public Builder setTransportOptions(@Nonnull TransportOptions transportOptions) {
      if (!(transportOptions instanceof GrpcTransportOptions)) {
        throw new IllegalArgumentException(
            "Only GRPC transport is allowed for " + API_SHORT_NAME + ".");
      }
      super.setTransportOptions(transportOptions);
      return this;
    }

    /**
     * Sets the {@link TransportChannelProvider} to use with this Firestore client.
     *
     * @param channelProvider A InstantiatingGrpcChannelProvider object that defines the transport
     *     provider for this client.
     */
    @Nonnull
    public Builder setChannelProvider(@Nonnull TransportChannelProvider channelProvider) {
      if (!(channelProvider instanceof InstantiatingGrpcChannelProvider)) {
        throw new IllegalArgumentException(
            "Only GRPC channels are allowed for " + API_SHORT_NAME + ".");
      }
      this.channelProvider = channelProvider;
      return this;
    }

    /**
     * Sets the {@link CredentialsProvider} to use with this Firestore client.
     *
     * @param credentialsProvider A CredentialsProvider object that defines the credential provider
     *     for this client.
     */
    @Nonnull
    public Builder setCredentialsProvider(@Nonnull CredentialsProvider credentialsProvider) {
      this.credentialsProvider = credentialsProvider;
      return this;
    }

    /**
     * Sets the emulator host to use with this Firestore client. The value passed to this method
     * will take precedent if the {@code FIRESTORE_EMULATOR_HOST} environment variable is also set.
     *
     * @param emulatorHost The Firestore emulator host to use with this client.
     */
    public Builder setEmulatorHost(@Nonnull String emulatorHost) {
      this.emulatorHost = emulatorHost;
      return this;
    }

    /**
     * Sets the database ID to use with this Firestore client.
     *
     * @param databaseId The Firestore database ID to use with this client.
     */
    public Builder setDatabaseId(@Nonnull String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    @Override
    @Nonnull
    public FirestoreOptions build() {
      if (this.credentials == null && this.credentialsProvider != null) {
        try {
          this.setCredentials(credentialsProvider.getCredentials());
        } catch (IOException e) {
          throw new RuntimeException("Failed to obtain credentials", e);
        }
      }

      // TODO(ehsann): hack to intercept the grpc channel calls.
      // this.channelProvider = getGrpcWithTelemetryChannelProviderBuilder().build();

      // Override credentials and channel provider if we are using the emulator.
      if (emulatorHost == null) {
        emulatorHost = System.getenv(FIRESTORE_EMULATOR_SYSTEM_VARIABLE);
      }
      if (emulatorHost != null) {
        // Try creating a host in order to validate that the host name is valid.
        try {
          String hostUrlString = "http://" + emulatorHost;
          URI.create(hostUrlString);
        } catch (Exception e) {
          throw new IllegalArgumentException(
              "Value: '"
                  + emulatorHost
                  + "' for property "
                  + FIRESTORE_EMULATOR_SYSTEM_VARIABLE
                  + " is not a valid host",
              e);
        }

        // Setting the channel provider to use plaintext turns off SSL.
        this.setChannelProvider(
            InstantiatingGrpcChannelProvider.newBuilder()
                .setEndpoint(emulatorHost)
                .setChannelConfigurator(ManagedChannelBuilder::usePlaintext)
                .build());
        // Use a `CredentialProvider` to match the Firebase Admin SDK, which prevents the Admin SDK
        // from overwriting the Emulator credentials.
        this.setCredentialsProvider(FixedCredentialsProvider.create(new EmulatorCredentials()));
      }

      return new FirestoreOptions(this);
    }
  }

  public static class EmulatorCredentials extends Credentials {
    private final Map<String, List<String>> HEADERS =
        ImmutableMap.of("Authorization", Collections.singletonList("Bearer owner"));

    @Override
    public String getAuthenticationType() {
      throw new IllegalArgumentException("Not supported");
    }

    @Override
    public Map<String, List<String>> getRequestMetadata(URI uri) {
      return HEADERS;
    }

    @Override
    public boolean hasRequestMetadata() {
      return true;
    }

    @Override
    public boolean hasRequestMetadataOnly() {
      return true;
    }

    @Override
    public void refresh() {}
  }

  void initOpenTelemetry() {
    try {
      // TODO(ehsann): Set proper project_id.
      // TraceExporter traceExporter =
      // TraceExporter.createWithConfiguration(TraceConfiguration.builder().setProjectId("MY_PROJECT").build());
      // TODO(ehsann): use OtlpGrpcSpanExporter
      //    OpenTelemetrySdk openTelemetrySdk =
      //        OpenTelemetrySdk.builder()
      //            .setTracerProvider(
      //                SdkTracerProvider.builder()
      //                    .setResource(resource)
      //                    .addSpanProcessor(

      System.out.println("Initializing GlobalOpenTelemetry inside the SDK...");
      // Include required service.name resource attribute on all spans and metrics
      Resource resource =
          Resource.getDefault().merge(Resource.builder().put(SERVICE_NAME, "Firestore").build());
      SpanExporter gcpTraceExporter = TraceExporter.createWithDefaultConfiguration();
      SpanProcessor gcpSpanProcessor = SimpleSpanProcessor.create(gcpTraceExporter);
      LoggingSpanExporter loggingSpanExporter = LoggingSpanExporter.create();
      SpanProcessor loggingSpanProcessor = SimpleSpanProcessor.create(loggingSpanExporter);

      OpenTelemetrySdk.builder()
          .setTracerProvider(
              SdkTracerProvider.builder()
                  .addSpanProcessor(gcpSpanProcessor)
                  .setResource(resource)
                  .addSpanProcessor(loggingSpanProcessor)
                  .build())
          // .setTracerProvider(SdkTracerProvider.builder().addSpanProcessor(loggingSpanProcessor).build())
          .buildAndRegisterGlobal();
    } catch (Exception e) {
      // During parallel testing, the OpenTelemetry SDK may get initialized multiple times which is
      // not allowed.
      Logger.getLogger("Firestore OpenTelemetry")
          .log(Level.INFO, "GlobalOpenTelemetry has already been configured.");
    }
  }

  @InternalApi("This class should only be extended within google-cloud-java")
  protected FirestoreOptions(Builder builder) {
    super(FirestoreFactory.class, FirestoreRpcFactory.class, builder, new FirestoreDefaults());

    String enableOpenTelemetryEnvVar = System.getenv(OPEN_TELEMETRY_ENV_VAR_NAME);
    if (enableOpenTelemetryEnvVar != null
        && (enableOpenTelemetryEnvVar.toLowerCase().equals("true")
            || enableOpenTelemetryEnvVar.toLowerCase().equals("on"))) {
      this.enableOpenTelemetry = true;
    }

    this.databaseId =
        builder.databaseId != null
            ? builder.databaseId
            : FirestoreDefaults.INSTANCE.getDatabaseId();

    if (builder.channelProvider == null) {
      // Intercept the grpc channel calls to add OpenTelemetry info if needed.
      if (this.enableOpenTelemetry) {
        initOpenTelemetry();
        this.channelProvider =
            GrpcTransportOptions.setUpChannelProvider(
                FirestoreSettings.defaultGrpcTransportProviderBuilder()
                    .setChannelConfigurator(new OtelGrpcChannelConfigurator()),
                this);
      } else {
        this.channelProvider =
            GrpcTransportOptions.setUpChannelProvider(
                FirestoreSettings.defaultGrpcTransportProviderBuilder(), this);
      }
    } else {
      this.channelProvider = builder.channelProvider;
    }

    this.credentialsProvider =
        builder.credentialsProvider != null
            ? builder.credentialsProvider
            : GrpcTransportOptions.setUpCredentialsProvider(this);

    this.emulatorHost = builder.emulatorHost;
  }

  private static class FirestoreDefaults implements ServiceDefaults<Firestore, FirestoreOptions> {
    private static final FirestoreDefaults INSTANCE = new FirestoreDefaults();

    private final String HOST = FirestoreSettings.getDefaultEndpoint();
    private final String DATABASE_ID = "(default)";
    private final TransportOptions TRANSPORT_OPTIONS = getDefaultTransportOptionsBuilder().build();

    @Nonnull
    String getHost() {
      return HOST;
    }

    @Nonnull
    String getDatabaseId() {
      return DATABASE_ID;
    }

    @Nonnull
    @Override
    public FirestoreFactory getDefaultServiceFactory() {
      return DefaultFirestoreFactory.INSTANCE;
    }

    @Nonnull
    @Override
    public FirestoreRpcFactory getDefaultRpcFactory() {
      return DefaultFirestoreRpcFactory.INSTANCE;
    }

    @Nonnull
    @Override
    public TransportOptions getDefaultTransportOptions() {
      return TRANSPORT_OPTIONS;
    }
  }

  @Nonnull
  public static GrpcTransportOptions.Builder getDefaultTransportOptionsBuilder() {
    return GrpcTransportOptions.newBuilder();
  }

  @Nonnull
  public static InstantiatingGrpcChannelProvider.Builder
      getDefaultTransportChannelProviderBuilder() {
    return FirestoreSettings.defaultGrpcTransportProviderBuilder();
  }

  @Nonnull
  public static InstantiatingGrpcChannelProvider.Builder
      getGrpcWithTelemetryChannelProviderBuilder() {
    return FirestoreSettings.defaultGrpcTransportProviderBuilder()
        .setChannelConfigurator(new OtelGrpcChannelConfigurator());
  }

  @Nonnull
  public static GoogleCredentialsProvider.Builder getDefaultCredentialsProviderBuilder() {
    return FirestoreSettings.defaultCredentialsProviderBuilder();
  }

  @Override
  protected Set<String> getScopes() {
    return SCOPES;
  }

  FirestoreRpc getFirestoreRpc() {
    return (FirestoreRpc) getRpc();
  }

  Map<String, String> getAttributesMap() {
    Map<String, String> result = new HashMap<>();
    result.put("settings.databaseId", getDatabaseId());
    result.put("settings.host", getHost());
    result.put("settings.channel.transportName", channelProvider.getTransportName());
    result.put(
        "settings.channel.needsCredentials", channelProvider.needsCredentials() ? "true" : "false");
    result.put(
        "settings.channel.needsEndpoint", channelProvider.needsEndpoint() ? "true" : "false");
    result.put("settings.channel.needsHeaders", channelProvider.needsHeaders() ? "true" : "false");
    result.put(
        "settings.channel.shouldAutoClose", channelProvider.shouldAutoClose() ? "true" : "false");
    result.put("settings.credentials.authenticationType", credentials.getAuthenticationType());
    result.put(
        "settings.retrySettings.initialRetryDelay",
        getRetrySettings().getInitialRetryDelay().toString());
    result.put(
        "settings.retrySettings.maxRetryDelay", getRetrySettings().getMaxRetryDelay().toString());
    result.put(
        "settings.retrySettings.retryDelayMultiplier",
        String.valueOf(getRetrySettings().getRetryDelayMultiplier()));
    result.put(
        "settings.retrySettings.maxAttempts", String.valueOf(getRetrySettings().getMaxAttempts()));
    result.put(
        "settings.retrySettings.initialRpcTimeout",
        getRetrySettings().getInitialRpcTimeout().toString());
    result.put(
        "settings.retrySettings.maxRpcTimeout", getRetrySettings().getMaxRpcTimeout().toString());
    result.put(
        "settings.retrySettings.rpcTimeoutMultiplier",
        String.valueOf(getRetrySettings().getRpcTimeoutMultiplier()));
    result.put(
        "settings.retrySettings.totalTimeout", getRetrySettings().getTotalTimeout().toString());
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirestoreOptions that = (FirestoreOptions) o;
    return Objects.equals(databaseId, that.databaseId)
        && Objects.equals(channelProvider, that.channelProvider)
        && baseEquals(that);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseId, channelProvider, baseHashCode());
  }

  @Nonnull
  @SuppressWarnings("unchecked")
  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Nonnull
  public static Builder newBuilder() {
    return new Builder();
  }
}
