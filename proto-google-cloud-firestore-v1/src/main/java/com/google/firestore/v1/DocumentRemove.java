// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/write.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

/**
 * <pre>
 * A [Document][google.firestore.v1.Document] has been removed from the view of
 * the targets.
 *
 * Sent if the document is no longer relevant to a target and is out of view.
 * Can be sent instead of a DocumentDelete or a DocumentChange if the server
 * can not send the new value of the document.
 *
 * Multiple [DocumentRemove][google.firestore.v1.DocumentRemove] messages may be
 * returned for the same logical write or delete, if multiple targets are
 * affected.
 * </pre>
 *
 * Protobuf type {@code google.firestore.v1.DocumentRemove}
 */
public final class DocumentRemove extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.firestore.v1.DocumentRemove)
    DocumentRemoveOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentRemove.newBuilder() to construct.
  private DocumentRemove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentRemove() {
    document_ = "";
    removedTargetIds_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentRemove();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.firestore.v1.WriteProto.internal_static_google_firestore_v1_DocumentRemove_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.v1.WriteProto.internal_static_google_firestore_v1_DocumentRemove_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.v1.DocumentRemove.class, com.google.firestore.v1.DocumentRemove.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object document_ = "";
  /**
   * <pre>
   * The resource name of the [Document][google.firestore.v1.Document] that has
   * gone out of view.
   * </pre>
   *
   * <code>string document = 1;</code>
   * @return The document.
   */
  @java.lang.Override
  public java.lang.String getDocument() {
    java.lang.Object ref = document_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      document_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the [Document][google.firestore.v1.Document] that has
   * gone out of view.
   * </pre>
   *
   * <code>string document = 1;</code>
   * @return The bytes for document.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDocumentBytes() {
    java.lang.Object ref = document_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      document_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList removedTargetIds_ =
      emptyIntList();
  /**
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   * @return A list containing the removedTargetIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getRemovedTargetIdsList() {
    return removedTargetIds_;
  }
  /**
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   * @return The count of removedTargetIds.
   */
  public int getRemovedTargetIdsCount() {
    return removedTargetIds_.size();
  }
  /**
   * <pre>
   * A set of target IDs for targets that previously matched this document.
   * </pre>
   *
   * <code>repeated int32 removed_target_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The removedTargetIds at the given index.
   */
  public int getRemovedTargetIds(int index) {
    return removedTargetIds_.getInt(index);
  }
  private int removedTargetIdsMemoizedSerializedSize = -1;

  public static final int READ_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp readTime_;
  /**
   * <pre>
   * The read timestamp at which the remove was observed.
   *
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return Whether the readTime field is set.
   */
  @java.lang.Override
  public boolean hasReadTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The read timestamp at which the remove was observed.
   *
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return The readTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getReadTime() {
    return readTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : readTime_;
  }
  /**
   * <pre>
   * The read timestamp at which the remove was observed.
   *
   * Greater or equal to the `commit_time` of the change/delete/remove.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder() {
    return readTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : readTime_;
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(document_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, document_);
    }
    if (getRemovedTargetIdsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(removedTargetIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < removedTargetIds_.size(); i++) {
      output.writeInt32NoTag(removedTargetIds_.getInt(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getReadTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(document_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, document_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < removedTargetIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(removedTargetIds_.getInt(i));
      }
      size += dataSize;
      if (!getRemovedTargetIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      removedTargetIdsMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getReadTime());
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
    if (!(obj instanceof com.google.firestore.v1.DocumentRemove)) {
      return super.equals(obj);
    }
    com.google.firestore.v1.DocumentRemove other = (com.google.firestore.v1.DocumentRemove) obj;

    if (!getDocument()
        .equals(other.getDocument())) return false;
    if (!getRemovedTargetIdsList()
        .equals(other.getRemovedTargetIdsList())) return false;
    if (hasReadTime() != other.hasReadTime()) return false;
    if (hasReadTime()) {
      if (!getReadTime()
          .equals(other.getReadTime())) return false;
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
    hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
    hash = (53 * hash) + getDocument().hashCode();
    if (getRemovedTargetIdsCount() > 0) {
      hash = (37 * hash) + REMOVED_TARGET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getRemovedTargetIdsList().hashCode();
    }
    if (hasReadTime()) {
      hash = (37 * hash) + READ_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getReadTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.v1.DocumentRemove parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.v1.DocumentRemove parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.v1.DocumentRemove parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.firestore.v1.DocumentRemove parseFrom(
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
  public static Builder newBuilder(com.google.firestore.v1.DocumentRemove prototype) {
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
   * A [Document][google.firestore.v1.Document] has been removed from the view of
   * the targets.
   *
   * Sent if the document is no longer relevant to a target and is out of view.
   * Can be sent instead of a DocumentDelete or a DocumentChange if the server
   * can not send the new value of the document.
   *
   * Multiple [DocumentRemove][google.firestore.v1.DocumentRemove] messages may be
   * returned for the same logical write or delete, if multiple targets are
   * affected.
   * </pre>
   *
   * Protobuf type {@code google.firestore.v1.DocumentRemove}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.firestore.v1.DocumentRemove)
      com.google.firestore.v1.DocumentRemoveOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.firestore.v1.WriteProto.internal_static_google_firestore_v1_DocumentRemove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.v1.WriteProto.internal_static_google_firestore_v1_DocumentRemove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.v1.DocumentRemove.class, com.google.firestore.v1.DocumentRemove.Builder.class);
    }

    // Construct using com.google.firestore.v1.DocumentRemove.newBuilder()
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
        getReadTimeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      document_ = "";
      removedTargetIds_ = emptyIntList();
      readTime_ = null;
      if (readTimeBuilder_ != null) {
        readTimeBuilder_.dispose();
        readTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.firestore.v1.WriteProto.internal_static_google_firestore_v1_DocumentRemove_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentRemove getDefaultInstanceForType() {
      return com.google.firestore.v1.DocumentRemove.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentRemove build() {
      com.google.firestore.v1.DocumentRemove result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.v1.DocumentRemove buildPartial() {
      com.google.firestore.v1.DocumentRemove result = new com.google.firestore.v1.DocumentRemove(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.firestore.v1.DocumentRemove result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.document_ = document_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        removedTargetIds_.makeImmutable();
        result.removedTargetIds_ = removedTargetIds_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.readTime_ = readTimeBuilder_ == null
            ? readTime_
            : readTimeBuilder_.build();
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
      if (other instanceof com.google.firestore.v1.DocumentRemove) {
        return mergeFrom((com.google.firestore.v1.DocumentRemove)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.v1.DocumentRemove other) {
      if (other == com.google.firestore.v1.DocumentRemove.getDefaultInstance()) return this;
      if (!other.getDocument().isEmpty()) {
        document_ = other.document_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.removedTargetIds_.isEmpty()) {
        if (removedTargetIds_.isEmpty()) {
          removedTargetIds_ = other.removedTargetIds_;
          removedTargetIds_.makeImmutable();
          bitField0_ |= 0x00000002;
        } else {
          ensureRemovedTargetIdsIsMutable();
          removedTargetIds_.addAll(other.removedTargetIds_);
        }
        onChanged();
      }
      if (other.hasReadTime()) {
        mergeReadTime(other.getReadTime());
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
              document_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              int v = input.readInt32();
              ensureRemovedTargetIdsIsMutable();
              removedTargetIds_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureRemovedTargetIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                removedTargetIds_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
            case 34: {
              input.readMessage(
                  getReadTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private java.lang.Object document_ = "";
    /**
     * <pre>
     * The resource name of the [Document][google.firestore.v1.Document] that has
     * gone out of view.
     * </pre>
     *
     * <code>string document = 1;</code>
     * @return The document.
     */
    public java.lang.String getDocument() {
      java.lang.Object ref = document_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        document_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the [Document][google.firestore.v1.Document] that has
     * gone out of view.
     * </pre>
     *
     * <code>string document = 1;</code>
     * @return The bytes for document.
     */
    public com.google.protobuf.ByteString
        getDocumentBytes() {
      java.lang.Object ref = document_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        document_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the [Document][google.firestore.v1.Document] that has
     * gone out of view.
     * </pre>
     *
     * <code>string document = 1;</code>
     * @param value The document to set.
     * @return This builder for chaining.
     */
    public Builder setDocument(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      document_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the [Document][google.firestore.v1.Document] that has
     * gone out of view.
     * </pre>
     *
     * <code>string document = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDocument() {
      document_ = getDefaultInstance().getDocument();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the [Document][google.firestore.v1.Document] that has
     * gone out of view.
     * </pre>
     *
     * <code>string document = 1;</code>
     * @param value The bytes for document to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      document_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList removedTargetIds_ = emptyIntList();
    private void ensureRemovedTargetIdsIsMutable() {
      if (!removedTargetIds_.isModifiable()) {
        removedTargetIds_ = makeMutableCopy(removedTargetIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @return A list containing the removedTargetIds.
     */
    public java.util.List<java.lang.Integer>
        getRemovedTargetIdsList() {
      removedTargetIds_.makeImmutable();
      return removedTargetIds_;
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @return The count of removedTargetIds.
     */
    public int getRemovedTargetIdsCount() {
      return removedTargetIds_.size();
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The removedTargetIds at the given index.
     */
    public int getRemovedTargetIds(int index) {
      return removedTargetIds_.getInt(index);
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The removedTargetIds to set.
     * @return This builder for chaining.
     */
    public Builder setRemovedTargetIds(
        int index, int value) {

      ensureRemovedTargetIdsIsMutable();
      removedTargetIds_.setInt(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @param value The removedTargetIds to add.
     * @return This builder for chaining.
     */
    public Builder addRemovedTargetIds(int value) {

      ensureRemovedTargetIdsIsMutable();
      removedTargetIds_.addInt(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @param values The removedTargetIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllRemovedTargetIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRemovedTargetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, removedTargetIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A set of target IDs for targets that previously matched this document.
     * </pre>
     *
     * <code>repeated int32 removed_target_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemovedTargetIds() {
      removedTargetIds_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp readTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> readTimeBuilder_;
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     * @return Whether the readTime field is set.
     */
    public boolean hasReadTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     * @return The readTime.
     */
    public com.google.protobuf.Timestamp getReadTime() {
      if (readTimeBuilder_ == null) {
        return readTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : readTime_;
      } else {
        return readTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public Builder setReadTime(com.google.protobuf.Timestamp value) {
      if (readTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readTime_ = value;
      } else {
        readTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public Builder setReadTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (readTimeBuilder_ == null) {
        readTime_ = builderForValue.build();
      } else {
        readTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public Builder mergeReadTime(com.google.protobuf.Timestamp value) {
      if (readTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          readTime_ != null &&
          readTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getReadTimeBuilder().mergeFrom(value);
        } else {
          readTime_ = value;
        }
      } else {
        readTimeBuilder_.mergeFrom(value);
      }
      if (readTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public Builder clearReadTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      readTime_ = null;
      if (readTimeBuilder_ != null) {
        readTimeBuilder_.dispose();
        readTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getReadTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getReadTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder() {
      if (readTimeBuilder_ != null) {
        return readTimeBuilder_.getMessageOrBuilder();
      } else {
        return readTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : readTime_;
      }
    }
    /**
     * <pre>
     * The read timestamp at which the remove was observed.
     *
     * Greater or equal to the `commit_time` of the change/delete/remove.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp read_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getReadTimeFieldBuilder() {
      if (readTimeBuilder_ == null) {
        readTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getReadTime(),
                getParentForChildren(),
                isClean());
        readTime_ = null;
      }
      return readTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.firestore.v1.DocumentRemove)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.v1.DocumentRemove)
  private static final com.google.firestore.v1.DocumentRemove DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.firestore.v1.DocumentRemove();
  }

  public static com.google.firestore.v1.DocumentRemove getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentRemove>
      PARSER = new com.google.protobuf.AbstractParser<DocumentRemove>() {
    @java.lang.Override
    public DocumentRemove parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentRemove> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentRemove> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.v1.DocumentRemove getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

