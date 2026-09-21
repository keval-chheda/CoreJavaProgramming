# Time & Space Complexity Guide (All Programs)

This document lists each Java program in this repository with a quick complexity estimate and a one-line explanation.

> Notes:
> - `n` = number of elements/characters, `m` = size of second input where applicable.
> - For Stream API examples, complexity is based on the underlying traversal over collection size.
> - For utility/demo classes that mostly wire APIs (e.g., comparator, singleton), complexity is marked as constant/demo.

## Arrays

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `collections/arrays/UppercaseArrayElements` | O(n) | O(n) | Traverses all strings and creates uppercased output collection. |
| `collections/arrays/IntersectionArrays` | O(n + m) | O(min(n,m)) | Uses lookup structure to find common elements across two arrays. |
| `collections/arrays/PalindromeJava8` | O(n) | O(n) | Reverses/compares full string using stream or builder style operations. |
| `collections/arrays/PeakElement` | O(n) | O(1) | Scans array once to detect a peak candidate. |
| `collections/arrays/RemoveDuplicateFromArrayStream` | O(n) | O(n) | Distinct/filter pipeline walks all elements and stores seen values. |
| `collections/arrays/RemoveDuplicateArrayElements` | O(n²) | O(1) | Typical nested-check in-place duplicate removal approach. |
| `collections/arrays/TargetIndices` | O(n log n) | O(1) / O(n) | Sort plus scan to collect matching target positions. |
| `collections/arrays/GreaterElementFinder` | O(n) | O(1) | Single pass to evaluate greater/next-greater relation. |

## Core Java

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `basics/FactorialNumber` | O(n) | O(1) | Iterative multiplication from 1..n. |
| `basics/ForLoopExample` | O(n) | O(1) | Simple loop demonstration over n iterations. |
| `basics/PrimeNumberCheck` | O(√n) | O(1) | Checks divisibility up to square root of n. |
| `basics/ReverseString` | O(n) | O(n) | Uses builder/string operations creating reversed output. |
| `basics/ReverseStringWithCharacterArray` | O(n) | O(1) | In-place two-pointer character swaps. |
| `basics/ReverseStringWithLoop` | O(n) | O(n) | Builds reversed string via loop accumulation. |
| `basics/ReverseStringRecursively` | O(n) | O(n) | One recursive call per character; stack grows linearly. |
| `basics/SwapNumbers` | O(1) | O(1) | Constant number of arithmetic/temp operations. |
| `basics/ValidParenthesesCounter` | O(n) | O(n) | Stack/counter pass over expression characters. |

## DSA

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `collections/algorithm/BinarySearch` | O(log n) | O(1) | Halves search space each iteration. |
| `collections/algorithm/LinearSearch` | O(n) | O(1) | Sequential scan until target found/end. |
| `collections/linkedlist/IteratingLinkedList` | O(n) | O(1) | Visits each node once while iterating. |
| `collections/linkedlist/LinkedList` | O(n) (typical ops) | O(1) aux | Demonstrates standard linked-list traversals/updates. |
| `collections/linkedlist/SortLinkedList` | O(n log n) | O(log n) / O(1) | Linked-list sorting (typically merge-sort style). |
| `collections/map/CharCountMap` | O(n) | O(k) | Counts characters with hashmap (`k` distinct chars). |
| `collections/map/IteratorMap` | O(n) | O(1) | Iterates all map entries once. |
| `collections/stack/StackOperation` | O(1) per op | O(n) | Push/pop/peek are constant-time; stack stores n elements. |

