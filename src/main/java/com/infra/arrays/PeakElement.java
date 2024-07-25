package com.infra.arrays;

public class PeakElement {

	public static int findPeakElement(int[] arr, int n) {
		if (n == 1) {
			return 0;
		}
		if(arr[0] >arr[1]) {
			return 0;
		}
		if(arr[n-2] <= arr[n-1]) {
			return n-1;
		}
		for(int i = 1; i<arr.length - 1; i++) {
			if(arr[i] >= arr[i+1] && arr[i] > arr[i-1]) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,1,2,2,2};
		int n = a.length;
		findPeakElement(a, n);

	}

}
