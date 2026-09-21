package com.corejava.basics;

public class ReverseStringWithCharacterArray {

	public static void main(String[] args) {
		// Reverse the input text by swapping characters in an array.

		String s="keval";
		System.out.println("reverse string is "+reverseCharacterArray(s));
	}

	private static String reverseCharacterArray(String s) {
		char[] charArray =s.toCharArray();
		int left = 0, right= charArray.length - 1;
		while(left< right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	}

}