## Strings

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `collections/strings/CharacterOccurrenceInString` | O(n) | O(k) | Frequency map over all characters. |
| `collections/strings/DuplicateCharacterString` | O(n) | O(k) | Tracks seen characters to identify duplicates. |
| `collections/strings/FirstNonRepeatingChar` | O(n) | O(k) | Count then first unique lookup in second pass. |
| `collections/strings/LongestStringUsingJava8` | O(n) | O(1) | Stream max-by-length over list of strings. |
| `collections/strings/PalindromeCheck` | O(n) | O(1) / O(n) | Two-pointer or reverse-based palindrome validation. |
| `collections/strings/RemoveDuplicates` | O(n) | O(k) | Set-based de-duplication preserving traversal order. |
| `collections/strings/ReverseString` | O(n) | O(n) | Reversed string creation from source text. |
| `collections/strings/CharacterOccurrenceUsingArray` | O(n) | O(1) / O(k) | Array/map counters based on alphabet domain. |

## Stream API

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `streams/CalculateSquareEx10` | O(n) | O(n) | Maps each input to square and collects result. |
| `streams/CollectToMap` | O(n) | O(n) | Converts stream elements into map entries. |
| `streams/CollectorJoining` | O(n) | O(n) | Joins all elements into a single output string. |
| `streams/collectors/CollectorsToMap` | O(n) | O(n) | Collector builds map by traversing all values. |
| `streams/ComparatorExample` | O(n log n) | O(n) | Sorting with comparator dominates runtime. |
| `streams/ConsumerExample` | O(n) | O(1) | Applies consumer action to each element once. |
| `streams/EmployeeAvgSalary` | O(n) | O(1) / O(g) | Aggregate average by traversal (or grouped average). |
| `streams/FilterNumbersEx01` | O(n) | O(n) | Filters list and collects matching elements. |
| `streams/FrequencyEachCharacter` | O(n) | O(k) | Groups/counts character frequency in one pass. |
| `streams/FunctionExample` | O(1) / O(n) | O(1) | Function application; linear if applied across list. |
| `streams/FunctionEx13` | O(1) / O(n) | O(1) | Demonstrates functional mapping usage. |
| `streams/GroupingExample` | O(n) | O(g) | Groups stream elements by key/category. |
| `streams/IterateOverListEx08` | O(n) | O(1) | Iteration across all list elements. |
| `streams/LambdaStringtoUppercaseEx11` | O(n) | O(n) | Converts all strings to uppercase and stores results. |
| `streams/MethodReferenceExample` | O(n) | O(1) / O(n) | Method reference over stream/list traversal. |
| `streams/PredicateExample` | O(n) | O(n) | Predicate-based filtering over elements. |
| `streams/ReduceExample12` | O(n) | O(1) | Reduction combines all elements once. |
| `streams/SeparateOddEven` | O(n) | O(n) | Partitions input into odd/even buckets. |
| `streams/SortingStringByLength03` | O(n log n) | O(n) | Sort by key (length) with comparator. |
| `streams/StreamAPI` | O(n) | O(n) | General stream operations over full input collection. |
| `streams/StreamEx07` | O(n) | O(n) | Typical map/filter/collect pipeline. |
| `streams/SumEvenNumberEx09` | O(n) | O(1) | Filters evens then sums through traversal. |
| `streams/SummationUsingStream` | O(n) | O(1) | Single-pass summation reduction. |

## Other Topic Demos

| Program | Time | Space | Explanation |
|---|---:|---:|---|
| `designpattern/FactoryPattern` | O(1) | O(1) | Object creation dispatch by type for small fixed set. |
| `designpattern/Singleton` | O(1) | O(1) | Constant-time instance retrieval. |
| `collections/sorting/LambdaCompareToExample` | O(n log n) | O(1) / O(n) | Comparison used in sorting operations. |
| `collections/sorting/EmployeeComparator` | O(n log n) | O(1) / O(n) | Comparator cost usually seen during sort. |
| `hashmap/ConcurrentHashMapEx` | O(1) avg per op | O(n) | Average constant-time map put/get; stores n entries. |
| `hashmap/SynchronizedHashMapExample` | O(1) avg per op | O(n) | Same hashmap behavior with synchronization overhead. |
| `methodreference/ConstructorReferenceExample` | O(1) | O(1) | Constructor reference invocation demo. |
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
