package com.corejava.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TopThreeHighestNumber {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		int[] numbers = { 3, 2, 2, 1, 4, 5, 6, 7, 8, 9, 10 };
//
//		int[] topThree = Arrays.stream(numbers)
//				.boxed()
//				.sorted(Collections.reverseOrder())
//				.distinct()
//				.limit(3)
//				.mapToInt(Integer::intValue)
//				.toArray();
//		System.out.println("Top three highest numbers: " + Arrays.toString(topThree));

		List<Integer> numberslist = Arrays.asList(10, 50, 20, 70, 40, 60, 70);

		List<Integer> top3 = numberslist.stream().distinct().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println(top3);

		// find first element
		numberslist.stream().findFirst().ifPresent(System.out::println);
		Optional<Integer> first = numberslist.stream().findFirst();
		if(first.isPresent()) {
			System.out.println(first.get());
		}
		// find any element
		
	}

}
