# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

Single-module Maven project, Java 21, JUnit 5. There is no Maven wrapper (`.mvn/` is empty), so use the system `mvn`.

```bash
mvn test                                        # full suite
mvn -q test -Dtest=RemoveDuplicatesTest         # one test class
mvn -q test -Dtest=RemoveDuplicatesTest#handlesAnEmptyArray   # one test method
mvn compile                                     # compile main sources only
mvn clean                                       # wipe target/
```

`mvn -q` prints nothing on success — silence means the tests passed. No linter or formatter is configured.

## Architecture

A DSA practice repo: each class is one self-contained algorithm, not part of an application. There is no `main`, no framework, no runtime wiring — the tests are the only entry point.

Packages under `src/main/java/com/healthcare/`:

- `arrays/basics/` — one algorithm per class, named after the problem (`MoveZerosToEnd`, `DistinctSecLargest`). Each exposes a **single `public static` method** and holds no state or constructors.
- `arrays/utils/Utils` — shared primitives used across algorithms (currently `swap`). This is the extraction point: when two algorithms need the same helper, it goes here rather than being duplicated (see commit `0e49a44`).

New topics should follow the same shape: `com.healthcare.<topic>/<subtopic>/`, one class per problem.

### Tests

Tests mirror main 1:1 — `src/test/java/.../<Class>Test.java` in the **same package**, so they call the static method unqualified. Every class in `arrays/basics` has one.

Style reference is the newest test file, not the oldest: package-private `class` and `void` methods (no `public`), static-imported assertions only, descriptive lowerCamelCase names reading as sentences (`leavesAnArrayOfDistinctValuesUnchanged`), no comments, no blank lines between `@Test` methods. `SumTest` and `CheckOccurenceTest` predate this and use `public` — don't copy them. (`SumTest.returnsZeroForEmptyArray` is also missing its `@Test` annotation and never runs.)

### In-place mutators return the same array

`MoveZerosToEnd.moveToEnd` and `RemoveDuplicates.DuplicatesRemoved` are two-pointer algorithms that mutate the caller's array and return that same reference — they do not allocate. Tests must build a fresh `int[]` per test.

`RemoveDuplicates` additionally has no clean output contract: distinct values are packed into the prefix `[0..i]` and the tail keeps swapped-out leftovers, but the method returns the whole array and never reports the distinct count `k` (`{1,1,2,2,3,3}` → `{1,2,3,2,1,3}`). Its tests deliberately assert the **full array including that tail**, so they pin the exact swap sequence — changing the swap strategy breaks them even if the distinct prefix stays correct. It also assumes sorted input; on unsorted input the `arr[j] < arr[i]` branch silently drops smaller values.

### Existing behaviors that tests pin

Sentinel returns are ambiguous by design here; they are asserted as-is, so don't "fix" them as part of unrelated work:

- `FirstOccurenceIndex.getFirstOccurenceIndex` returns `0` when the element is absent — indistinguishable from a real hit at index 0.
- `DistinctSecLargest.getSecLargestDistinct` returns `Integer.MIN_VALUE` when there is no second distinct value.

### Naming

Method naming is inconsistent across the repo — some are PascalCase (`DuplicatesRemoved`, `CheckSortedOrNot`), most are camelCase. When editing an existing class, keep its current method name; renames churn the tests for no benefit.
