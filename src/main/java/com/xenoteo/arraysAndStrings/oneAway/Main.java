package com.xenoteo.arraysAndStrings.oneAway;

public class Main {
    public static void main(String[] args) {
        printIsOneAway("helo", "hello");
        printIsOneAway("hello", "world");
    }

    /**
     * Printing the result of calling isOneAway() methods for two given strings.
     * @param str1 is the first string
     * @param str2 is the second string
     */
    private static void printIsOneAway(String str1, String str2){
        System.out.printf("\"%s\" & \"%s\": %b\n", str1, str2, new Solution().isOneAway(str1, str2));
    }
}
