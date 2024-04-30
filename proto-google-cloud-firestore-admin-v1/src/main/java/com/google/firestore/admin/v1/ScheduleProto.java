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
// source: google/firestore/admin/v1/schedule.proto

// Protobuf Java Version: 3.25.3
package com.google.firestore.admin.v1;

public final class ScheduleProto {
  private ScheduleProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_BackupSchedule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_BackupSchedule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_DailyRecurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_DailyRecurrence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_admin_v1_WeeklyRecurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1_WeeklyRecurrence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/firestore/admin/v1/schedule.pro"
          + "to\022\031google.firestore.admin.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032\036google/protobuf/duration.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\033goog"
          + "le/type/dayofweek.proto\"\326\003\n\016BackupSchedu"
          + "le\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\003 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\n \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022,\n\tretention\030\006 \001(\0132\031.google.pr"
          + "otobuf.Duration\022F\n\020daily_recurrence\030\007 \001("
          + "\0132*.google.firestore.admin.v1.DailyRecur"
          + "renceH\000\022H\n\021weekly_recurrence\030\010 \001(\0132+.goo"
          + "gle.firestore.admin.v1.WeeklyRecurrenceH"
          + "\000:w\352At\n\'firestore.googleapis.com/BackupS"
          + "chedule\022Iprojects/{project}/databases/{d"
          + "atabase}/backupSchedules/{backup_schedul"
          + "e}B\014\n\nrecurrence\"\021\n\017DailyRecurrence\"7\n\020W"
          + "eeklyRecurrence\022#\n\003day\030\002 \001(\0162\026.google.ty"
          + "pe.DayOfWeekB\334\001\n\035com.google.firestore.ad"
          + "min.v1B\rScheduleProtoP\001Z9cloud.google.co"
          + "m/go/firestore/apiv1/admin/adminpb;admin"
          + "pb\242\002\004GCFS\252\002\037Google.Cloud.Firestore.Admin"
          + ".V1\312\002\037Google\\Cloud\\Firestore\\Admin\\V1\352\002#"
          + "Google::Cloud::Firestore::Admin::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.DayOfWeekProto.getDescriptor(),
            });
    internal_static_google_firestore_admin_v1_BackupSchedule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1_BackupSchedule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_BackupSchedule_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Retention",
              "DailyRecurrence",
              "WeeklyRecurrence",
              "Recurrence",
            });
    internal_static_google_firestore_admin_v1_DailyRecurrence_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_admin_v1_DailyRecurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_DailyRecurrence_descriptor,
            new java.lang.String[] {});
    internal_static_google_firestore_admin_v1_WeeklyRecurrence_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_admin_v1_WeeklyRecurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_admin_v1_WeeklyRecurrence_descriptor,
            new java.lang.String[] {
              "Day",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.DayOfWeekProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
