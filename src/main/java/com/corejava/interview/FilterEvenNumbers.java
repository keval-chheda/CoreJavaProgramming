package com.corejava.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

//	Filter even numbers.
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 1, 4, 5, 6, 7, 8, 9, 10);
//
//		System.out.println("Even Numbers:");
//		numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
//
//		System.out.println("Square of every Numbers:");
//		numbers.stream().map(n -> n*n).forEach(System.out::println);

		System.out.println("Remove duplicate numbers:");
//		numbers.stream().distinct().forEach(System.out::println);
//		Set<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toSet());
//		System.out.println(distinctNumbers);
//		List<Integer> distinctNumbers = new ArrayList<>(new LinkedHashSet<>(numbers));
//		System.out.println(distinctNumbers);
		numbers.stream().sorted().distinct().forEach(System.out::println);
//		numbers.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
		Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max number: " + max);
//		Integer min = numbers.stream().min(Integer::compareTo).get();
//		System.out.println("Min number: " + min);
	}
}
