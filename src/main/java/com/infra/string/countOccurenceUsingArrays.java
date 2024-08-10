package com.infra.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countOccurenceUsingArrays {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String senetence = "counting characters";
		
		Map<String, Long> countCharacter = Arrays.stream(senetence.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countCharacter);

	}

}
