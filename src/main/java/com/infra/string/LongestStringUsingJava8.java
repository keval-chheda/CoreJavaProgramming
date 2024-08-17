package com.infra.string;

import java.util.Arrays;
import java.util.List;

public class LongestStringUsingJava8 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("yogesh", "keval", "bhalu", "lomdi");

		String longestString = words.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
				.orElse("not available");
		System.out.println(longestString);

	}

}
