package com.infra.arrays;

public class TargetIndices {

	public static void main(String[] args) {
		Integer[] array = { -1, 7, -2, 1, 2, 3, 4, 11 };
		int a = 9;

		for (int i = 0; i < array.length; i++) { // loop until the last element
			for (int j = i + 1; j < array.length; j++) { // loop from the next element to the end
//				System.out.println(array[i] + "," + array[j]);
				if (array[i] + array[j] == a) {
					System.out.println("Indices: " + i + "," + j);
					System.out.println("Elements: " + array[i] + "," + array[j]);
				}
			}
		}
	}
}

