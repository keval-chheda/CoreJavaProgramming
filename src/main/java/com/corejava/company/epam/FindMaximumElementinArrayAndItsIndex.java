package com.corejava.company.epam;

import java.util.Arrays;

public class FindMaximumElementinArrayAndItsIndex {

	public static void main(String[] args) {
		// Scan the array to find its maximum value and index.
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int max = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		int indexOfMax = Arrays.asList(arr).indexOf(max);
		System.out.println("Index of maximum element in the array using Arrays.asList() method is: " + indexOfMax);
		System.out.println("Maximum element in the array is: " + max);
		System.out.println("Index of maximum element in the array is: " + index);

	}

}
