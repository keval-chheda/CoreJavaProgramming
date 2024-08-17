package com.infra.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayStream {

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 3, 4, 5, 6, 7, 8, 8 };

		Set<Integer> uniqueSet = Arrays.stream(numbers).collect(Collectors.toSet());
//		System.out.println(uniqueNumbers);
		Integer[] uniqueNumber = uniqueSet.toArray(new Integer[0]);

		System.out.println(Arrays.toString(uniqueNumber));
	}

}
