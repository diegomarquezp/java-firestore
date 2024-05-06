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
// source: google/firestore/v1/write.proto

// Protobuf Java Version: 3.25.3
package com.google.firestore.v1;

public interface WriteResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.WriteResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The last update time of the document after applying the write. Not set
   * after a `delete`.
   *
   * If the write did not actually change the document, this will be the
   * previous update_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the document after applying the write. Not set
   * after a `delete`.
   *
   * If the write did not actually change the document, this will be the
   * previous update_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update time of the document after applying the write. Not set
   * after a `delete`.
   *
   * If the write did not actually change the document, this will be the
   * previous update_time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The results of applying each
   * [DocumentTransform.FieldTransform][google.firestore.v1.DocumentTransform.FieldTransform],
   * in the same order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value transform_results = 2;</code>
   */
  java.util.List<com.google.firestore.v1.Value> getTransformResultsList();
  /**
   *
   *
   * <pre>
   * The results of applying each
   * [DocumentTransform.FieldTransform][google.firestore.v1.DocumentTransform.FieldTransform],
   * in the same order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value transform_results = 2;</code>
   */
  com.google.firestore.v1.Value getTransformResults(int index);
  /**
   *
   *
   * <pre>
   * The results of applying each
   * [DocumentTransform.FieldTransform][google.firestore.v1.DocumentTransform.FieldTransform],
   * in the same order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value transform_results = 2;</code>
   */
  int getTransformResultsCount();
  /**
   *
   *
   * <pre>
   * The results of applying each
   * [DocumentTransform.FieldTransform][google.firestore.v1.DocumentTransform.FieldTransform],
   * in the same order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value transform_results = 2;</code>
   */
  java.util.List<? extends com.google.firestore.v1.ValueOrBuilder>
      getTransformResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The results of applying each
   * [DocumentTransform.FieldTransform][google.firestore.v1.DocumentTransform.FieldTransform],
   * in the same order.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value transform_results = 2;</code>
   */
  com.google.firestore.v1.ValueOrBuilder getTransformResultsOrBuilder(int index);
}
