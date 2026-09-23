package com.corejava.company.cognizant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Common Cognizant array problems for experienced Java interviews.
 */
public final class ArrayInterviewQuestions {

    private ArrayInterviewQuestions() {
    }

    /**
     * Returns the indexes of two values whose sum equals the target.
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            if (indexByValue.containsKey(complement)) {
                return new int[] {indexByValue.get(complement), index};
            }
            indexByValue.put(numbers[index], index);
            System.out.println("Index by value map: " + indexByValue);
        }
        return new int[0];
    }

    /**
     * Finds the maximum sum of a contiguous subarray.
     */
    public static int maximumSubarraySum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int current = numbers[0];
        int maximum = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            current = Math.max(numbers[index], current + numbers[index]);
            maximum = Math.max(maximum, current);
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        System.out.println("Two-sum indexes: "
                + Arrays.toString(twoSum(numbers, 9)));
        //using set approach
        System.out.println("Two-sum indexes using set: "
                + Arrays.toString(twoSumUsingSet(numbers, 9)));
        System.out.println("Maximum subarray sum: "
                + maximumSubarraySum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static long[] twoSumUsingSet(int[] numbers, int target) {
        Set<Integer> set = new java.util.HashSet<>();
        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            if (set.contains(index)) {
                return new long[] {numbers[complement], numbers[index]};
            }
            set.add(index);
        }
        return new long[0];
    }
}
