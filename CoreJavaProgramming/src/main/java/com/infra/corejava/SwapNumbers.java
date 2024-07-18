package com.infra.corejava;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		System.out.println("numbers befor swapping a = "+a+" and b = "+b);
		swapped(a, b);
	}

	private static void  swapped(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swap a = "+ a+ " and b = " +b);
	}

}
