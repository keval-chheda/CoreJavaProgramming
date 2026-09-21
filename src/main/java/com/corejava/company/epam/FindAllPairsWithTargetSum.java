package com.corejava.company.epam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * EPAM Curated Question 2 - Medium Level
 * 
 * Problem: Find all pairs in an array that sum to a target value
 * 
 * Example: arr = {2, 4, 3, 5, 7, 8, 9, 1}
 *          target = 10
 * Output: [2, 8], [4, 6], [3, 7], [1, 9]
 * 
 * Approach: Use HashSet for O(n) time complexity
 * 1. Iterate through array
 * 2. For each element, check if (target - element) exists in HashSet
 * 3. Add element to HashSet
 * 4. Use TreeSet to store pairs to avoid duplicates and maintain order
 */
public class FindAllPairsWithTargetSum {

	public static List<String> findPairs(int[] arr, int target) {
        System.out.println("I AM ARRAYS OF STRING UPPERCASE");

        Set<Integer> seen = new HashSet<>();
		Set<String> pairs = new HashSet<>();
		
		for (int num : arr) {
			int complement = target - num;
			if (seen.contains(complement)) {
				// Store pair in sorted order to avoid duplicates like [2,8] and [8,2]
				String pair = Math.min(num, complement) + "," + Math.max(num, complement);
				pairs.add(pair);
			}
			seen.add(num);
		}
		
		return new ArrayList<>(pairs);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9, 1 };
		int target = 10;
		
		List<String> result = findPairs(arr, target);
		System.out.println("Array: " + java.util.Arrays.toString(arr));
		System.out.println("Target Sum: " + target);
		System.out.println("Pairs that sum to target:");
		result.forEach(pair -> System.out.println("[" + pair + "]"));
	}

}
