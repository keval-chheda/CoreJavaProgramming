# Time & Space Complexity Guide (All Programs)

This document lists each Java program in this repository with a quick complexity estimate and a one-line explanation.

> Notes:
> - `n` = number of elements/characters, `m` = size of second input where applicable.
> - For Stream API examples, complexity is based on the underlying traversal over collection size.
> - For utility/demo classes that mostly wire APIs (e.g., comparator, singleton), complexity is marked as constant/demo.

## Arrays

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `arrays/ArraysOfStrinfUppercase` | O(n) | O(n) | Traverses all strings and creates uppercased output collection. |
| `arrays/IntersectionArrays` | O(n + m) | O(min(n,m)) | Uses lookup structure to find common elements across two arrays. |
| `arrays/PalindromeJava8` | O(n) | O(n) | Reverses/compares full string using stream or builder style operations. |
| `arrays/PeakElement` | O(n) | O(1) | Scans array once to detect a peak candidate. |
| `arrays/RemoveDuplicateFromArrayStream` | O(n) | O(n) | Distinct/filter pipeline walks all elements and stores seen values. |
| `arrays/RemoveDuplicatefromArray` | O(n²) | O(1) | Typical nested-check in-place duplicate removal approach. |
| `arrays/TargetIndices` | O(n log n) | O(1) / O(n) | Sort plus scan to collect matching target positions. |
| `arrays/findGreaterElement` | O(n) | O(1) | Single pass to evaluate greater/next-greater relation. |

## Core Java

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `corejava/FactorialNumber` | O(n) | O(1) | Iterative multiplication from 1..n. |
| `corejava/ForLoopExample1` | O(n) | O(1) | Simple loop demonstration over n iterations. |
| `corejava/PrimeCheckIntStream` | O(√n) | O(1) | Checks divisibility up to square root of n. |
| `corejava/ReverseString` | O(n) | O(n) | Uses builder/string operations creating reversed output. |
| `corejava/ReverseStringCharacterArray` | O(n) | O(1) | In-place two-pointer character swaps. |
| `corejava/ReverseStringLoop` | O(n) | O(n) | Builds reversed string via loop accumulation. |
| `corejava/ReverseStringRecursion` | O(n) | O(n) | One recursive call per character; stack grows linearly. |
| `corejava/SwapNumbers` | O(1) | O(1) | Constant number of arithmetic/temp operations. |
| `corejava/ValidParenthesesCounter` | O(n) | O(n) | Stack/counter pass over expression characters. |

## DSA

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `dsa/algorithm/BinarySearch` | O(log n) | O(1) | Halves search space each iteration. |
| `dsa/algorithm/LinearSearch` | O(n) | O(1) | Sequential scan until target found/end. |
| `dsa/linkedlist/IteratingLinkedList` | O(n) | O(1) | Visits each node once while iterating. |
| `dsa/linkedlist/LinkedList` | O(n) (typical ops) | O(1) aux | Demonstrates standard linked-list traversals/updates. |
| `dsa/linkedlist/SortLinkedList` | O(n log n) | O(log n) / O(1) | Linked-list sorting (typically merge-sort style). |
| `dsa/map/CharCountMap` | O(n) | O(k) | Counts characters with hashmap (`k` distinct chars). |
| `dsa/map/IteratorMap` | O(n) | O(1) | Iterates all map entries once. |
| `dsa/stack/StackOperation` | O(1) per op | O(n) | Push/pop/peek are constant-time; stack stores n elements. |

## Strings

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `string/CountOccurenceString` | O(n) | O(k) | Frequency map over all characters. |
| `string/DuplicateCharacterString` | O(n) | O(k) | Tracks seen characters to identify duplicates. |
| `string/FirstNonRepeatingChar` | O(n) | O(k) | Count then first unique lookup in second pass. |
| `string/LongestStringUsingJava8` | O(n) | O(1) | Stream max-by-length over list of strings. |
| `string/PalindromeCheck` | O(n) | O(1) / O(n) | Two-pointer or reverse-based palindrome validation. |
| `string/RemoveDuplicates` | O(n) | O(k) | Set-based de-duplication preserving traversal order. |
| `string/ReverseString` | O(n) | O(n) | Reversed string creation from source text. |
| `string/countOccurenceUsingArrays` | O(n) | O(1) / O(k) | Array/map counters based on alphabet domain. |

