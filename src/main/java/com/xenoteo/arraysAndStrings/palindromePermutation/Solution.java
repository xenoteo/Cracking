package com.xenoteo.arraysAndStrings.palindromePermutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  Given a string checking if it is a permutation of a palindrome.
 *  The palindrome does not need to be limited to just dictionary words.
 */
public class Solution {
    /**
     * Checking whether given string is a permutation of palindrome using sorting.
     * All letters are treated as lowercase. Spaces are not taken into account.
     * Complexity is O(N * log(N)).
     * @param str is a string to be checked
     * @return is given string a permutation of palindrome
     */
    public boolean isPalindromePermutationWithSorting(String str){
        char[] chars = removeSpaces(str.toLowerCase().toCharArray()); // without spaces and lower case
        Arrays.sort(chars);

        if (chars.length == 1) return true;

        int oddCount = 0;
        int currentCount = 1;
        for (int i = 1; i < chars.length; i++){
            if (chars[i] == chars[i - 1]) {
                currentCount++;
            }
            else {
                if (currentCount % 2 == 1){
                    oddCount++;
                    if (oddCount > 1) return false;
                }
                currentCount = 1;
            }
        }
        return true;

    }

    /**
     * Checking whether given string is a permutation of palindrome using HashMap.
     * All letters are treated as lowercase. Spaces are not taken into account.
     * Complexity is O(N).
     * @param str is a string to be checked
     * @return is given string a permutation of palindrome
     */
    public boolean isPalindromePermutationWithMap(String str){
        char[] chars = str.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars){
            if (c != ' ') {
                if (map.containsKey(c)) map.put(c, map.get(c) + 1);
                else map.put(c, 1);
            }
        }

        int oddCount = 0;
        for (Map.Entry<Character, Integer> pair : map.entrySet()){
            if (pair.getValue() % 2 == 1) {
                oddCount++;
                if (oddCount > 1) return false;
            }
        }
        return true;
    }

    /**
     * Counting all spaces in an array of chars representing given string.
     * @param chars is an array of chars representing given string
     * @return the number of spaces in a string
     */
    private int countSpaces(char[] chars){
        int count = 0;
        for (char c: chars)
            if (c == ' ') count++;
        return count;
    }

    /**
     * Generating new array of chars representing the string without spaces.
     * @param chars is an array of chars representing given string with spaces
     * @return array of chars representing given string without spaces
     */
    private char[] removeSpaces(char[] chars){
        char[] newChars = new char[chars.length - countSpaces(chars)];
        int k = 0;
        for (char c : chars){
            if (c != ' '){
                newChars[k] = c;
                k++;
            }
        }
        return newChars;
    }
}
