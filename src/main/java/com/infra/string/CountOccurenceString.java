package com.infra.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Keval Chheda";
		Map<Character, Long> countCharacter = name.chars()
				.mapToObj(s -> (char)s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		countCharacter.forEach((character, count) -> System.out.println(character+":"+ count));
	}

}
