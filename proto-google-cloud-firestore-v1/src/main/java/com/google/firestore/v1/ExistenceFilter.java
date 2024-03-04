// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/write.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

/**
 *
 *
 * <pre>
 * A digest of all the documents that match a given target.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.ExistenceFilter}
 */
public final class ExistenceFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.ExistenceFilter)
    ExistenceFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExistenceFilter.newBuilder() to construct.
  private ExistenceFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExistenceFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExistenceFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.v1.WriteProto
        .internal_static_google_firestore_v1_ExistenceFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.WriteProto
        .internal_static_google_firestore_v1_ExistenceFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.ExistenceFilter.class,
            com.google.firestore.v1.ExistenceFilter.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_ID_FIELD_NUMBER = 1;
  private int targetId_ = 0;
  /**
   *
   *
   * <pre>
   * The target ID to which this filter applies.
   * </pre>
   *
   * <code>int32 target_id = 1;</code>
   *
   * @return The targetId.
   */
  @java.lang.Override
  public int getTargetId() {
    return targetId_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_ = 0;
  /**
   *
   *
   * <pre>
   * The total count of documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id].
   *
   * If different from the count of documents in the client that match, the
   * client must manually determine which documents no longer match the target.
   *
   * The client can use the `unchanged_names` bloom filter to assist with
   * this determination by testing ALL the document names against the filter;
   * if the document name is NOT in the filter, it means the document no
   * longer matches the target.
   * </pre>
   *
   * <code>int32 count = 2;</code>
   *
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
  private com.google.firestore.v1.BloomFilter unchangedNames_;
  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   *
   * @return Whether the unchangedNames field is set.
   */
  @java.lang.Override
  public boolean hasUnchangedNames() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   *
   * @return The unchangedNames.
   */
  @java.lang.Override
  public com.google.firestore.v1.BloomFilter getUnchangedNames() {
    return unchangedNames_ == null
        ? com.google.firestore.v1.BloomFilter.getDefaultInstance()
        : unchangedNames_;
  }
  /**
   *
   *
   * <pre>
   * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
   * the resource names of ALL the documents that match
   * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   *
   * This bloom filter may be omitted at the server's discretion, such as if it
   * is deemed that the client will not make use of it or if it is too
   * computationally expensive to calculate or transmit. Clients must gracefully
   * handle this field being absent by falling back to the logic used before
   * this field existed; that is, re-add the target without a resume token to
   * figure out which documents in the client's cache are out of sync.
   * </pre>
   *
   * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
   */
  @java.lang.Override
  public com.google.firestore.v1.BloomFilterOrBuilder getUnchangedNamesOrBuilder() {
    return unchangedNames_ == null
        ? com.google.firestore.v1.BloomFilter.getDefaultInstance()
        : unchangedNames_;
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
    if (targetId_ != 0) {
      output.writeInt32(1, targetId_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getUnchangedNames());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetId_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, targetId_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, count_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUnchangedNames());
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
    if (!(obj instanceof com.google.firestore.v1.ExistenceFilter)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.ExistenceFilter other = (com.google.firestore.v1.ExistenceFilter) obj;

    if (getTargetId() != other.getTargetId()) return false;
    if (getCount() != other.getCount()) return false;
    if (hasUnchangedNames() != other.hasUnchangedNames()) return false;
    if (hasUnchangedNames()) {
      if (!getUnchangedNames().equals(other.getUnchangedNames())) return false;
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
    hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTargetId();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (hasUnchangedNames()) {
      hash = (37 * hash) + UNCHANGED_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getUnchangedNames().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.ExistenceFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.ExistenceFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.ExistenceFilter parseFrom(
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

  public static Builder newBuilder(com.google.firestore.v1.ExistenceFilter prototype) {
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
   * A digest of all the documents that match a given target.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.ExistenceFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.ExistenceFilter)
      com.google.firestore.v1.ExistenceFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_ExistenceFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_ExistenceFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.ExistenceFilter.class,
              com.google.firestore.v1.ExistenceFilter.Builder.class);
    }

    // Construct using com.google.firestore.v1.ExistenceFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUnchangedNamesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetId_ = 0;
      count_ = 0;
      unchangedNames_ = null;
      if (unchangedNamesBuilder_ != null) {
        unchangedNamesBuilder_.dispose();
        unchangedNamesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.v1.WriteProto
          .internal_static_google_firestore_v1_ExistenceFilter_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.ExistenceFilter getDefaultInstanceForType() {
      return com.google.firestore.v1.ExistenceFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.ExistenceFilter build() {
      com.google.firestore.v1.ExistenceFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.ExistenceFilter buildPartial() {
      com.google.firestore.v1.ExistenceFilter result =
          new com.google.firestore.v1.ExistenceFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.v1.ExistenceFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetId_ = targetId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unchangedNames_ =
            unchangedNamesBuilder_ == null ? unchangedNames_ : unchangedNamesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.firestore.v1.ExistenceFilter) {
        return mergeFrom((com.google.firestore.v1.ExistenceFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.ExistenceFilter other) {
      if (other == com.google.firestore.v1.ExistenceFilter.getDefaultInstance()) return this;
      if (other.getTargetId() != 0) {
        setTargetId(other.getTargetId());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.hasUnchangedNames()) {
        mergeUnchangedNames(other.getUnchangedNames());
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
            case 8:
              {
                targetId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                count_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getUnchangedNamesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int targetId_;
    /**
     *
     *
     * <pre>
     * The target ID to which this filter applies.
     * </pre>
     *
     * <code>int32 target_id = 1;</code>
     *
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }
    /**
     *
     *
     * <pre>
     * The target ID to which this filter applies.
     * </pre>
     *
     * <code>int32 target_id = 1;</code>
     *
     * @param value The targetId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetId(int value) {

      targetId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The target ID to which this filter applies.
     * </pre>
     *
     * <code>int32 target_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetId_ = 0;
      onChanged();
      return this;
    }

    private int count_;
    /**
     *
     *
     * <pre>
     * The total count of documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id].
     *
     * If different from the count of documents in the client that match, the
     * client must manually determine which documents no longer match the target.
     *
     * The client can use the `unchanged_names` bloom filter to assist with
     * this determination by testing ALL the document names against the filter;
     * if the document name is NOT in the filter, it means the document no
     * longer matches the target.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     *
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     *
     *
     * <pre>
     * The total count of documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id].
     *
     * If different from the count of documents in the client that match, the
     * client must manually determine which documents no longer match the target.
     *
     * The client can use the `unchanged_names` bloom filter to assist with
     * this determination by testing ALL the document names against the filter;
     * if the document name is NOT in the filter, it means the document no
     * longer matches the target.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     *
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total count of documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id].
     *
     * If different from the count of documents in the client that match, the
     * client must manually determine which documents no longer match the target.
     *
     * The client can use the `unchanged_names` bloom filter to assist with
     * this determination by testing ALL the document names against the filter;
     * if the document name is NOT in the filter, it means the document no
     * longer matches the target.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0;
      onChanged();
      return this;
    }

    private com.google.firestore.v1.BloomFilter unchangedNames_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.BloomFilter,
            com.google.firestore.v1.BloomFilter.Builder,
            com.google.firestore.v1.BloomFilterOrBuilder>
        unchangedNamesBuilder_;
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     *
     * @return Whether the unchangedNames field is set.
     */
    public boolean hasUnchangedNames() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     *
     * @return The unchangedNames.
     */
    public com.google.firestore.v1.BloomFilter getUnchangedNames() {
      if (unchangedNamesBuilder_ == null) {
        return unchangedNames_ == null
            ? com.google.firestore.v1.BloomFilter.getDefaultInstance()
            : unchangedNames_;
      } else {
        return unchangedNamesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public Builder setUnchangedNames(com.google.firestore.v1.BloomFilter value) {
      if (unchangedNamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        unchangedNames_ = value;
      } else {
        unchangedNamesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public Builder setUnchangedNames(com.google.firestore.v1.BloomFilter.Builder builderForValue) {
      if (unchangedNamesBuilder_ == null) {
        unchangedNames_ = builderForValue.build();
      } else {
        unchangedNamesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public Builder mergeUnchangedNames(com.google.firestore.v1.BloomFilter value) {
      if (unchangedNamesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && unchangedNames_ != null
            && unchangedNames_ != com.google.firestore.v1.BloomFilter.getDefaultInstance()) {
          getUnchangedNamesBuilder().mergeFrom(value);
        } else {
          unchangedNames_ = value;
        }
      } else {
        unchangedNamesBuilder_.mergeFrom(value);
      }
      if (unchangedNames_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public Builder clearUnchangedNames() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unchangedNames_ = null;
      if (unchangedNamesBuilder_ != null) {
        unchangedNamesBuilder_.dispose();
        unchangedNamesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public com.google.firestore.v1.BloomFilter.Builder getUnchangedNamesBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUnchangedNamesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    public com.google.firestore.v1.BloomFilterOrBuilder getUnchangedNamesOrBuilder() {
      if (unchangedNamesBuilder_ != null) {
        return unchangedNamesBuilder_.getMessageOrBuilder();
      } else {
        return unchangedNames_ == null
            ? com.google.firestore.v1.BloomFilter.getDefaultInstance()
            : unchangedNames_;
      }
    }
    /**
     *
     *
     * <pre>
     * A bloom filter that, despite its name, contains the UTF-8 byte encodings of
     * the resource names of ALL the documents that match
     * [target_id][google.firestore.v1.ExistenceFilter.target_id], in the form
     * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
     *
     * This bloom filter may be omitted at the server's discretion, such as if it
     * is deemed that the client will not make use of it or if it is too
     * computationally expensive to calculate or transmit. Clients must gracefully
     * handle this field being absent by falling back to the logic used before
     * this field existed; that is, re-add the target without a resume token to
     * figure out which documents in the client's cache are out of sync.
     * </pre>
     *
     * <code>.google.firestore.v1.BloomFilter unchanged_names = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.firestore.v1.BloomFilter,
            com.google.firestore.v1.BloomFilter.Builder,
            com.google.firestore.v1.BloomFilterOrBuilder>
        getUnchangedNamesFieldBuilder() {
      if (unchangedNamesBuilder_ == null) {
        unchangedNamesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.firestore.v1.BloomFilter,
                com.google.firestore.v1.BloomFilter.Builder,
                com.google.firestore.v1.BloomFilterOrBuilder>(
                getUnchangedNames(), getParentForChildren(), isClean());
        unchangedNames_ = null;
      }
      return unchangedNamesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.firestore.v1.ExistenceFilter)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.ExistenceFilter)
  private static final com.google.firestore.v1.ExistenceFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.ExistenceFilter();
  }

  public static com.google.firestore.v1.ExistenceFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExistenceFilter> PARSER =
      new com.google.protobuf.AbstractParser<ExistenceFilter>() {
        @java.lang.Override
        public ExistenceFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExistenceFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExistenceFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.ExistenceFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
