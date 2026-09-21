package com.corejava.collections.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseArrayElements {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("yogesh", "bhalu", "keval","aayush");
		List<String> newnames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(newnames);
		
	}

}

