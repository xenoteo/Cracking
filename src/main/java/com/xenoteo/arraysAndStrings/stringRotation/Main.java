package com.xenoteo.arraysAndStrings.stringRotation;

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
