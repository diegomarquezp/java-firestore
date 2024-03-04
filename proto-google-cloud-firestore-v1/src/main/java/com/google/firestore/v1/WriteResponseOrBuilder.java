// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface WriteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.WriteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the stream.
   * Only set on the first message, when a new stream was created.
   * </pre>
   *
   * <code>string stream_id = 1;</code>
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   * <pre>
   * The ID of the stream.
   * Only set on the first message, when a new stream was created.
   * </pre>
   *
   * <code>string stream_id = 1;</code>
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString
      getStreamIdBytes();

  /**
   * <pre>
   * A token that represents the position of this response in the stream.
   * This can be used by a client to resume the stream at this point.
   *
   * This field is always set.
   * </pre>
   *
   * <code>bytes stream_token = 2;</code>
   * @return The streamToken.
   */
  com.google.protobuf.ByteString getStreamToken();

  /**
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 3;</code>
   */
  java.util.List<com.google.firestore.v1.WriteResult> 
      getWriteResultsList();
  /**
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 3;</code>
   */
  com.google.firestore.v1.WriteResult getWriteResults(int index);
  /**
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 3;</code>
   */
  int getWriteResultsCount();
  /**
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 3;</code>
   */
  java.util.List<? extends com.google.firestore.v1.WriteResultOrBuilder> 
      getWriteResultsOrBuilderList();
  /**
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 3;</code>
   */
  com.google.firestore.v1.WriteResultOrBuilder getWriteResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The time at which the commit occurred. Any read with an equal or greater
   * `read_time` is guaranteed to see the effects of the write.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_time = 4;</code>
   * @return Whether the commitTime field is set.
   */
  boolean hasCommitTime();
  /**
   * <pre>
   * The time at which the commit occurred. Any read with an equal or greater
   * `read_time` is guaranteed to see the effects of the write.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_time = 4;</code>
   * @return The commitTime.
   */
  com.google.protobuf.Timestamp getCommitTime();
  /**
   * <pre>
   * The time at which the commit occurred. Any read with an equal or greater
   * `read_time` is guaranteed to see the effects of the write.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp commit_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCommitTimeOrBuilder();
}
