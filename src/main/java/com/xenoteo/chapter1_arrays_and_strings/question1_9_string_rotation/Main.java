package com.xenoteo.chapter1_arrays_and_strings.question1_9_string_rotation;

public class Main {
    public static void main(String[] args) {
        printIsRotation("waterbottle", "erbottlewat");
    }

    /**
     * Prints two given strings and the result of calling isRotation()
     *
     * @param str1  the first string
     * @param str2  the second string
     */
    private static void printIsRotation(String str1, String str2){
        System.out.printf("\"%s\" & \"%s\": %b\n",
                str1, str2, new Solution().isRotation(str1, str2));
    }
}
