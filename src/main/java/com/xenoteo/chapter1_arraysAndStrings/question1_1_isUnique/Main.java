package com.xenoteo.chapter1_arraysAndStrings.question1_1_isUnique;

public class Main {
    private static final String IN_PLACE = "in place";
    private static final String WITH_SORTING = "with sorting";
    private static final String WITH_SET = "with set";

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        printAreCharsInStrUnique(str1);
        printAreCharsInStrUnique(str2);
    }

    /**
     * Prints the result of checking if all the chars of a given string are unique, using different approaches.
     *
     * @param str  the provided string
     */
    private static void printAreCharsInStrUnique(String str){
        Solution ex = new Solution();
        System.out.printf("\"%s\"\n%-13s: %b\n%-13s: %b\n%-13s: %b\n\n",
                str,
                IN_PLACE, ex.isUniqueInPlace(str),
                WITH_SORTING, ex.isUniqueWithSorting(str),
                WITH_SET, ex.isUniqueWithSet(str));
    }
}
