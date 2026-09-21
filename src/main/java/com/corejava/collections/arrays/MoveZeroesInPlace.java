package com.corejava.collections.arrays;

public class MoveZeroesInPlace {

	public static void main(String[] args) {
		// Move every zero to the end while preserving non-zero order.
		int[] nums = {0, 1, 0, 3, 12};
		System.out.println("Before moving zeroes: "+ java.util.Arrays.toString(nums));
		
		//using in-place algorithm two pointer approach
//		moveZeroes(nums);
//		System.out.println("After moving zeroes: "+ java.util.Arrays.toString(nums));
		
		//using in-place algorithm single pointer approach
		moveZeroesSinglePointer(nums);
		System.out.println("After moving zeroes using single pointer: "+ java.util.Arrays.toString(nums));
		

	}

	private static void moveZeroesSinglePointer(int[] nums) {
		// Compact non-zero values with one write pointer, then fill trailing positions with zeroes.
		int nonZeroIndex = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}
		while(nonZeroIndex < nums.length) {
			nums[nonZeroIndex++] = 0;
		}
		
	}

//	private static void moveZeroes(int[] nums) {
//				// Move zeroes to the end of the array using in-place algorithm two pointer approach
//				for(int i = 0; i < nums.length; i++) {
//					if(nums[i] == 0) {
//						for(int j = i; j < nums.length - 1; j++) {
//							nums[j] = nums[j + 1];
//						}
//						nums[nums.length - 1] = 0;
//					}
//				}
//	}
	
	

}
