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
// source: google/firestore/admin/v1/firestore_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.admin.v1;

public interface ListBackupSchedulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1.ListBackupSchedulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of all backup schedules.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.BackupSchedule backup_schedules = 1;</code>
   */
  java.util.List<com.google.firestore.admin.v1.BackupSchedule> getBackupSchedulesList();
  /**
   *
   *
   * <pre>
   * List of all backup schedules.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.BackupSchedule backup_schedules = 1;</code>
   */
  com.google.firestore.admin.v1.BackupSchedule getBackupSchedules(int index);
  /**
   *
   *
   * <pre>
   * List of all backup schedules.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.BackupSchedule backup_schedules = 1;</code>
   */
  int getBackupSchedulesCount();
  /**
   *
   *
   * <pre>
   * List of all backup schedules.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.BackupSchedule backup_schedules = 1;</code>
   */
  java.util.List<? extends com.google.firestore.admin.v1.BackupScheduleOrBuilder>
      getBackupSchedulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of all backup schedules.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.BackupSchedule backup_schedules = 1;</code>
   */
  com.google.firestore.admin.v1.BackupScheduleOrBuilder getBackupSchedulesOrBuilder(int index);
}
