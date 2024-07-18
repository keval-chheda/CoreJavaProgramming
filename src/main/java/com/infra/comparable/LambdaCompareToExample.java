package com.infra.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaCompareToExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));
        
        // Sorting using lambda expression with compareTo
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.stream().sorted().forEach(System.out::print);
        
        
        System.out.println("Sorted names: " + names);
    }
}

