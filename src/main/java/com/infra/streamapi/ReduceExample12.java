package com.infra.streamapi;

import java.util.Arrays;
import java.util.List;

public class ReduceExample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sum = number.stream()
		.reduce(0,Integer::sum);
		System.out.println(sum);
		
		

	}

}
