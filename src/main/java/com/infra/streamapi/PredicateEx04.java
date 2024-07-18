package com.infra.streamapi;

import java.util.function.Predicate;

public class PredicateEx04 {

	public static void main(String[] args) {

		Predicate<String> isEmpty = s -> s.isEmpty();
		boolean result = isEmpty.test("1");
		System.out.println(result);
	}

}
