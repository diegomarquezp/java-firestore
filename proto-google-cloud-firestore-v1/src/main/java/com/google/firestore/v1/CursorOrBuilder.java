// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/query.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.v1;

public interface CursorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.Cursor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   *
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  java.util.List<com.google.firestore.v1.Value> getValuesList();
  /**
   *
   *
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   *
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  com.google.firestore.v1.Value getValues(int index);
  /**
   *
   *
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   *
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   *
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  java.util.List<? extends com.google.firestore.v1.ValueOrBuilder> getValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The values that represent a position, in the order they appear in
   * the order by clause of a query.
   *
   * Can contain fewer values than specified in the order by clause.
   * </pre>
   *
   * <code>repeated .google.firestore.v1.Value values = 1;</code>
   */
  com.google.firestore.v1.ValueOrBuilder getValuesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If the position is just before or just after the given values, relative
   * to the sort order defined by the query.
   * </pre>
   *
   * <code>bool before = 2;</code>
   *
   * @return The before.
   */
  boolean getBefore();
}
