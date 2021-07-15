package com.xenoteo.chapter1_arrays_and_strings.question1_1_is_unique;

import java.util.*;

/**
 * Implementing an algorithm to determine if a string has all unique characters.
 */
class Solution {

    /**
     * Checks if the string has all the characters unique in place.
     * Complexity is O(N^2).
     *
     * @return is the given string unique
     */
    public boolean isUniqueInPlace(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
            for (int j = 0; j < i; j++)
                if (chars[i] == chars[j]) return false;
        return true;
    }

    /**
     * Checks if the string has all the characters unique using sort.
     * Complexity is O(N * log(N)).
     *
     * @return is given string unique
     */
    public boolean isUniqueWithSorting(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++)
            if (chars[i] == chars[i + 1]) return false;
        return true;
    }

    /**
     * Checks if the string has all the characters unique using HashSet.
     * Complexity is O(N) (as adding to a HashSet takes O(1)).
     *
     * @return is given string unique
     */
    public boolean isUniqueWithSet(String str){
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars)
            if (!set.add(c)) return false;
        return true;
    }
}