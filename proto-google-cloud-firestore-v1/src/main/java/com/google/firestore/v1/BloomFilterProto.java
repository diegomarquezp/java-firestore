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

public final class BloomFilterProto {
  private BloomFilterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_BitSequence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_BitSequence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_BloomFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_BloomFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/firestore/v1/bloom_filter.proto"
          + "\022\023google.firestore.v1\".\n\013BitSequence\022\016\n\006"
          + "bitmap\030\001 \001(\014\022\017\n\007padding\030\002 \001(\005\"Q\n\013BloomFi"
          + "lter\022.\n\004bits\030\001 \001(\0132 .google.firestore.v1"
          + ".BitSequence\022\022\n\nhash_count\030\002 \001(\005B\310\001\n\027com"
          + ".google.firestore.v1B\020BloomFilterProtoP\001"
          + "Z;cloud.google.com/go/firestore/apiv1/fi"
          + "restorepb;firestorepb\242\002\004GCFS\252\002\031Google.Cl"
          + "oud.Firestore.V1\312\002\031Google\\Cloud\\Firestor"
          + "e\\V1\352\002\034Google::Cloud::Firestore::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_firestore_v1_BitSequence_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_BitSequence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_BitSequence_descriptor,
            new java.lang.String[] {
              "Bitmap", "Padding",
            });
    internal_static_google_firestore_v1_BloomFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1_BloomFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_BloomFilter_descriptor,
            new java.lang.String[] {
              "Bits", "HashCount",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
