package com.xenoteo.chapter1_arraysAndStrings.question1_3_URLify;

/**
 * Replacing all spaces in a string with '%20'.
 */
public class Solution {
    /**
     * Returns the string with all spaces replaced by '%20'.
     *
     * @param str  the string where to replace spaces
     * @return the string with replaced spaces
     */
    public String getStringWithReplacedSpaces(String str){
        char[] oldChars = str.toCharArray();
        char[] newChars = generateNewChars(oldChars);
        return replaceSpaces(oldChars, newChars);
    }

    /**
     * Counts all spaces in a string (array of chars).
     *
     * @param chars  the array of chars where to count spaces
     * @return the number of spaces in the string
     */
    private int countSpaces(char[] chars){
        int spaceCount = 0;
        for (char c : chars){
            if (c == ' ') spaceCount++;
        }
        return spaceCount;
    }

    /**
     * Generates an array of chars of a new size, depending on a number of spaces and old size.
     *
     * @param oldChars  the array of chars representing the 'old' string
     * @return the array of a new size
     */
    private char[] generateNewChars(char[] oldChars){
        int spaceCount = countSpaces(oldChars);
        int newLen = oldChars.length + spaceCount * 2;
        return new char[newLen];
    }

    /**
     * Replaces all spaces with '%20'.
     * Starting from the end to the beginning.
     * Complexity is O(N).
     *
     * @param oldChars  the array of chars representing 'old' string
     * @param newChars  the array of chars representing 'new' string
     * @return the new string with replaced spaces
     */
    private String replaceSpaces(char[] oldChars, char[] newChars){
        int i = newChars.length - 1;
        for (int k = oldChars.length - 1; k >= 0; k--){
            if (oldChars[k] != ' '){
                newChars[i] = oldChars[k];
                i--;
            }
            else {
                newChars[i] = '0';
                newChars[i - 1] = '2';
                newChars[i - 2] = '%';
                i -= 3;
            }
        }
        return new String(newChars);
    }
}
