package com.xenoteo.arraysAndStrings.stringRotation;

/**
 * Given two strings checking if the second is a rotation of the first using only one call to contains().
 */
public class Solution {
    /**
     * Checking if str2 is a rotation of str1.
     * Complexity is O(N).
     * @param str1 is the first string
     * @param str2 is the second string
     * @return is str2 a rotation of str1
     */
    public boolean isRotation(String str1, String str2){
        int len = str1.length();
        if (len == str2.length() && len > 0)
            return ((str2 + str2).contains(str1));
        return false;
    }
}
