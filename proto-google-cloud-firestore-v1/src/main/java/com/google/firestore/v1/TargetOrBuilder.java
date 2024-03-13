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

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface TargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.Target)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.QueryTarget query = 2;</code>
   *
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.QueryTarget query = 2;</code>
   *
   * @return The query.
   */
  com.google.firestore.v1.Target.QueryTarget getQuery();
  /**
   *
   *
   * <pre>
   * A target specified by a query.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.QueryTarget query = 2;</code>
   */
  com.google.firestore.v1.Target.QueryTargetOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.DocumentsTarget documents = 3;</code>
   *
   * @return Whether the documents field is set.
   */
  boolean hasDocuments();
  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.DocumentsTarget documents = 3;</code>
   *
   * @return The documents.
   */
  com.google.firestore.v1.Target.DocumentsTarget getDocuments();
  /**
   *
   *
   * <pre>
   * A target specified by a set of document names.
   * </pre>
   *
   * <code>.google.firestore.v1.Target.DocumentsTarget documents = 3;</code>
   */
  com.google.firestore.v1.Target.DocumentsTargetOrBuilder getDocumentsOrBuilder();

  /**
   *
   *
   * <pre>
   * A resume token from a prior
   * [TargetChange][google.firestore.v1.TargetChange] for an identical target.
   *
   * Using a resume token with a different target is unsupported and may fail.
   * </pre>
   *
   * <code>bytes resume_token = 4;</code>
   *
   * @return Whether the resumeToken field is set.
   */
  boolean hasResumeToken();
  /**
   *
   *
   * <pre>
   * A resume token from a prior
   * [TargetChange][google.firestore.v1.TargetChange] for an identical target.
   *
   * Using a resume token with a different target is unsupported and may fail.
   * </pre>
   *
   * <code>bytes resume_token = 4;</code>
   *
   * @return The resumeToken.
   */
  com.google.protobuf.ByteString getResumeToken();

  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   *
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   *
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Start listening after a specific `read_time`.
   *
   * The client must know the state of matching documents at this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The target ID that identifies the target on the stream. Must be a positive
   * number and non-zero.
   *
   * If `target_id` is 0 (or unspecified), the server will assign an ID for this
   * target and return that in a `TargetChange::ADD` event. Once a target with
   * `target_id=0` is added, all subsequent targets must also have
   * `target_id=0`. If an `AddTarget` request with `target_id != 0` is
   * sent to the server after a target with `target_id=0` is added, the server
   * will immediately send a response with a `TargetChange::Remove` event.
   *
   * Note that if the client sends multiple `AddTarget` requests
   * without an ID, the order of IDs returned in `TargetChage.target_ids` are
   * undefined. Therefore, clients should provide a target ID instead of relying
   * on the server to assign one.
   *
   * If `target_id` is non-zero, there must not be an existing active target on
   * this stream with the same ID.
   * </pre>
   *
   * <code>int32 target_id = 5;</code>
   *
   * @return The targetId.
   */
  int getTargetId();

  /**
   *
   *
   * <pre>
   * If the target should be removed once it is current and consistent.
   * </pre>
   *
   * <code>bool once = 6;</code>
   *
   * @return The once.
   */
  boolean getOnce();

  /**
   *
   *
   * <pre>
   * The number of documents that last matched the query at the resume token or
   * read time.
   *
   * This value is only relevant when a `resume_type` is provided. This value
   * being present and greater than zero signals that the client wants
   * `ExistenceFilter.unchanged_names` to be included in the response.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value expected_count = 12;</code>
   *
   * @return Whether the expectedCount field is set.
   */
  boolean hasExpectedCount();
  /**
   *
   *
   * <pre>
   * The number of documents that last matched the query at the resume token or
   * read time.
   *
   * This value is only relevant when a `resume_type` is provided. This value
   * being present and greater than zero signals that the client wants
   * `ExistenceFilter.unchanged_names` to be included in the response.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value expected_count = 12;</code>
   *
   * @return The expectedCount.
   */
  com.google.protobuf.Int32Value getExpectedCount();
  /**
   *
   *
   * <pre>
   * The number of documents that last matched the query at the resume token or
   * read time.
   *
   * This value is only relevant when a `resume_type` is provided. This value
   * being present and greater than zero signals that the client wants
   * `ExistenceFilter.unchanged_names` to be included in the response.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value expected_count = 12;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getExpectedCountOrBuilder();

  com.google.firestore.v1.Target.TargetTypeCase getTargetTypeCase();

  com.google.firestore.v1.Target.ResumeTypeCase getResumeTypeCase();
}
