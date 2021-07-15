package com.xenoteo.chapter1_arrays_and_strings.question1_5_one_away;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings checking if they are
 * one edit (or zero edits) away.
 */
public class Solution {
    /**
     * Checks if one of two given strings is one (or zero) away from the other.
     *
     * Replacing and removing/inserting considered as two different cases.
     * Removing and inserting considered as one inverted case.
     *
     * Complexity is O(N).
     *
     * @param str1  the first string
     * @param str2  the second string
     * @return is str2 one away from str2
     */
    public boolean isOneAway(String str1, String str2){
        if (!lenDiffIsGood(str1, str2)) return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        if (chars1.length == chars2.length) return canBeReplaced(chars1, chars2);
        if (chars1.length > chars2.length) return canBeInserted(chars2, chars1);
        return canBeInserted(chars1, chars2);
    }

    /**
     * Checks whether one from two strings of the same length can be obtained by replacing one character.
     *
     * @param chars1  the array of chars representing the first string
     * @param chars2  the array of chars representing the second string
     * @return whether one character can be replaced to obtain two equal strings
     */
    private boolean canBeReplaced(char[] chars1, char[] chars2){
        int count = 0;
        for (int i = 0; i < chars1.length; i++){
            if (chars1[i] != chars2[i]) {
                count++;
                if (count > 1) return false;
            }
        }
        return true;
    }

    /**
     * Checks whether one from two strings of lengths different by exactly 1 can be obtained by adding one character.
     *
     * @param shorter  the array of chars representing shorter string
     * @param longer  the array of chars representing longer string
     * @return whether one character can be inserted to shorted string to obtain two equal strings
     */
    private boolean canBeInserted(char[] shorter, char[] longer){
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < shorter.length && j < longer.length){
            if (shorter[i] != longer[j]){
                count++;
                if (count > 1) return false;
            }
            else i++;

            j++;
        }
        return true;
    }

    /**
     * Checks whether lengths of two given strings differs by not more than 1 character.
     *
     * @param str1  the first string
     * @param str2  the second string
     * @return if the lengths of the stings differs by not more that 1
     */
    private boolean lenDiffIsGood(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        return len1 - len2 <= 1 && len2 - len1 <= 1;
    }
}
