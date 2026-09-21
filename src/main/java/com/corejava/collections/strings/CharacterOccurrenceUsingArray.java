package com.corejava.collections.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrenceUsingArray {
	
	public static void main(String args[]) {
		// Count alphabetic characters with a fixed-size frequency array.
		String senetence = "counting characters";
		
		Map<String, Long> countCharacter = Arrays.stream(senetence.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countCharacter);

	}

}
