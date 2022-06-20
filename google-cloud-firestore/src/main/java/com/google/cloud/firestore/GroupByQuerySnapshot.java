/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.firestore;

import com.google.cloud.Timestamp;
import java.util.List;
import javax.annotation.Nonnull;

public interface GroupByQuerySnapshot extends Iterable<GroupSnapshot> {

  @Nonnull
  GroupByQuery getQuery();

  @Nonnull
  Timestamp getReadTime();

  @Nonnull
  List<GroupSnapshot> getGroups();

  @Nonnull
  List<GroupChange> getGroupChanges();

  boolean isEmpty();

  int size();

  @Override
  boolean equals(Object obj);

  @Override
  int hashCode();
}