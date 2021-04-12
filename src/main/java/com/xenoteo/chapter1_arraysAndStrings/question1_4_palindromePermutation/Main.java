package com.xenoteo.chapter1_arraysAndStrings.question1_4_palindromePermutation;

public class Main {
    private static final String WITH_SORTING = "with sorting";
    private static final String WITH_MAP = "with map";

    public static void main(String[] args) {
        printIsPalindrome("taCo cAT");
        printIsPalindrome("hello charming");
    }

    /**
     * Prints the result of checking whether given string is a permutation of a palindrome using different approaches.
     *
     * @param str  the string to be checked
     */
    private static void printIsPalindrome(String str){
        Solution solution = new Solution();
        System.out.printf("\"%s\"\n%-13s: %b\n%-13s: %b\n\n",
                str,
                WITH_SORTING, solution.isPalindromePermutationWithSorting(str),
                WITH_MAP, solution.isPalindromePermutationWithMap(str));
    }
}
