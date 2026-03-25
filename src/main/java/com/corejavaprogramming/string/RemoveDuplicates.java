package com.corejavaprogramming.string;

import java.util.LinkedHashSet;

/**
 * using linkedHashSet
*/
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        System.out.println("Result: " + result);
    }
}

/**
 * using hashSet- order will not be preserved */
 */
 
//
// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         String input = "programming";
//
//         HashSet<Character> set = new HashSet<>();
//         StringBuilder result = new StringBuilder();
//
//         for (char c : input.toCharArray()) {
//             if (!set.contains(c)) {
//                 set.add(c);
//                 result.append(c);
//             }
//         }
//
//         System.out.println("Result: " + result);
//     }
// }
 
	/**
	 *  without using extra DS
	 */ 
// public class RemoveDuplicates {
//	    public static void main(String[] args) {
//	        String input = "programming";
//	        String result = "";
//
//	        for (int i = 0; i < input.length(); i++) {
//	            char current = input.charAt(i);
//
//	            if (result.indexOf(current) == -1) {
//	                result += current;
//	            }
//	        }
//
//	        System.out.println("Result: " + result);
//	    }
//	}