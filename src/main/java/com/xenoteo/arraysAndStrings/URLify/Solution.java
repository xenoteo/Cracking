package com.xenoteo.arraysAndStrings.URLify;

/**
 * Replacing all spaces in a string with '%20'.
 */
public class Solution {
    /**
     * Returning string with all spaces replaced by '%20'.
     * @param str is the string where to replace spaces
     * @return new string with replaced spaces
     */
    public String getStringWithReplacedSpaces(String str){
        char[] oldChars = str.toCharArray();
        char[] newChars = generateNewChars(oldChars);
        return replaceSpaces(oldChars, newChars);
    }

    /**
     * Counting all spaces in a string (array of chars).
     * @param chars is an array of chars where to count spaces
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
     * Generating an array of chars of a new size, depending on a number of spaces and old size.
     * @param oldChars is an array of chars representing the 'old' string
     * @return an array of a new size
     */
    private char[] generateNewChars(char[] oldChars){
        int spaceCount = countSpaces(oldChars);
        int newLen = oldChars.length + spaceCount * 2;
        return new char[newLen];
    }

    /**
     * Replacing all spaces with '%20'.
     * Starting from the end to the beginning.
     * Complexity is O(N).
     * @param oldChars is an array of chars representing 'old' string
     * @param newChars is an array of chars representing 'new' string
     * @return new string with replaced spaces
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
