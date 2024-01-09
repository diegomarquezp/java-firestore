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
// source: google/firestore/admin/v1/operation.proto

package com.google.firestore.admin.v1;

public interface ImportDocumentsMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1.ImportDocumentsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time this operation started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time this operation started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time this operation started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time this operation completed. Will be unset if operation still in
   * progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time this operation completed. Will be unset if operation still in
   * progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time this operation completed. Will be unset if operation still in
   * progress.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The state of the import operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.OperationState operation_state = 3;</code>
   *
   * @return The enum numeric value on the wire for operationState.
   */
  int getOperationStateValue();
  /**
   *
   *
   * <pre>
   * The state of the import operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.OperationState operation_state = 3;</code>
   *
   * @return The operationState.
   */
  com.google.firestore.admin.v1.OperationState getOperationState();

  /**
   *
   *
   * <pre>
   * The progress, in documents, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_documents = 4;</code>
   *
   * @return Whether the progressDocuments field is set.
   */
  boolean hasProgressDocuments();
  /**
   *
   *
   * <pre>
   * The progress, in documents, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_documents = 4;</code>
   *
   * @return The progressDocuments.
   */
  com.google.firestore.admin.v1.Progress getProgressDocuments();
  /**
   *
   *
   * <pre>
   * The progress, in documents, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_documents = 4;</code>
   */
  com.google.firestore.admin.v1.ProgressOrBuilder getProgressDocumentsOrBuilder();

  /**
   *
   *
   * <pre>
   * The progress, in bytes, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_bytes = 5;</code>
   *
   * @return Whether the progressBytes field is set.
   */
  boolean hasProgressBytes();
  /**
   *
   *
   * <pre>
   * The progress, in bytes, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_bytes = 5;</code>
   *
   * @return The progressBytes.
   */
  com.google.firestore.admin.v1.Progress getProgressBytes();
  /**
   *
   *
   * <pre>
   * The progress, in bytes, of this operation.
   * </pre>
   *
   * <code>.google.firestore.admin.v1.Progress progress_bytes = 5;</code>
   */
  com.google.firestore.admin.v1.ProgressOrBuilder getProgressBytesOrBuilder();

  /**
   *
   *
   * <pre>
   * Which collection ids are being imported.
   * </pre>
   *
   * <code>repeated string collection_ids = 6;</code>
   *
   * @return A list containing the collectionIds.
   */
  java.util.List<java.lang.String> getCollectionIdsList();
  /**
   *
   *
   * <pre>
   * Which collection ids are being imported.
   * </pre>
   *
   * <code>repeated string collection_ids = 6;</code>
   *
   * @return The count of collectionIds.
   */
  int getCollectionIdsCount();
  /**
   *
   *
   * <pre>
   * Which collection ids are being imported.
   * </pre>
   *
   * <code>repeated string collection_ids = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  java.lang.String getCollectionIds(int index);
  /**
   *
   *
   * <pre>
   * Which collection ids are being imported.
   * </pre>
   *
   * <code>repeated string collection_ids = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  com.google.protobuf.ByteString getCollectionIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The location of the documents being imported.
   * </pre>
   *
   * <code>string input_uri_prefix = 7;</code>
   *
   * @return The inputUriPrefix.
   */
  java.lang.String getInputUriPrefix();
  /**
   *
   *
   * <pre>
   * The location of the documents being imported.
   * </pre>
   *
   * <code>string input_uri_prefix = 7;</code>
   *
   * @return The bytes for inputUriPrefix.
   */
  com.google.protobuf.ByteString getInputUriPrefixBytes();

  /**
   *
   *
   * <pre>
   * Which namespace ids are being imported.
   * </pre>
   *
   * <code>repeated string namespace_ids = 8;</code>
   *
   * @return A list containing the namespaceIds.
   */
  java.util.List<java.lang.String> getNamespaceIdsList();
  /**
   *
   *
   * <pre>
   * Which namespace ids are being imported.
   * </pre>
   *
   * <code>repeated string namespace_ids = 8;</code>
   *
   * @return The count of namespaceIds.
   */
  int getNamespaceIdsCount();
  /**
   *
   *
   * <pre>
   * Which namespace ids are being imported.
   * </pre>
   *
   * <code>repeated string namespace_ids = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The namespaceIds at the given index.
   */
  java.lang.String getNamespaceIds(int index);
  /**
   *
   *
   * <pre>
   * Which namespace ids are being imported.
   * </pre>
   *
   * <code>repeated string namespace_ids = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the namespaceIds at the given index.
   */
  com.google.protobuf.ByteString getNamespaceIdsBytes(int index);
}
