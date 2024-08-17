package com.infra.streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello WOrld";
		
		Map<Character, Long> freq = input.trim().chars()
				.mapToObj(s -> (char)s)
				.filter(s -> s!= ' ')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		freq.entrySet().stream()
        .sorted(Map.Entry.comparingByKey()) // Sort by character (key)
        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		
	freq.forEach((character, count) -> System.out.println(character + ": " + count));

		System.out.println(freq);

	}

}
