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
// source: google/firestore/v1/bloom_filter.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface BitSequenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.BitSequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bytes that encode the bit sequence.
   * May have a length of zero.
   * </pre>
   *
   * <code>bytes bitmap = 1;</code>
   *
   * @return The bitmap.
   */
  com.google.protobuf.ByteString getBitmap();

  /**
   *
   *
   * <pre>
   * The number of bits of the last byte in `bitmap` to ignore as "padding".
   * If the length of `bitmap` is zero, then this value must be `0`.
   * Otherwise, this value must be between 0 and 7, inclusive.
   * </pre>
   *
   * <code>int32 padding = 2;</code>
   *
   * @return The padding.
   */
  int getPadding();
}
