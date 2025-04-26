package com.infra.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry");

        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(word -> word, s -> s.length()));

        System.out.println(wordLengthMap); // Output: {Apple=5, Banana=6, Cherry=6}
    }
}

