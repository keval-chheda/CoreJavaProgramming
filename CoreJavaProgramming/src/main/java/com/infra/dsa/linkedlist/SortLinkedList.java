package com.infra.dsa.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("yogesh", "keval", "aayush", "harsh");

		// using collections
//		Collections.sort(names, (s1, s2) -> s2.compareTo(s1));

		// directly using inbuilt function
//		names.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

		// directly streaming object
//		names.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(s -> System.out.println(s));

		// storing in new list
		List<String> newList = names.stream().sorted((s1, s2) -> s1.compareTo(s2))
				.peek(System.out::println)
				.collect(Collectors.toList());
		
//		List<String> newList2 = names.stream().sorted((s1, s2) -> s1.compareTo(s2))
//              .peek(s -> System.out.println("Processing: " + s))
//			   .collect(Collectors.toList());

//		System.out.println(newList);
	}

}
