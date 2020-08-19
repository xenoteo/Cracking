package com.xenoteo.arraysAndStrings.stringCompression;

/**
 * Performing basic string compression using the counts of repeated characters.
 * If the "compressed" string would not become smaller than the original string,
 * method should return the original string.
 */
public class Solution {
    /**
     * Compressing sting using the counts of repeated characters.
     * Complexity is O(N + K^2), where K is the number of character sequences.
     * @param str is a string to be compressed
     * @return compressed string
     */
    public String compressString(String str){
        if (compressedLength(str) >= str.length()) return str;
        StringBuilder newStr = new StringBuilder();

        char last = '\0';
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c != last){
                if (count != 0) newStr.append(count);
                newStr.append(c);
                count = 1;
                last = c;
            }
            else count++;
        }
        newStr.append(count);
        return newStr.toString();
    }

    /**
     * Counting a length of potentially compressed string.
     * @param str is a string to be compressed
     * @return a length of compressed string
     */
    private int compressedLength(String str){
        int newLength = 0;
        int count = 0;
        char last = '\0';
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (last != c) {
                newLength += 1 + digitNumber(count);
                count = 1;
                last = c;
            }
            else count++;
        }
        return newLength;
    }

    /**
     * Counting the number of digits in a number.
     * @param n is a number to count digits
     * @return the number of digits in n
     */
    private int digitNumber(int n){
        int count = 0;
        while (n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
}
