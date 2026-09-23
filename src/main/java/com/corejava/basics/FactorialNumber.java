package com.corejava.basics;

public class FactorialNumber {

	public static void main(String[] args) {
		int number = 5;
		int result = factorialforLoop(number);
		System.out.println("factorial of a number using For loop " + result);

        int result1 = factorialWhileLoop(number);
        System.out.println("factorial of a number using While loop " + result1);
	}

    private static int factorialforLoop(int number) {
        if (number == 0){
            return 1;
        }else {
                for (int i = number - 1; i > 0; i--) {
                    number = number * i;
                }
        }
        return number;
    }

    private static int factorialWhileLoop(int number) {
        int result = 1;
        while (number > 0) {
            result *= number;
            number--;
        }
        return result;
    }
}

