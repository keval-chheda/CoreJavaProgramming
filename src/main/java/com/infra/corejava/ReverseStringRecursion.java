package com.infra.corejava;

public class ReverseStringRecursion {
    public static String reverseRecursion(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverseRecursion(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseRecursion(input);
        System.out.println(reversed);  // Output: "olleh"
    }
}

