package com.infra.reccursion;

public class PrintNumbersRecursion {
	
	public static void printNumbers(int n) {
		
		if(n <= 100) {	
		System.out.println(n);
		printNumbers(n + 1);
		}
		
	}

	public static void main(String[] args) {
		printNumbers(1);
		

	}

}
