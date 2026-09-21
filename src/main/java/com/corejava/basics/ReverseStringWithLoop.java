package com.corejava.basics;

public class ReverseStringWithLoop {

	public static void main(String[] args) {
		// Build the reversed text by traversing the input from right to left.

		String originalString = "keval";
		System.out.println("reverse string is"+ reverseString(originalString));
	}

	private static String reverseString(String originalString) {
		String reverse ="";
		for(int i = originalString.length() -1; i>=0; i--) {
			reverse += originalString.charAt(i);
		}
		return reverse;
	}

}
