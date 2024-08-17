package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class SummationUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1223456789";
		
//		char[] numbers = number.toCharArray();
		DoubleStream numbers = number.chars().mapToDouble(c -> (char)c);
//		List<Integer> summation = Arrays.stream(numbers)
	
//		System.out.println(numbers.);
		

	}

}
