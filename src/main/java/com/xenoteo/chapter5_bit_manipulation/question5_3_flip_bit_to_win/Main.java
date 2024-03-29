package com.xenoteo.chapter5_bit_manipulation.question5_3_flip_bit_to_win;

public class Main {
    public static void main(String[] args) {
        printValueAndLengthOfWin(0);
        printValueAndLengthOfWin(5);
        printValueAndLengthOfWin(7);
        printValueAndLengthOfWin(17);
        printValueAndLengthOfWin(35);
    }

    /**
     * Prints the given value in a binary representation
     * and the length of the longest possible sequence of 1s after flipping exactly one bit from 0 to 1.
     *
     * @param n  the number to print
     */
    private static void printValueAndLengthOfWin(int n){
        Solution solution = new Solution();
        System.out.printf("%-32s: %d\n", Integer.toBinaryString(n), solution.flipBitOptimal(n));
    }
}