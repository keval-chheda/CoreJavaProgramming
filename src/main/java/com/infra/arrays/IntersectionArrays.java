package com.infra.arrays;

import java.util.Arrays;

public class IntersectionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int [] b = {2,3};
		
		Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> y==x)).distinct().forEach(System.out::println);
		

	}

}
