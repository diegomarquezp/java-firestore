// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface GetDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.GetDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Document to get. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Document to get. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   *
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 2;</code>
   *
   * @return Whether the mask field is set.
   */
  boolean hasMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   *
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 2;</code>
   *
   * @return The mask.
   */
  com.google.firestore.v1.DocumentMask getMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   *
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 2;</code>
   */
  com.google.firestore.v1.DocumentMaskOrBuilder getMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Reads the document in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 3;</code>
   *
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * Reads the document in a transaction.
   * </pre>
   *
   * <code>bytes transaction = 3;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();

  /**
   *
   *
   * <pre>
   * Reads the version of the document at the given time.
   *
   * This must be a microsecond precision timestamp within the past one hour,
   * or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 5;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Reads the version of the document at the given time.
   *
   * This must be a microsecond precision timestamp within the past one hour,
   * or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 5;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Reads the version of the document at the given time.
   *
   * This must be a microsecond precision timestamp within the past one hour,
   * or if Point-in-Time Recovery is enabled, can additionally be a whole
   * minute timestamp within the past 7 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  com.google.firestore.v1.GetDocumentRequest.ConsistencySelectorCase getConsistencySelectorCase();
}
