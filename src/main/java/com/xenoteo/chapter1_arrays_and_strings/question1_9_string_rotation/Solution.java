package com.xenoteo.chapter1_arrays_and_strings.question1_9_string_rotation;

/**
 * Given two strings checking if the second is a rotation of the first using only one call to contains().
 */
public class Solution {
    /**
     * Checks if str2 is a rotation of str1.
     * Complexity is O(N).
     *
     * @param str1  the first string
     * @param str2  the second string
     * @return is str2 a rotation of str1
     */
    public boolean isRotation(String str1, String str2){
        int len = str1.length();
        if (len == str2.length() && len > 0)
            return ((str2 + str2).contains(str1));
        return false;
    }
}
