package com.infra.corejava;

public class FactorialNumber {

	public static void main(String[] args) {

		int number = 5;
		int result = factorial(number);
		System.out.println("factorial of a number is " + result);

	}

	private static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
