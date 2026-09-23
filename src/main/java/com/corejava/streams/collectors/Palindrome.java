package com.corejava.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("level", "world", "radar", "java", "madam");
        List<String> palindromes = words.stream()
                .filter(w -> IntStream.range(0, w.length()/2)
                        .allMatch(i -> w.charAt(i) == w.charAt(w.length() - 1 - i)))
                .collect(Collectors.toList());
        System.out.println("Palindromes: " + palindromes);
    }
}
