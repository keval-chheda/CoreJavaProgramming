package com.corejava.streams;

import java.util.function.Consumer;

public class StreamEx07 {

	public static void main(String[] args) {
		// Demonstrate a Consumer that prints a greeting for one name.
//		List<String> name = new ArrayList<>(Arrays.asList("keval", "chheda", "is", "only", "one"));
//		name.stream()
//		.filter(names -> names.startsWith("k"))
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
		Consumer<String> s = name -> System.out.println("Hello "+ name);
		s.accept("keval");
		System.out.println(s.toString());
	}

}
