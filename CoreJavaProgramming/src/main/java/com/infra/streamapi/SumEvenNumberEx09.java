package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumberEx09 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sum = numbers.stream()
		.filter(n -> n % 2==0)
		.mapToInt(Integer::intValue)
		.sum();
		
		System.out.println(sum);
	}

}
