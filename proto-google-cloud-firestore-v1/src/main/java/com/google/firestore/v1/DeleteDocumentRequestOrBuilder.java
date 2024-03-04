// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface DeleteDocumentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.DeleteDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Document to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Document to delete. In the format:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * An optional precondition on the document.
   * The request will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1.Precondition current_document = 2;</code>
   * @return Whether the currentDocument field is set.
   */
  boolean hasCurrentDocument();
  /**
   * <pre>
   * An optional precondition on the document.
   * The request will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1.Precondition current_document = 2;</code>
   * @return The currentDocument.
   */
  com.google.firestore.v1.Precondition getCurrentDocument();
  /**
   * <pre>
   * An optional precondition on the document.
   * The request will fail if this is set and not met by the target document.
   * </pre>
   *
   * <code>.google.firestore.v1.Precondition current_document = 2;</code>
   */
  com.google.firestore.v1.PreconditionOrBuilder getCurrentDocumentOrBuilder();
}
