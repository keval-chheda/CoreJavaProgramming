package com.infra.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("keval", "yogesh", "nayan");
		
		StringBuilder s1 = new StringBuilder("nayan");
		System.out.println(s1.reverse().toString());

		List<String> palindromeword = words.stream()
				.filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
				.collect(Collectors.toList());
		System.out.println(palindromeword);
	}

}
