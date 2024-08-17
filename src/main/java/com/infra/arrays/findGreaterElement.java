package com.infra.arrays;

public class findGreaterElement {
	
	public static void findRightBiggestElement(int[] a) {
		for(int i = a.length - 2; i > 0; i--) {
			int max = 0;
			if(a[i] > a[i + 1]) {
				max = a[i];
				System.out.println(max);
			}			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5, 3,1, -1, -3};
		findRightBiggestElement(a);
		
		
		

	}

}
