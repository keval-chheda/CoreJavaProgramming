package com.corejava.company.cognizant;

public class FindLongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Find the Longest Substring Without Repeating Characters
		String input = "abcabcbb";
		findLongestSubstringWithoutRepeatingCharacters(input);

	}

	private static void findLongestSubstringWithoutRepeatingCharacters(String input) {
		// TODO provide implementation
		int n = input.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substring = input.substring(i, j);
				if (hasUniqueCharacters(substring)) {
					System.out.println("Substring: " + substring);
				}
			}
		}
		
	}

	private static boolean hasUniqueCharacters(String substring) {
		// TODO provide implementation
		for (int i = 0; i < substring.length(); i++) {
			for (int j = i + 1; j < substring.length(); j++) {
				if (substring.charAt(i) == substring.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

}
