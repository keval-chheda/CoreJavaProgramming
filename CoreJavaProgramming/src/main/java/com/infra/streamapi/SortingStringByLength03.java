package com.infra.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStringByLength03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names3 = new ArrayList<>(Arrays.asList("keval", "ceda", "aayush", "sharma"));
		Comparator<String> byLength3 = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		Collections.sort(names3, byLength3);
		
		System.out.println(names3);

// 1. Comparator to sort by string length (ascending order)

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		Comparator<String> byLength = (String s1, String s2) -> s1.length() - s2.length();
		Collections.sort(names, byLength);
		System.out.println(names);

//2, using  lambda for sorting
		List<String> names1 = Arrays.asList("John", "Jane", "Jack", "Doe");
		Collections.sort(names1, (a, b) -> a.compareTo(b));
		System.out.println(names1);

		names1.forEach(element -> System.out.println(element));

	}

}
