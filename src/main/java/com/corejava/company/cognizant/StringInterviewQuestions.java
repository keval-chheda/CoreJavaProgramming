package com.corejava.company.cognizant;

import java.util.HashMap;
import java.util.Map;

/**
 * Common Cognizant string problems for experienced Java interviews.
 */
public final class StringInterviewQuestions {

    private StringInterviewQuestions() {
    }

    /**
     * Finds the length of the longest substring without repeated characters.
     */
    public static int longestSubstringWithoutRepeating(String input) {
        Map<Character, Integer> lastIndexByCharacter = new HashMap<>();
        int windowStart = 0;
        int maximumLength = 0;

        for (int index = 0; index < input.length(); index++) {
            Character character = input.charAt(index);
            if (lastIndexByCharacter.containsKey(character)) {
                windowStart = Math.max(windowStart,
                        lastIndexByCharacter.get(character) + 1);
            }
            lastIndexByCharacter.put(character, index);
            maximumLength = Math.max(maximumLength, index - windowStart + 1);
        }
        return maximumLength;
    }

    /**
     * Returns the first character that occurs exactly once.
     */
    public static Character firstNonRepeatingCharacter(String input) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char character : input.toCharArray()) {
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }
        for (char character : input.toCharArray()) {
            if (frequencies.get(character) == 1) {
                return character;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeating("abcabcbb"));
        System.out.println(firstNonRepeatingCharacter("swiss"));
    }
}
