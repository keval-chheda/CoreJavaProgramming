package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream().collect(Collectors.partitioningBy(n -> n%2==0));
		
		List<Integer> even = partitionedNumbers.get(true);
		List<Integer> odd = partitionedNumbers.get(false);
		
		System.out.println(even);
		System.out.println(odd);
		

	}

}
	