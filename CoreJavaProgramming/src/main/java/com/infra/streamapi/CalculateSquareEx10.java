package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;

public class CalculateSquareEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numbers.stream().map(n -> n * n).forEach(System.out::println);
	}

}
