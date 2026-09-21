package com.corejava.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
	
	//Second highest number using Streams
	public static void main(String[] args) {
//		int[] numbers = { 3, 2, 2, 1, 4, 5, 6, 7, 8, 9, 10 };
//		int secondHighest = Arrays.stream(numbers)
//				.boxed()
//				.sorted(Collections.reverseOrder())
//				.distinct()
//				.skip(1)
//				.findFirst()
//				.orElseThrow(() -> new RuntimeException("No second highest number found"));

        List<Integer> numbers = Arrays.asList(10, 20, 40, 50, 30, 50, 40);

        int secondHighest = numbers.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
				.orElseThrow(() -> new RuntimeException("No second highest number found"));
		
		System.out.println("Second highest number: " + secondHighest);
	}

}
