package com.xenoteo.uniqueCharsInString;

import java.util.*;

/**
 * Implementing an algorithm to determine if a string has all unique characters.
 */
class Solution {
    /**
     * Array of chars representing given string.
     */
    private char[] arr;

    private void setArr(String str){
        arr = str.toCharArray();
    }


    /**
     * Checking if arr has all the characters unique in place.
     * Complexity is O(N^2).
     * @return is given string unique
     */
    public boolean isUniqueInPlace(String str){
        setArr(str);
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    /**
     * Checking if arr has all the characters unique using quick sort.
     * Complexity is O(N * log(N)).
     * @return is given string unique
     */
    public boolean isUniqueWithSorting(String str){
        setArr(str);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1]) return false;
        return true;
    }

    /**
     * Checking if arr has all the characters unique using HashSet.
     * Complexity is O(N) (as adding to a HashSet takes O(1)).
     * @return is given string unique
     */
    public boolean isUniqueWithSet(String str){
        setArr(str);
        Set<Character> set = new HashSet<>();
        for (char c : arr)
            if (!set.add(c)) return false;
        return true;
    }
}