## Stream API

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `streamapi/CalculateSquareEx10` | O(n) | O(n) | Maps each input to square and collects result. |
| `streamapi/CollectToMap` | O(n) | O(n) | Converts stream elements into map entries. |
| `streamapi/CollectoreJoining` | O(n) | O(n) | Joins all elements into a single output string. |
| `streamapi/collectors/CollectorsToMap` | O(n) | O(n) | Collector builds map by traversing all values. |
| `streamapi/ComparatorEx_02` | O(n log n) | O(n) | Sorting with comparator dominates runtime. |
| `streamapi/ConsumerEx05` | O(n) | O(1) | Applies consumer action to each element once. |
| `streamapi/EmployeeAvgSalary` | O(n) | O(1) / O(g) | Aggregate average by traversal (or grouped average). |
| `streamapi/FilterNumbersEx01` | O(n) | O(n) | Filters list and collects matching elements. |
| `streamapi/FrequencyEachCharacter` | O(n) | O(k) | Groups/counts character frequency in one pass. |
| `streamapi/FunctionEx06` | O(1) / O(n) | O(1) | Function application; linear if applied across list. |
| `streamapi/FunctionEx13` | O(1) / O(n) | O(1) | Demonstrates functional mapping usage. |
| `streamapi/GroupingExample` | O(n) | O(g) | Groups stream elements by key/category. |
| `streamapi/IterateOverListEx08` | O(n) | O(1) | Iteration across all list elements. |
| `streamapi/LambdaStringtoUppercaseEx11` | O(n) | O(n) | Converts all strings to uppercase and stores results. |
| `streamapi/MethodReferenceEx13` | O(n) | O(1) / O(n) | Method reference over stream/list traversal. |
| `streamapi/PredicateEx04` | O(n) | O(n) | Predicate-based filtering over elements. |
| `streamapi/ReduceExample12` | O(n) | O(1) | Reduction combines all elements once. |
| `streamapi/SeperateOddEven` | O(n) | O(n) | Partitions input into odd/even buckets. |
| `streamapi/SortingStringByLength03` | O(n log n) | O(n) | Sort by key (length) with comparator. |
| `streamapi/StreamAPI` | O(n) | O(n) | General stream operations over full input collection. |
| `streamapi/StreamEx07` | O(n) | O(n) | Typical map/filter/collect pipeline. |
| `streamapi/SumEvenNumberEx09` | O(n) | O(1) | Filters evens then sums through traversal. |
| `streamapi/SummationUsingStream` | O(n) | O(1) | Single-pass summation reduction. |

## Other Topic Demos

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `designpattern/FactoryPattern` | O(1) | O(1) | Object creation dispatch by type for small fixed set. |
| `designpattern/Singleton` | O(1) | O(1) | Constant-time instance retrieval. |
| `comparable/LambdaCompareToExample` | O(n log n) | O(1) / O(n) | Comparison used in sorting operations. |
| `comparator/EmployeeComparator` | O(n log n) | O(1) / O(n) | Comparator cost usually seen during sort. |
| `hashmap/ConcurrentHashMapEx` | O(1) avg per op | O(n) | Average constant-time map put/get; stores n entries. |
| `hashmap/SynchronizedHashMapExample` | O(1) avg per op | O(n) | Same hashmap behavior with synchronization overhead. |
| `methodreference/ConstructorReference` | O(1) | O(1) | Constructor reference invocation demo. |
| `reccursion/PrintNumbersRecursion` | O(n) | O(n) | Recursive depth grows with number range. |
| `servlet/HelloServlet` | O(1) per request | O(1) | Writes fixed response text for each request. |
| `stringbuffer/StringBufferOperation` | O(n) | O(n) | StringBuffer edits/append over character sequence length. |

## Recommended Next Step

If you want this complexity information directly near each class, we can add a standard JavaDoc block at the top of every file:

```java
/**
 * Time Complexity: O(...)
 * Space Complexity: O(...)
 * Explanation: ...
 */
```

This guide keeps the details centralized first, which is easier to maintain as implementations evolve.
