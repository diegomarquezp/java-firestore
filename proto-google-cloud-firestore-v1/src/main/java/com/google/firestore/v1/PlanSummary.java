/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.3
package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * Planning phase information for the query.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.PlanSummary}
 */
public final class PlanSummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.PlanSummary)
    PlanSummaryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PlanSummary.newBuilder() to construct.
  private PlanSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PlanSummary() {
    indexesUsed_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PlanSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.QueryProfileProto
        .internal_static_google_firestore_v1_PlanSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.QueryProfileProto
        .internal_static_google_firestore_v1_PlanSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.PlanSummary.class,
            com.google.firestore.v1.PlanSummary.Builder.class);
  }

  public static final int INDEXES_USED_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Struct> indexesUsed_;
  /**
   *
   *
   * <pre>
   * The indexes selected for the query. For example:
   *  [
   *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
   *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
   *  ]
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Struct> getIndexesUsedList() {
    return indexesUsed_;
  }
  /**
   *
   *
   * <pre>
   * The indexes selected for the query. For example:
   *  [
   *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
   *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
   *  ]
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.StructOrBuilder>
      getIndexesUsedOrBuilderList() {
    return indexesUsed_;
  }
  /**
   *
   *
   * <pre>
   * The indexes selected for the query. For example:
   *  [
   *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
   *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
   *  ]
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
   */
  @java.lang.Override
  public int getIndexesUsedCount() {
    return indexesUsed_.size();
  }
  /**
   *
   *
   * <pre>
   * The indexes selected for the query. For example:
   *  [
   *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
   *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
   *  ]
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Struct getIndexesUsed(int index) {
    return indexesUsed_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The indexes selected for the query. For example:
   *  [
   *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
   *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
   *  ]
   * </pre>
   *
   * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getIndexesUsedOrBuilder(int index) {
    return indexesUsed_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < indexesUsed_.size(); i++) {
      output.writeMessage(1, indexesUsed_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < indexesUsed_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, indexesUsed_.get(i));
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
    if (!(obj instanceof com.google.firestore.v1.PlanSummary)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.PlanSummary other = (com.google.firestore.v1.PlanSummary) obj;

    if (!getIndexesUsedList().equals(other.getIndexesUsedList())) return false;
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
    if (getIndexesUsedCount() > 0) {
      hash = (37 * hash) + INDEXES_USED_FIELD_NUMBER;
      hash = (53 * hash) + getIndexesUsedList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.PlanSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.PlanSummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.PlanSummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.v1.PlanSummary prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Planning phase information for the query.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.PlanSummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.PlanSummary)
      com.google.firestore.v1.PlanSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.QueryProfileProto
          .internal_static_google_firestore_v1_PlanSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.QueryProfileProto
          .internal_static_google_firestore_v1_PlanSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.PlanSummary.class,
              com.google.firestore.v1.PlanSummary.Builder.class);
    }

    // Construct using com.google.firestore.v1.PlanSummary.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (indexesUsedBuilder_ == null) {
        indexesUsed_ = java.util.Collections.emptyList();
      } else {
        indexesUsed_ = null;
        indexesUsedBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.QueryProfileProto
          .internal_static_google_firestore_v1_PlanSummary_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.PlanSummary getDefaultInstanceForType() {
      return com.google.firestore.v1.PlanSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.PlanSummary build() {
      com.google.firestore.v1.PlanSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.PlanSummary buildPartial() {
      com.google.firestore.v1.PlanSummary result = new com.google.firestore.v1.PlanSummary(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.firestore.v1.PlanSummary result) {
      if (indexesUsedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          indexesUsed_ = java.util.Collections.unmodifiableList(indexesUsed_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.indexesUsed_ = indexesUsed_;
      } else {
        result.indexesUsed_ = indexesUsedBuilder_.build();
      }
    }

    private void buildPartial0(com.google.firestore.v1.PlanSummary result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.v1.PlanSummary) {
        return mergeFrom((com.google.firestore.v1.PlanSummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.PlanSummary other) {
      if (other == com.google.firestore.v1.PlanSummary.getDefaultInstance()) return this;
      if (indexesUsedBuilder_ == null) {
        if (!other.indexesUsed_.isEmpty()) {
          if (indexesUsed_.isEmpty()) {
            indexesUsed_ = other.indexesUsed_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIndexesUsedIsMutable();
            indexesUsed_.addAll(other.indexesUsed_);
          }
          onChanged();
        }
      } else {
        if (!other.indexesUsed_.isEmpty()) {
          if (indexesUsedBuilder_.isEmpty()) {
            indexesUsedBuilder_.dispose();
            indexesUsedBuilder_ = null;
            indexesUsed_ = other.indexesUsed_;
            bitField0_ = (bitField0_ & ~0x00000001);
            indexesUsedBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIndexesUsedFieldBuilder()
                    : null;
          } else {
            indexesUsedBuilder_.addAllMessages(other.indexesUsed_);
          }
        }
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
            case 10:
              {
                com.google.protobuf.Struct m =
                    input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
                if (indexesUsedBuilder_ == null) {
                  ensureIndexesUsedIsMutable();
                  indexesUsed_.add(m);
                } else {
                  indexesUsedBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
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

    private java.util.List<com.google.protobuf.Struct> indexesUsed_ =
        java.util.Collections.emptyList();

    private void ensureIndexesUsedIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        indexesUsed_ = new java.util.ArrayList<com.google.protobuf.Struct>(indexesUsed_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        indexesUsedBuilder_;

    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public java.util.List<com.google.protobuf.Struct> getIndexesUsedList() {
      if (indexesUsedBuilder_ == null) {
        return java.util.Collections.unmodifiableList(indexesUsed_);
      } else {
        return indexesUsedBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public int getIndexesUsedCount() {
      if (indexesUsedBuilder_ == null) {
        return indexesUsed_.size();
      } else {
        return indexesUsedBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public com.google.protobuf.Struct getIndexesUsed(int index) {
      if (indexesUsedBuilder_ == null) {
        return indexesUsed_.get(index);
      } else {
        return indexesUsedBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder setIndexesUsed(int index, com.google.protobuf.Struct value) {
      if (indexesUsedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesUsedIsMutable();
        indexesUsed_.set(index, value);
        onChanged();
      } else {
        indexesUsedBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder setIndexesUsed(int index, com.google.protobuf.Struct.Builder builderForValue) {
      if (indexesUsedBuilder_ == null) {
        ensureIndexesUsedIsMutable();
        indexesUsed_.set(index, builderForValue.build());
        onChanged();
      } else {
        indexesUsedBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder addIndexesUsed(com.google.protobuf.Struct value) {
      if (indexesUsedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesUsedIsMutable();
        indexesUsed_.add(value);
        onChanged();
      } else {
        indexesUsedBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder addIndexesUsed(int index, com.google.protobuf.Struct value) {
      if (indexesUsedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesUsedIsMutable();
        indexesUsed_.add(index, value);
        onChanged();
      } else {
        indexesUsedBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder addIndexesUsed(com.google.protobuf.Struct.Builder builderForValue) {
      if (indexesUsedBuilder_ == null) {
        ensureIndexesUsedIsMutable();
        indexesUsed_.add(builderForValue.build());
        onChanged();
      } else {
        indexesUsedBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder addIndexesUsed(int index, com.google.protobuf.Struct.Builder builderForValue) {
      if (indexesUsedBuilder_ == null) {
        ensureIndexesUsedIsMutable();
        indexesUsed_.add(index, builderForValue.build());
        onChanged();
      } else {
        indexesUsedBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder addAllIndexesUsed(
        java.lang.Iterable<? extends com.google.protobuf.Struct> values) {
      if (indexesUsedBuilder_ == null) {
        ensureIndexesUsedIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, indexesUsed_);
        onChanged();
      } else {
        indexesUsedBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder clearIndexesUsed() {
      if (indexesUsedBuilder_ == null) {
        indexesUsed_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        indexesUsedBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public Builder removeIndexesUsed(int index) {
      if (indexesUsedBuilder_ == null) {
        ensureIndexesUsedIsMutable();
        indexesUsed_.remove(index);
        onChanged();
      } else {
        indexesUsedBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public com.google.protobuf.Struct.Builder getIndexesUsedBuilder(int index) {
      return getIndexesUsedFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public com.google.protobuf.StructOrBuilder getIndexesUsedOrBuilder(int index) {
      if (indexesUsedBuilder_ == null) {
        return indexesUsed_.get(index);
      } else {
        return indexesUsedBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public java.util.List<? extends com.google.protobuf.StructOrBuilder>
        getIndexesUsedOrBuilderList() {
      if (indexesUsedBuilder_ != null) {
        return indexesUsedBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(indexesUsed_);
      }
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public com.google.protobuf.Struct.Builder addIndexesUsedBuilder() {
      return getIndexesUsedFieldBuilder()
          .addBuilder(com.google.protobuf.Struct.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public com.google.protobuf.Struct.Builder addIndexesUsedBuilder(int index) {
      return getIndexesUsedFieldBuilder()
          .addBuilder(index, com.google.protobuf.Struct.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The indexes selected for the query. For example:
     *  [
     *    {"query_scope": "Collection", "properties": "(foo ASC, __name__ ASC)"},
     *    {"query_scope": "Collection", "properties": "(bar ASC, __name__ ASC)"}
     *  ]
     * </pre>
     *
     * <code>repeated .google.protobuf.Struct indexes_used = 1;</code>
     */
    public java.util.List<com.google.protobuf.Struct.Builder> getIndexesUsedBuilderList() {
      return getIndexesUsedFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getIndexesUsedFieldBuilder() {
      if (indexesUsedBuilder_ == null) {
        indexesUsedBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                indexesUsed_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        indexesUsed_ = null;
      }
      return indexesUsedBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.PlanSummary)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.PlanSummary)
  private static final com.google.firestore.v1.PlanSummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.PlanSummary();
  }

  public static com.google.firestore.v1.PlanSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlanSummary> PARSER =
      new com.google.protobuf.AbstractParser<PlanSummary>() {
        @java.lang.Override
        public PlanSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlanSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlanSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.PlanSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
