// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query_profile.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

/**
 * <pre>
 * Explain metrics for the query.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.ExplainMetrics}
 */
public final class ExplainMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.ExplainMetrics)
    ExplainMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExplainMetrics.newBuilder() to construct.
  private ExplainMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExplainMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExplainMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.v1.QueryProfileProto.internal_static_google_firestore_v1_ExplainMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.QueryProfileProto.internal_static_google_firestore_v1_ExplainMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.ExplainMetrics.class, com.google.firestore.v1.ExplainMetrics.Builder.class);
  }

  private int bitField0_;
  public static final int PLAN_SUMMARY_FIELD_NUMBER = 1;
  private com.google.firestore.v1.PlanSummary planSummary_;
  /**
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   * @return Whether the planSummary field is set.
   */
  @java.lang.Override
  public boolean hasPlanSummary() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   * @return The planSummary.
   */
  @java.lang.Override
  public com.google.firestore.v1.PlanSummary getPlanSummary() {
    return planSummary_ == null ? com.google.firestore.v1.PlanSummary.getDefaultInstance() : planSummary_;
  }
  /**
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.PlanSummaryOrBuilder getPlanSummaryOrBuilder() {
    return planSummary_ == null ? com.google.firestore.v1.PlanSummary.getDefaultInstance() : planSummary_;
  }

  public static final int EXECUTION_STATS_FIELD_NUMBER = 2;
  private com.google.firestore.v1.ExecutionStats executionStats_;
  /**
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   * @return Whether the executionStats field is set.
   */
  @java.lang.Override
  public boolean hasExecutionStats() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   * @return The executionStats.
   */
  @java.lang.Override
  public com.google.firestore.v1.ExecutionStats getExecutionStats() {
    return executionStats_ == null ? com.google.firestore.v1.ExecutionStats.getDefaultInstance() : executionStats_;
  }
  /**
   * <pre>
   * Aggregated stats from the execution of the query. Only present when
   * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
   * to true.
   * </pre>
   *
   * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.ExecutionStatsOrBuilder getExecutionStatsOrBuilder() {
    return executionStats_ == null ? com.google.firestore.v1.ExecutionStats.getDefaultInstance() : executionStats_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPlanSummary());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getExecutionStats());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlanSummary());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExecutionStats());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.firestore.v1.ExplainMetrics)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.ExplainMetrics other = (com.google.firestore.v1.ExplainMetrics) obj;

    if (hasPlanSummary() != other.hasPlanSummary()) return false;
    if (hasPlanSummary()) {
      if (!getPlanSummary()
          .equals(other.getPlanSummary())) return false;
    }
    if (hasExecutionStats() != other.hasExecutionStats()) return false;
    if (hasExecutionStats()) {
      if (!getExecutionStats()
          .equals(other.getExecutionStats())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPlanSummary()) {
      hash = (37 * hash) + PLAN_SUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getPlanSummary().hashCode();
    }
    if (hasExecutionStats()) {
      hash = (37 * hash) + EXECUTION_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getExecutionStats().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.ExplainMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.ExplainMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.ExplainMetrics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.firestore.v1.ExplainMetrics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Explain metrics for the query.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.ExplainMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.ExplainMetrics)
      com.google.firestore.v1.ExplainMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.v1.QueryProfileProto.internal_static_google_firestore_v1_ExplainMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.QueryProfileProto.internal_static_google_firestore_v1_ExplainMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.ExplainMetrics.class, com.google.firestore.v1.ExplainMetrics.Builder.class);
    }

    // Construct using com.google.firestore.v1.ExplainMetrics.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPlanSummaryFieldBuilder();
        getExecutionStatsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      planSummary_ = null;
      if (planSummaryBuilder_ != null) {
        planSummaryBuilder_.dispose();
        planSummaryBuilder_ = null;
      }
      executionStats_ = null;
      if (executionStatsBuilder_ != null) {
        executionStatsBuilder_.dispose();
        executionStatsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.v1.QueryProfileProto.internal_static_google_firestore_v1_ExplainMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.ExplainMetrics getDefaultInstanceForType() {
      return com.google.firestore.v1.ExplainMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.ExplainMetrics build() {
      com.google.firestore.v1.ExplainMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.ExplainMetrics buildPartial() {
      com.google.firestore.v1.ExplainMetrics result = new com.google.firestore.v1.ExplainMetrics(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.v1.ExplainMetrics result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.planSummary_ = planSummaryBuilder_ == null
            ? planSummary_
            : planSummaryBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.executionStats_ = executionStatsBuilder_ == null
            ? executionStats_
            : executionStatsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.ExplainMetrics) {
        return mergeFrom((com.google.firestore.v1.ExplainMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.ExplainMetrics other) {
      if (other == com.google.firestore.v1.ExplainMetrics.getDefaultInstance()) return this;
      if (other.hasPlanSummary()) {
        mergePlanSummary(other.getPlanSummary());
      }
      if (other.hasExecutionStats()) {
        mergeExecutionStats(other.getExecutionStats());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getPlanSummaryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExecutionStatsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.firestore.v1.PlanSummary planSummary_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firestore.v1.PlanSummary, com.google.firestore.v1.PlanSummary.Builder, com.google.firestore.v1.PlanSummaryOrBuilder> planSummaryBuilder_;
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     * @return Whether the planSummary field is set.
     */
    public boolean hasPlanSummary() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     * @return The planSummary.
     */
    public com.google.firestore.v1.PlanSummary getPlanSummary() {
      if (planSummaryBuilder_ == null) {
        return planSummary_ == null ? com.google.firestore.v1.PlanSummary.getDefaultInstance() : planSummary_;
      } else {
        return planSummaryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public Builder setPlanSummary(com.google.firestore.v1.PlanSummary value) {
      if (planSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        planSummary_ = value;
      } else {
        planSummaryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public Builder setPlanSummary(
        com.google.firestore.v1.PlanSummary.Builder builderForValue) {
      if (planSummaryBuilder_ == null) {
        planSummary_ = builderForValue.build();
      } else {
        planSummaryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public Builder mergePlanSummary(com.google.firestore.v1.PlanSummary value) {
      if (planSummaryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          planSummary_ != null &&
          planSummary_ != com.google.firestore.v1.PlanSummary.getDefaultInstance()) {
          getPlanSummaryBuilder().mergeFrom(value);
        } else {
          planSummary_ = value;
        }
      } else {
        planSummaryBuilder_.mergeFrom(value);
      }
      if (planSummary_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public Builder clearPlanSummary() {
      bitField0_ = (bitField0_ & ~0x00000001);
      planSummary_ = null;
      if (planSummaryBuilder_ != null) {
        planSummaryBuilder_.dispose();
        planSummaryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public com.google.firestore.v1.PlanSummary.Builder getPlanSummaryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPlanSummaryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    public com.google.firestore.v1.PlanSummaryOrBuilder getPlanSummaryOrBuilder() {
      if (planSummaryBuilder_ != null) {
        return planSummaryBuilder_.getMessageOrBuilder();
      } else {
        return planSummary_ == null ?
            com.google.firestore.v1.PlanSummary.getDefaultInstance() : planSummary_;
      }
    }
    /**
     * <pre>
     * Planning phase information for the query.
     * </pre>
     *
     * <code>.google.firestore.v1.PlanSummary plan_summary = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firestore.v1.PlanSummary, com.google.firestore.v1.PlanSummary.Builder, com.google.firestore.v1.PlanSummaryOrBuilder> 
        getPlanSummaryFieldBuilder() {
      if (planSummaryBuilder_ == null) {
        planSummaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.PlanSummary, com.google.firestore.v1.PlanSummary.Builder, com.google.firestore.v1.PlanSummaryOrBuilder>(
                getPlanSummary(),
                getParentForChildren(),
                isClean());
        planSummary_ = null;
      }
      return planSummaryBuilder_;
    }

    private com.google.firestore.v1.ExecutionStats executionStats_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firestore.v1.ExecutionStats, com.google.firestore.v1.ExecutionStats.Builder, com.google.firestore.v1.ExecutionStatsOrBuilder> executionStatsBuilder_;
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     * @return Whether the executionStats field is set.
     */
    public boolean hasExecutionStats() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     * @return The executionStats.
     */
    public com.google.firestore.v1.ExecutionStats getExecutionStats() {
      if (executionStatsBuilder_ == null) {
        return executionStats_ == null ? com.google.firestore.v1.ExecutionStats.getDefaultInstance() : executionStats_;
      } else {
        return executionStatsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public Builder setExecutionStats(com.google.firestore.v1.ExecutionStats value) {
      if (executionStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executionStats_ = value;
      } else {
        executionStatsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public Builder setExecutionStats(
        com.google.firestore.v1.ExecutionStats.Builder builderForValue) {
      if (executionStatsBuilder_ == null) {
        executionStats_ = builderForValue.build();
      } else {
        executionStatsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public Builder mergeExecutionStats(com.google.firestore.v1.ExecutionStats value) {
      if (executionStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          executionStats_ != null &&
          executionStats_ != com.google.firestore.v1.ExecutionStats.getDefaultInstance()) {
          getExecutionStatsBuilder().mergeFrom(value);
        } else {
          executionStats_ = value;
        }
      } else {
        executionStatsBuilder_.mergeFrom(value);
      }
      if (executionStats_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public Builder clearExecutionStats() {
      bitField0_ = (bitField0_ & ~0x00000002);
      executionStats_ = null;
      if (executionStatsBuilder_ != null) {
        executionStatsBuilder_.dispose();
        executionStatsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public com.google.firestore.v1.ExecutionStats.Builder getExecutionStatsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExecutionStatsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    public com.google.firestore.v1.ExecutionStatsOrBuilder getExecutionStatsOrBuilder() {
      if (executionStatsBuilder_ != null) {
        return executionStatsBuilder_.getMessageOrBuilder();
      } else {
        return executionStats_ == null ?
            com.google.firestore.v1.ExecutionStats.getDefaultInstance() : executionStats_;
      }
    }
    /**
     * <pre>
     * Aggregated stats from the execution of the query. Only present when
     * [ExplainOptions.analyze][google.firestore.v1.ExplainOptions.analyze] is set
     * to true.
     * </pre>
     *
     * <code>.google.firestore.v1.ExecutionStats execution_stats = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.firestore.v1.ExecutionStats, com.google.firestore.v1.ExecutionStats.Builder, com.google.firestore.v1.ExecutionStatsOrBuilder> 
        getExecutionStatsFieldBuilder() {
      if (executionStatsBuilder_ == null) {
        executionStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.ExecutionStats, com.google.firestore.v1.ExecutionStats.Builder, com.google.firestore.v1.ExecutionStatsOrBuilder>(
                getExecutionStats(),
                getParentForChildren(),
                isClean());
        executionStats_ = null;
      }
      return executionStatsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.firestore.v1.ExplainMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.ExplainMetrics)
  private static final com.google.firestore.v1.ExplainMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.ExplainMetrics();
  }

  public static com.google.firestore.v1.ExplainMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplainMetrics>
      PARSER = new com.google.protobuf.AbstractParser<ExplainMetrics>() {
    @java.lang.Override
    public ExplainMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ExplainMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplainMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.ExplainMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

