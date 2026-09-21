package com.corejava.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class findGreaterElement {
	
	public static void findRightBiggestElement(int[] a) {
		for(int i = a.length - 2; i > 0; i--) {
			int max = 0;
			if(a[i] > a[i + 1]) {
				max = a[i];
//				System.out.println(max);
			}			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5, 3,1, -1, -3};
		Integer max = Arrays.stream(a).max().getAsInt();
//		System.out.println("Max element in the array is: " + max);
		Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
		findRightBiggestElement(a);
		
		
		

	}

}

