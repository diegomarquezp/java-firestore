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
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.3
package com.google.firestore.v1;

public interface ListenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.ListenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The database.
   */
  java.lang.String getDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database name. In the format:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string database = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for database.
   */
  com.google.protobuf.ByteString getDatabaseBytes();

  /**
   *
   *
   * <pre>
   * A target to add to this stream.
   * </pre>
   *
   * <code>.google.firestore.v1.Target add_target = 2;</code>
   *
   * @return Whether the addTarget field is set.
   */
  boolean hasAddTarget();
  /**
   *
   *
   * <pre>
   * A target to add to this stream.
   * </pre>
   *
   * <code>.google.firestore.v1.Target add_target = 2;</code>
   *
   * @return The addTarget.
   */
  com.google.firestore.v1.Target getAddTarget();
  /**
   *
   *
   * <pre>
   * A target to add to this stream.
   * </pre>
   *
   * <code>.google.firestore.v1.Target add_target = 2;</code>
   */
  com.google.firestore.v1.TargetOrBuilder getAddTargetOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID of a target to remove from this stream.
   * </pre>
   *
   * <code>int32 remove_target = 3;</code>
   *
   * @return Whether the removeTarget field is set.
   */
  boolean hasRemoveTarget();
  /**
   *
   *
   * <pre>
   * The ID of a target to remove from this stream.
   * </pre>
   *
   * <code>int32 remove_target = 3;</code>
   *
   * @return The removeTarget.
   */
  int getRemoveTarget();

  /**
   *
   *
   * <pre>
   * Labels associated with this target change.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this target change.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this target change.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this target change.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this target change.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.firestore.v1.ListenRequest.TargetChangeCase getTargetChangeCase();
}
