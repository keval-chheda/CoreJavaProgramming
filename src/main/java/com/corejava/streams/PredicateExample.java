package com.corejava.streams;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> isEmpty = s -> s.isEmpty();
		boolean result = isEmpty.test("1");
		System.out.println(result);
	}

}

