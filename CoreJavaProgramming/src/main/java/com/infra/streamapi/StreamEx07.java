package com.infra.streamapi;

import java.util.function.Consumer;

public class StreamEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
