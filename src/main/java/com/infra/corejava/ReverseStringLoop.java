package com.infra.corejava;

public class ReverseStringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
