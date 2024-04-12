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
// source: google/firestore/v1/document.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface ValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return The enum numeric value on the wire for nullValue.
   */
  int getNullValueValue();
  /**
   *
   *
   * <pre>
   * A null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 11;</code>
   *
   * @return The nullValue.
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   *
   *
   * <pre>
   * A boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   *
   * @return Whether the booleanValue field is set.
   */
  boolean hasBooleanValue();
  /**
   *
   *
   * <pre>
   * A boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   *
   * @return The booleanValue.
   */
  boolean getBooleanValue();

  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return Whether the integerValue field is set.
   */
  boolean hasIntegerValue();
  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 integer_value = 2;</code>
   *
   * @return The integerValue.
   */
  long getIntegerValue();

  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 3;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * A timestamp value.
   *
   * Precise only to microseconds. When stored, any additional precision is
   * rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();
  /**
   *
   *
   * <pre>
   * A timestamp value.
   *
   * Precise only to microseconds. When stored, any additional precision is
   * rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   *
   * @return The timestampValue.
   */
  com.google.protobuf.Timestamp getTimestampValue();
  /**
   *
   *
   * <pre>
   * A timestamp value.
   *
   * Precise only to microseconds. When stored, any additional precision is
   * rounded down.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A string value.
   *
   * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
   * Only the first 1,500 bytes of the UTF-8 representation are considered by
   * queries.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * A string value.
   *
   * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
   * Only the first 1,500 bytes of the UTF-8 representation are considered by
   * queries.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * A string value.
   *
   * The string, represented as UTF-8, must not exceed 1 MiB - 89 bytes.
   * Only the first 1,500 bytes of the UTF-8 representation are considered by
   * queries.
   * </pre>
   *
   * <code>string string_value = 17;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * A bytes value.
   *
   * Must not exceed 1 MiB - 89 bytes.
   * Only the first 1,500 bytes are considered by queries.
   * </pre>
   *
   * <code>bytes bytes_value = 18;</code>
   *
   * @return Whether the bytesValue field is set.
   */
  boolean hasBytesValue();
  /**
   *
   *
   * <pre>
   * A bytes value.
   *
   * Must not exceed 1 MiB - 89 bytes.
   * Only the first 1,500 bytes are considered by queries.
   * </pre>
   *
   * <code>bytes bytes_value = 18;</code>
   *
   * @return The bytesValue.
   */
  com.google.protobuf.ByteString getBytesValue();

  /**
   *
   *
   * <pre>
   * A reference to a document. For example:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string reference_value = 5;</code>
   *
   * @return Whether the referenceValue field is set.
   */
  boolean hasReferenceValue();
  /**
   *
   *
   * <pre>
   * A reference to a document. For example:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string reference_value = 5;</code>
   *
   * @return The referenceValue.
   */
  java.lang.String getReferenceValue();
  /**
   *
   *
   * <pre>
   * A reference to a document. For example:
   * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
   * </pre>
   *
   * <code>string reference_value = 5;</code>
   *
   * @return The bytes for referenceValue.
   */
  com.google.protobuf.ByteString getReferenceValueBytes();

  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   *
   * @return Whether the geoPointValue field is set.
   */
  boolean hasGeoPointValue();
  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   *
   * @return The geoPointValue.
   */
  com.google.type.LatLng getGeoPointValue();
  /**
   *
   *
   * <pre>
   * A geo point value representing a point on the surface of Earth.
   * </pre>
   *
   * <code>.google.type.LatLng geo_point_value = 8;</code>
   */
  com.google.type.LatLngOrBuilder getGeoPointValueOrBuilder();

  /**
   *
   *
   * <pre>
   * An array value.
   *
   * Cannot directly contain another array value, though can contain an
   * map which contains another array.
   * </pre>
   *
   * <code>.google.firestore.v1.ArrayValue array_value = 9;</code>
   *
   * @return Whether the arrayValue field is set.
   */
  boolean hasArrayValue();
  /**
   *
   *
   * <pre>
   * An array value.
   *
   * Cannot directly contain another array value, though can contain an
   * map which contains another array.
   * </pre>
   *
   * <code>.google.firestore.v1.ArrayValue array_value = 9;</code>
   *
   * @return The arrayValue.
   */
  com.google.firestore.v1.ArrayValue getArrayValue();
  /**
   *
   *
   * <pre>
   * An array value.
   *
   * Cannot directly contain another array value, though can contain an
   * map which contains another array.
   * </pre>
   *
   * <code>.google.firestore.v1.ArrayValue array_value = 9;</code>
   */
  com.google.firestore.v1.ArrayValueOrBuilder getArrayValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A map value.
   * </pre>
   *
   * <code>.google.firestore.v1.MapValue map_value = 6;</code>
   *
   * @return Whether the mapValue field is set.
   */
  boolean hasMapValue();
  /**
   *
   *
   * <pre>
   * A map value.
   * </pre>
   *
   * <code>.google.firestore.v1.MapValue map_value = 6;</code>
   *
   * @return The mapValue.
   */
  com.google.firestore.v1.MapValue getMapValue();
  /**
   *
   *
   * <pre>
   * A map value.
   * </pre>
   *
   * <code>.google.firestore.v1.MapValue map_value = 6;</code>
   */
  com.google.firestore.v1.MapValueOrBuilder getMapValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Value which references a field.
   *
   * This is considered relative (vs absolute) since it only refers to a field
   * and not a field within a particular document.
   *
   * **Requires:**
   *
   * * Must follow [field reference][FieldReference.field_path] limitations.
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): long term, there is no reason this type should not be
   *     allowed to be used on the write path. --)
   * </pre>
   *
   * <code>string field_reference_value = 19;</code>
   *
   * @return Whether the fieldReferenceValue field is set.
   */
  boolean hasFieldReferenceValue();
  /**
   *
   *
   * <pre>
   * Value which references a field.
   *
   * This is considered relative (vs absolute) since it only refers to a field
   * and not a field within a particular document.
   *
   * **Requires:**
   *
   * * Must follow [field reference][FieldReference.field_path] limitations.
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): long term, there is no reason this type should not be
   *     allowed to be used on the write path. --)
   * </pre>
   *
   * <code>string field_reference_value = 19;</code>
   *
   * @return The fieldReferenceValue.
   */
  java.lang.String getFieldReferenceValue();
  /**
   *
   *
   * <pre>
   * Value which references a field.
   *
   * This is considered relative (vs absolute) since it only refers to a field
   * and not a field within a particular document.
   *
   * **Requires:**
   *
   * * Must follow [field reference][FieldReference.field_path] limitations.
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): long term, there is no reason this type should not be
   *     allowed to be used on the write path. --)
   * </pre>
   *
   * <code>string field_reference_value = 19;</code>
   *
   * @return The bytes for fieldReferenceValue.
   */
  com.google.protobuf.ByteString getFieldReferenceValueBytes();

  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated expression.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Function function_value = 20;</code>
   *
   * @return Whether the functionValue field is set.
   */
  boolean hasFunctionValue();
  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated expression.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Function function_value = 20;</code>
   *
   * @return The functionValue.
   */
  com.google.firestore.v1.Function getFunctionValue();
  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated expression.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Function function_value = 20;</code>
   */
  com.google.firestore.v1.FunctionOrBuilder getFunctionValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated pipeline.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Pipeline pipeline_value = 21;</code>
   *
   * @return Whether the pipelineValue field is set.
   */
  boolean hasPipelineValue();
  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated pipeline.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Pipeline pipeline_value = 21;</code>
   *
   * @return The pipelineValue.
   */
  com.google.firestore.v1.Pipeline getPipelineValue();
  /**
   *
   *
   * <pre>
   * A value that represents an unevaluated pipeline.
   *
   * **Requires:**
   *
   * * Not allowed to be used when writing documents.
   *
   * (-- NOTE(batchik): similar to above, there is no reason to not allow
   *     storing expressions into the database, just no plan to support in
   *     the near term.
   *
   *     This would actually be an interesting way to represent user-defined
   *     functions or more expressive rules-based systems. --)
   * </pre>
   *
   * <code>.google.firestore.v1.Pipeline pipeline_value = 21;</code>
   */
  com.google.firestore.v1.PipelineOrBuilder getPipelineValueOrBuilder();

  com.google.firestore.v1.Value.ValueTypeCase getValueTypeCase();
}
