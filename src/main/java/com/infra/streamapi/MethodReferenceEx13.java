package com.infra.streamapi;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> methodR = s -> Integer.parseInt(s);
		Function<String, Integer> methodR1 = Integer::parseInt;
		Integer num = methodR.apply("123");
		System.out.println(methodR1.apply("234"));
		System.out.println(num);

		Consumer<String> methodR2 = s -> System.out.println(s);
		Consumer<String> methodR3 = System.out::println;
		methodR2.accept("keval");
		methodR3.accept("keval");

	}

}
