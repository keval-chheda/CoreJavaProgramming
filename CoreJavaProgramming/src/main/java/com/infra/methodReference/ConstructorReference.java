package com.infra.methodReference;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ConstructorReference {

	public static void main(String[] args) {

//		Supplier<ArrayList<String>> lambda = () -> new ArrayList<>();
		Supplier<ArrayList<String>> methodRef = ArrayList::new;
		ArrayList<String> list = methodRef.get();
		list.add("Hello");
		System.out.println(list); // Output: [Hello]
	}
}
