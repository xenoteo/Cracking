package com.xenoteo.chapter1_arrays_and_strings.question1_6_string_compression;

public class Main {
    public static void main(String[] args) {
        printOriginalAndCompressedStrings("aaabbbcccdeeeeeff");
        printOriginalAndCompressedStrings("hello");
    }

    /**
     * Prints the original and compressed string.
     *
     * @param str  the string to be compressed
     */
    private static void printOriginalAndCompressedStrings(String str){
        System.out.printf("%s -> %s\n", str, new Solution().compressString(str));
    }
}
