package com.infra.corejava;

public class ReverseString {
	// reverse a string using a stringbuilder

	public static String reverseString(String s) {
		
		return new StringBuilder(s).reverse().toString();
	};

	public static void main(String[] args) {
		System.out.println("reverse String is" + reverseString("keval"));
	}
}
