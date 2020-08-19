package com.xenoteo.arraysAndStrings.stringCompression;

public class Main {
    public static void main(String[] args) {
        printOriginalAndCompressedStrings("aaabbbcccdeeeeeff");
        printOriginalAndCompressedStrings("hello");
    }

    /**
     * Printing the original and compressed string.
     * @param str is a string to be compressed
     */
    private static void printOriginalAndCompressedStrings(String str){
        System.out.printf("%s -> %s\n", str, new Solution().compressString(str));
    }
}
