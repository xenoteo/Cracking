package com.xenoteo.chapter1_arraysAndStrings.question1_3_URLify;

public class Main {
    private static final String OLD = "original string";
    private static final String NEW = "new string";

    public static void main(String[] args) {
        printOriginalAndReplacedString("Hello my dear world!");
        printOriginalAndReplacedString("under my thumb");
    }

    /**
     * Prints the original string and the string with replaced spaces.
     *
     * @param str  the original string.
     */
    private static void printOriginalAndReplacedString(String str){
        System.out.printf("%-15s: %s\n%-15s: %s\n\n",
                OLD, str,
                NEW, new Solution().getStringWithReplacedSpaces(str));
    }
}
