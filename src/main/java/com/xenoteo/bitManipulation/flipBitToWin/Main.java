package com.xenoteo.bitManipulation.flipBitToWin;

public class Main {
    public static void main(String[] args) {
        printValueAndLengthOfWin(0);
        printValueAndLengthOfWin(5);
        printValueAndLengthOfWin(7);
        printValueAndLengthOfWin(17);
        printValueAndLengthOfWin(35);
    }

    /**
     * Printing the given value in a binary representation,
     * and the length of the longest possible sequence of 1s
     * after flipping exactly one bit from 0 to 1.
     * @param n to print
     */
    private static void printValueAndLengthOfWin(int n){
        Solution solution = new Solution();
        System.out.printf("%-32s: %d\n", Integer.toBinaryString(n), solution.flipBitOptimal(n));
    }
}