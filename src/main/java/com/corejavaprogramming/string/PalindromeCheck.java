package com.corejavaprogramming.string;

/**
 * Using two pointer approach
*/
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";

        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

/**
 *  Using StringBuilder 
 *  */
//public class PalindromeCheck {
//    public static void main(String[] args) {
//        String input = "madam";
//
//        String reversed = new StringBuilder(input).reverse().toString();
//
//        if (input.equals(reversed)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//    }
//}