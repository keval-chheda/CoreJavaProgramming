package com.corejava.collections.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrenceInString {

	public static void main(String[] args) {
		// Group matching characters and count their occurrences with a stream.
		String name = "Keval Chheda";
		Map<Character, Long> countCharacter = name.chars()
				.mapToObj(s -> (char)s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
//		countCharacter.forEach((character, count) -> System.out.println(character+":"+ count));
		System.out.println(countCharacter);
	}

}
