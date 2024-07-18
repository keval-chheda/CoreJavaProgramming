package com.infra.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateOverListEx08 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(Arrays.asList("keval", "chheda"));
		names.forEach(System.out::println);
	}

}
