// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentMask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_Precondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_Precondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_ReadOnly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/firestore/v1/common.proto\022\023goog"
          + "le.firestore.v1\032\037google/protobuf/timesta"
          + "mp.proto\"#\n\014DocumentMask\022\023\n\013field_paths\030"
          + "\001 \003(\t\"e\n\014Precondition\022\020\n\006exists\030\001 \001(\010H\000\022"
          + "1\n\013update_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestampH\000B\020\n\016condition_type\"\251\002\n\022Transac"
          + "tionOptions\022E\n\tread_only\030\002 \001(\01320.google."
          + "firestore.v1.TransactionOptions.ReadOnly"
          + "H\000\022G\n\nread_write\030\003 \001(\01321.google.firestor"
          + "e.v1.TransactionOptions.ReadWriteH\000\032&\n\tR"
          + "eadWrite\022\031\n\021retry_transaction\030\001 \001(\014\032S\n\010R"
          + "eadOnly\022/\n\tread_time\030\002 \001(\0132\032.google.prot"
          + "obuf.TimestampH\000B\026\n\024consistency_selector"
          + "B\006\n\004modeB\303\001\n\027com.google.firestore.v1B\013Co"
          + "mmonProtoP\001Z;cloud.google.com/go/firesto"
          + "re/apiv1/firestorepb;firestorepb\242\002\004GCFS\252"
          + "\002\031Google.Cloud.Firestore.V1\312\002\031Google\\Clo"
          + "ud\\Firestore\\V1\352\002\034Google::Cloud::Firesto"
          + "re::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_firestore_v1_DocumentMask_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentMask_descriptor,
            new java.lang.String[] {
              "FieldPaths",
            });
    internal_static_google_firestore_v1_Precondition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1_Precondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_Precondition_descriptor,
            new java.lang.String[] {
              "Exists", "UpdateTime", "ConditionType",
            });
    internal_static_google_firestore_v1_TransactionOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1_TransactionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_descriptor,
            new java.lang.String[] {
              "ReadOnly", "ReadWrite", "Mode",
            });
    internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor =
        internal_static_google_firestore_v1_TransactionOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1_TransactionOptions_ReadWrite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor,
            new java.lang.String[] {
              "RetryTransaction",
            });
    internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor =
        internal_static_google_firestore_v1_TransactionOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_firestore_v1_TransactionOptions_ReadOnly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor,
            new java.lang.String[] {
              "ReadTime", "ConsistencySelector",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
