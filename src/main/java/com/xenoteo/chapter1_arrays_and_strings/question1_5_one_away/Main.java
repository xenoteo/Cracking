package com.xenoteo.chapter1_arrays_and_strings.question1_5_one_away;

public class Main {
    public static void main(String[] args) {
        printIsOneAway("helo", "hello");
        printIsOneAway("hello", "world");
    }

    /**
     * Prints the result of calling isOneAway() methods for two given strings.
     *
     * @param str1  the first string
     * @param str2  the second string
     */
    private static void printIsOneAway(String str1, String str2){
        System.out.printf("\"%s\" & \"%s\": %b\n", str1, str2, new Solution().isOneAway(str1, str2));
    }
}
