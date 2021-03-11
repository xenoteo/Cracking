package com.xenoteo.arraysAndStrings.checkPermutation;

public class Main {
    private static final String WITH_SORTING = "with sorting";
    private static final String WITH_MAP = "with map";


    public static void main(String[] args) {
        printIsPermutation("helol", "hello");
        printIsPermutation("world", "hello");
    }

    /**
     * Printing whether one of the given strings is a permutation af the other, using different approaches.
     * @param str1 is the first string
     * @param str2 is the second string
     */
    public static void printIsPermutation(String str1, String str2){
        Solution solution = new Solution();
        System.out.printf("\"%s\" & \"%s\"\n%-13s: %b\n%-13s: %b\n\n",
                str1, str2,
                WITH_SORTING, solution.isPermutationWithSorting(str1, str2),
                WITH_MAP, solution.isPermutationWithMap(str1, str2));
    }
}
