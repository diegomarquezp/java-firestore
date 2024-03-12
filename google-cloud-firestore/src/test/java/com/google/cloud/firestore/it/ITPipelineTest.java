/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.firestore.it;

import static com.google.cloud.firestore.pipeline.Expr.and;
import static com.google.cloud.firestore.pipeline.Expr.avg;
import static com.google.cloud.firestore.pipeline.Expr.concat;
import static com.google.cloud.firestore.pipeline.Expr.cosineDistance;
import static com.google.cloud.firestore.pipeline.Expr.equal;
import static com.google.cloud.firestore.pipeline.Expr.lessThan;
import static com.google.cloud.firestore.pipeline.Expr.not;
import static com.google.cloud.firestore.pipeline.Expr.or;
import static com.google.cloud.firestore.pipeline.Expr.toLower;
import static com.google.cloud.firestore.pipeline.Expr.trim;
import static com.google.cloud.firestore.pipeline.Ordering.ascending;
import static com.google.cloud.firestore.pipeline.Ordering.descending;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.PaginatingPipeline;
import com.google.cloud.firestore.Pipeline;
import com.google.cloud.firestore.PipelineResult;
import com.google.cloud.firestore.pipeline.Expr.Constant;
import com.google.cloud.firestore.pipeline.Expr.Field;
import com.google.cloud.firestore.pipeline.Expr.Function;
import com.google.cloud.firestore.pipeline.Fields;
import com.google.cloud.firestore.pipeline.FindNearest.FindNearestOptions;
import com.google.cloud.firestore.pipeline.FindNearest.Similarity;
import com.google.cloud.firestore.pipeline.Ordering;
import com.google.cloud.firestore.pipeline.Ordering.Direction;
import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

public class ITPipelineTest {

  protected Firestore firestore;

  @Before
  public void before() throws Exception {
    firestore = FirestoreOptions.newBuilder().build().getService();
  }

  @Test
  public void pipelineWithDb() throws Exception {
    Pipeline p = Pipeline.fromDatabase();
  }

  @Test
  public void projections() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .project(
                Field.of("foo"),
                Constant.of("emptyValue").asAlias("emptyField"),
                Field.of("embedding").cosineDistance(new double[] {1, 2, 3.0}).asAlias("distance"));

    // More compact
    p =
        Pipeline.fromCollection("coll1")
            .project(Fields.of("foo", "bar", "baz"), Constant.of(42).asAlias("emptyField"));
    p =
        Pipeline.fromCollection("coll1")
            // basically an addField
            .project(Field.ofAll(), Constant.of(42).asAlias("emptyField"));
  }

  @Test
  public void addRemoveFields() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .addFields(
                Constant.of("emptyValue").asAlias("emptyField"),
                Field.of("embedding").cosineDistance(new double[] {1, 2, 3.0}).asAlias("distance"))
            .removeFields(Field.of("emptyField"));
  }

  @Test
  public void filters() throws Exception {
    Pipeline p =
        Pipeline.fromCollectionGroup("coll1")
            .filter(Field.of("foo").equal(Constant.of(42)))
            .filter(
                or(
                    Field.of("bar").lessThan(Constant.of(100)),
                    Constant.of("value").equal(Field.of("key"))))
            .filter(not(Constant.of(128).inAny(Field.of("f1"), Field.of("f2"))));

    p =
        Pipeline.fromCollectionGroup("coll1")
            .filter(equal("foo", 42))
            .filter(or(lessThan("bar", 100), equal("key", Constant.of("value"))))
            .filter(not(Constant.of(128).inAny(Field.of("f1"), Field.of("f2"))));
  }

  @Test
  public void inFilters() throws Exception {
    Pipeline p =
        Pipeline.fromCollectionGroup("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")));
  }

  @Test
  public void groupBy() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .group(Fields.of("given_name", "family_name"))
            .aggregate(avg(Field.of("score")).toField("avg_score_1"))
            // Equivalent but more fluency
            .group(Fields.of("given_name", "family_name"))
            .aggregate(Field.of("score").avg().toField("avg_score_2"));
  }

  @Test
  public void aggregateWithoutGrouping() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .aggregate(avg(Field.of("score")).toField("avg_score_1"));
  }

  @Test
  public void joins() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")));
    Pipeline pipe =
        Pipeline.fromCollection("users")
            .findNearest(
                Field.of("embedding"),
                new double[] {1.0, 2.0},
                new FindNearestOptions(Similarity.euclidean(), 1000, Field.of("distance")))
            .innerJoin(p)
            .on(
                and(
                    Field.of("foo").equal(p.fieldOf("bar")),
                    p.fieldOf("requirement").greaterThan(Field.of("distance"))));

    Pipeline another =
        Pipeline.fromCollection("users")
            .innerJoin(p)
            .on(Fields.of("foo", "bar"))
            .project(Field.ofAll().withPrefix("left"), p.fieldOfAll().withPrefix("right"));
  }

  @Test
  public void sorts() throws Exception {
    Pipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .sort(
                Ordering.of(Field.of("rank")),
                Ordering.of(
                    cosineDistance(Field.of("embedding1"), Field.of("embedding2")), Direction.DESC))
            .limit(100);

    // equivalent but more concise.
    p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .sort(
                ascending(Field.of("rank")),
                descending(cosineDistance(Field.of("embedding1"), Field.of("embedding2"))))
            .limit(100);
  }

  @Test
  public void pagination() throws Exception {
    PaginatingPipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .paginate(
                100,
                Ordering.of(
                    cosineDistance(Field.of("embedding1"), Field.of("embedding2")),
                    Direction.DESC));

    Iterator<PipelineResult> result = firestore.execute(p.firstPage()).get();
    Iterator<PipelineResult> second = firestore.execute(p.startAfter(result.next())).get();
    // potentially expensive but possible
    Iterator<PipelineResult> page100 = firestore.execute(p.page(100)).get();
  }

  @Test
  public void fluentAllTheWay() throws Exception {
    PaginatingPipeline p =
        Pipeline.fromCollection("coll1")
            .filter(Field.of("foo").inAny(Constant.of(42), Field.of("bar")))
            .paginate(
                100,
                Ordering.of(
                    cosineDistance(Field.of("embedding1"), Field.of("embedding2")),
                    Direction.DESC));

    Iterator<PipelineResult> result = p.firstPage().execute(firestore).get();
    Iterator<PipelineResult> second = p.startAfter(result.next()).execute(firestore).get();
    // potentially expensive but possible
    Iterator<PipelineResult> page100 = p.page(100).execute(firestore).get();
  }

  @Test
  public void functionComposition() throws Exception {
    // A normalized value by joining the first and last name, triming surrounding whitespace and
    // convert to lower case
    Function normalized = concat(Field.of("first_name"), Constant.of(" "), Field.of("last_name"));
    normalized = trim(normalized);
    normalized = toLower(normalized);

    Pipeline p =
        Pipeline.fromCollection("users")
            .filter(
                or(
                    normalized.equal(Constant.of("john smith")),
                    normalized.equal(Constant.of("alice baker"))));
  }
}
