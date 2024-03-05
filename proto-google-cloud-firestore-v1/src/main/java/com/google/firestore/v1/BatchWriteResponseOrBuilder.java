/*
 * Copyright 2023 Google LLC
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

public interface BatchWriteResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.BatchWriteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 1;</code>
   */
  java.util.List<com.google.firestore.v1.WriteResult> getWriteResultsList();
  /**
   *
   *
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 1;</code>
   */
  com.google.firestore.v1.WriteResult getWriteResults(int index);
  /**
   *
   *
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 1;</code>
   */
  int getWriteResultsCount();
  /**
   *
   *
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 1;</code>
   */
  java.util.List<? extends com.google.firestore.v1.WriteResultOrBuilder>
      getWriteResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.WriteResult write_results = 1;</code>
   */
  com.google.firestore.v1.WriteResultOrBuilder getWriteResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The status of applying the writes.
   *
   * This i-th write status corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status status = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getStatusList();
  /**
   *
   *
   * <pre>
   * The status of applying the writes.
   *
   * This i-th write status corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status status = 2;</code>
   */
  com.google.rpc.Status getStatus(int index);
  /**
   *
   *
   * <pre>
   * The status of applying the writes.
   *
   * This i-th write status corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status status = 2;</code>
   */
  int getStatusCount();
  /**
   *
   *
   * <pre>
   * The status of applying the writes.
   *
   * This i-th write status corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status status = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getStatusOrBuilderList();
  /**
   *
   *
   * <pre>
   * The status of applying the writes.
   *
   * This i-th write status corresponds to the i-th write in the
   * request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status status = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder(int index);
}
