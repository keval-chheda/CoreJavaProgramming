package com.infra.string;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programmi";
		findDuplicateChar(str);

	}

	private static void findDuplicateChar(String str) {

		int[] charCount = new int[256]; // ascii

		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}
		System.out.println("Duplicate characters in the string:");
		for (int i = 0; i < 256; i++) {
			if (charCount[i] > 1) {
				System.out.println((char) i + ": " + charCount[i] + " times");
			}
		}
	}

}
