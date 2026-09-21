package com.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStringtoUppercaseEx11 {

	public static void main(String[] args) {
		// Convert every name to uppercase with a stream mapping operation.
		List<String> names = Arrays.asList("keval", "aayush", "rishi");
		List<String> uppercase = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);

		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
