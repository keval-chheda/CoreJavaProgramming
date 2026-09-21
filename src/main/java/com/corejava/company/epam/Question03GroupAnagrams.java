package com.corejava.company.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * EPAM Java interview preparation - Question 3.
 *
 * <p>Problem: Group words that are anagrams of one another.</p>
 *
 * <p>Tracking record:</p>
 * <ul>
 *   <li>Question number: 3</li>
 *   <li>Topic: Strings, collections, HashMap, sorting</li>
 *   <li>Pattern: Canonical key / frequency grouping</li>
 *   <li>Difficulty: Medium</li>
 *   <li>Relevance: EPAM-style / representative Java interview pattern</li>
 *   <li>Status: Newly given</li>
 * </ul>
 *
 * <p>Two words are anagrams when they contain the same characters with the
 * same frequencies, even if their order differs. For example, "eat", "tea",
 * and "ate" belong to one group.</p>
 *
 * <p>The preferred approach uses a sorted version of each word as a canonical
 * key. All words with the same key are placed in the same map entry.</p>
 *
 * <p>Time complexity: O(n * k log k), where n is the number of words and k is
 * the maximum word length.</p>
 *
 * <p>Space complexity: O(n * k), including the grouped result and keys.</p>
 */
public class Question03GroupAnagrams {

    /**
     * Groups anagrams while preserving the order in which groups first appear.
     *
     * @param words input words; null is not a valid input
     * @return groups of anagrams
     * @throws IllegalArgumentException when words is null
     */
    public static List<List<String>> groupAnagrams(String[] words) {
        if (words == null) {
            throw new IllegalArgumentException("Input words must not be null");
        }

        Map<String, List<String>> groupsByKey = new LinkedHashMap<>();

        for (String word : words) {
            if (word == null) {
                throw new IllegalArgumentException("Input words must not contain null");
            }

            char[] characters = word.toCharArray();
            Arrays.sort(characters);
            String canonicalKey = new String(characters);

            groupsByKey
                    .computeIfAbsent(canonicalKey, key -> new ArrayList<>())
                    .add(word);
        }

        return new ArrayList<>(groupsByKey.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(words);

        System.out.println("Input: " + Arrays.toString(words));
        System.out.println("Grouped anagrams: " + result);
    }
}
