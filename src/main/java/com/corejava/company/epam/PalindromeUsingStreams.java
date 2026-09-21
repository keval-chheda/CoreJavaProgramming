package com.corejava.company.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PalindromeUsingStreams {

	public static void main(String[] args) {
		// TODO return palindrome using streams of list of strings
		List<String> words = Arrays.asList("level", "hello", "world", "radar", "java", "python", "madam");
		List<String> palindromes = words.stream()
				.filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
				.collect(java.util.stream.Collectors.toList());
		
		//without using StringBuilder
		List<String> palindromesWithoutStringBuilder = words.stream()
				.filter(word -> IntStream.range(0, word.length() / 2)
						.allMatch(i -> word.charAt(i) == word.charAt(word.length() - 1 - i)))
				.collect(java.util.stream.Collectors.toList());
		System.out.println("Palindromes using StringBuilder: " + palindromes);
		System.out.println("Palindromes without using StringBuilder: " + palindromesWithoutStringBuilder);
	}

	
	private static boolean isPalindromes(String word) {
		// TODO check if the word is palindrome
		String reversed = new StringBuilder(word).reverse().toString();
		return word.equals(reversed);
	}

}
