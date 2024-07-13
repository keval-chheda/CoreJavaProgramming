package com.infra.streamapi;

import java.util.function.Function;

@FunctionalInterface
 interface MyFunction{
	 int apply(int value);
	 
	 //default method
	 default int add(int a,int b) {
		 return a+b;
	 }
	 //multiply
	 static int multiply(int a, int b) {
		 return a*b;
	 }
 }

public class FunctionEx06{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> square = x -> x*x;
		Integer result =  square.apply(5);
		System.out.println(result);
		
		Function<String, Integer> length = String:: length;
		int len = length.apply("hello"); 
		System.out.println(len);
		
		Function<String, Integer> length1 = (String s) -> s.length();
		int len1 = length1.apply("hello");
		System.out.println(len1);

		MyFunction doublevalue = (int value) ->value*2;
		
		
		int result1 = doublevalue.apply(5);
		System.out.println(result1);
		
		int defaultresult = doublevalue.add(1, 2);
		System.out.println(defaultresult);
		
		int staticresult = MyFunction.multiply(1, 3);
		System.out.println(staticresult);

		
		
	}



}
