package com.infra.streamapi.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("keval","rahul","keyur");
		Map<String, Integer> wordLengthMap = words.stream()
				.collect(Collectors.toMap(word -> word, String::length));
		System.out.println(wordLengthMap);
	}

}	
