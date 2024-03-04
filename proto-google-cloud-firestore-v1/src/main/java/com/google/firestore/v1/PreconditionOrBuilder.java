// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface PreconditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.Precondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When set to `true`, the target document must exist.
   * When set to `false`, the target document must not exist.
   * </pre>
   *
   * <code>bool exists = 1;</code>
   *
   * @return Whether the exists field is set.
   */
  boolean hasExists();
  /**
   *
   *
   * <pre>
   * When set to `true`, the target document must exist.
   * When set to `false`, the target document must not exist.
   * </pre>
   *
   * <code>bool exists = 1;</code>
   *
   * @return The exists.
   */
  boolean getExists();

  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time. Timestamp must be microsecond aligned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time. Timestamp must be microsecond aligned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * When set, the target document must exist and have been last updated at
   * that time. Timestamp must be microsecond aligned.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.firestore.v1.Precondition.ConditionTypeCase getConditionTypeCase();
}
