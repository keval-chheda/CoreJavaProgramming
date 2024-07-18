package com.infra.corejava;

public class ValidParenthesesCounter {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isValid("(){}[]"));    // true
        System.out.println(isValid("([{}])"));    // true
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      // true
        System.out.println(isValid("((()))"));    // true
        System.out.println(isValid(""));          // true
        System.out.println(isValid("("));         // false
    }

    public static boolean isValid(String s) {
        int round = 0, curly = 0, square = 0;
        
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': round++; break;
                case ')': round--; break;
                case '{': curly++; break;
                case '}': curly--; break;
                case '[': square++; break;
                case ']': square--; break;
            }
            
            // Check if any counter goes negative
            if (round < 0 || curly < 0 || square < 0) {
                return false;
            }  
        }
        // Check if all counters are zero
        return round == 0 && curly == 0 && square == 0;
    }
}

