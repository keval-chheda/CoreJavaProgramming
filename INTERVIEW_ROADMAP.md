# Interview-Focused Expansion Roadmap

This document reviews the current package coverage and suggests high-impact additions for coding interviews, including modern Java 25/26 topics.

## 1) Package Coverage Check

Current package coverage is strong for:
- `arrays`, `string`, `dsa/*` (algorithm, linkedlist, map, stack)
- `corejava`, `streamapi`, `comparator/comparable`, `designpattern`

### Missing or underrepresented interview areas

To make your repository more “complete interview prep”, consider adding:

1. `dsa/tree`
2. `dsa/graph`
3. `dsa/heap`
4. `dsa/queue`
5. `dsa/trie`
6. `dsa/dp` (dynamic programming)
7. `concurrency`
8. `systemdesignlite` (small practical design exercises)

## 2) Programs to Add (Interview Priority Order)

## A. Must-have DSA set

### `dsa/tree`
- `BinaryTreeTraversals` (inorder/preorder/postorder iterative + recursive)
- `LevelOrderTraversal` (BFS)
- `LowestCommonAncestorBST`
- `ValidateBinarySearchTree`
- `TreeHeightAndDiameter`

### `dsa/graph`
- `GraphBFSDFS`
- `CycleDetectionDirected`
- `CycleDetectionUndirected`
- `TopologicalSortKahn`
- `ShortestPathDijkstra`

### `dsa/heap`
- `KthLargestElement`
- `TopKFrequentElements`
- `MergeKSortedArrays`

### `dsa/queue`
- `SlidingWindowMaximumDeque`
- `ImplementQueueUsingStacks`
- `LRUCache` (HashMap + DoublyLinkedList)

### `dsa/dp`
- `FibonacciMemoizationTabulation`
- `ClimbingStairs`
- `LongestCommonSubsequence`
- `CoinChange`
- `Knapsack01`

## B. Frequently asked String/Array add-ons

### `arrays`
- `TwoSum`
- `BestTimeToBuySellStock`
- `RotateArray`
- `ProductOfArrayExceptSelf`
- `MergeIntervals`

### `string`
- `LongestSubstringWithoutRepeating`
- `ValidAnagram`
- `GroupAnagrams`
- `StringCompression`
- `MinimumWindowSubstring` (advanced)

## C. Concurrency (important for experienced interviews)

### `concurrency`
- `ProducerConsumerBlockingQueue`
- `ThreadPoolExecutorExample`
- `CompletableFutureComposition`
- `ReadWriteLockExample`
- `RateLimiterTokenBucket`

## 3) Java 25 / Java 26 Concepts You Should Add

## Java 25 (GA on 2025-09-16)

Suggested interview-relevant demos:
- `modernjava/scopedvalues/ScopedValuesBasic` (JEP 506)
- `modernjava/structuredconcurrency/StructuredTaskScopeDemo` (JEP 505 preview line)
- `modernjava/moduleimports/ModuleImportDemo` (JEP 511)
- `modernjava/flexibleconstructors/FlexibleConstructorBodiesDemo` (JEP 513)
- `modernjava/primitivetypespatterns/PrimitivePatternSwitchDemo` (JEP 507 preview line)

## Java 26 (Released 2026-03-17)

Suggested interview-relevant demos:
- `modernjava/http3/HttpClientHttp3Demo` (JEP 517)
- `modernjava/uuid/UuidV7Demo` (`UUID.ofEpochMillis`)
- `modernjava/process/ProcessAutoCloseableDemo` (`try-with-resources` with `Process`)
- `modernjava/time/InstantPlusSaturatingDemo` (`Instant.plusSaturating`)
- `modernjava/comparator/ComparatorMinMaxDemo` (new default methods)
- `modernjava/patterns/PrimitiveSwitchPreviewDemo` (JEP 530 preview line)

## 4) How to make the repo look interview-professional

For every new class, include:
- Problem statement (2–4 lines)
- Input/output examples
- Time complexity
- Space complexity
- Edge cases

Recommended JavaDoc template:

```java
/**
 * Problem: ...
 * Approach: ...
 * Time Complexity: O(...)
 * Space Complexity: O(...)
 * Edge Cases: ...
 */
```

## 5) Suggested next milestone

Create a new package group:

- `com.corejavaprogramming.interview.top75`

Add 75 curated problems split as:
- 20 arrays/strings
- 20 linked list/stack/queue
- 20 trees/graphs/heap
- 15 dynamic programming/backtracking

This gives a very strong “ready for coding rounds” signal for recruiters and interviewers.
