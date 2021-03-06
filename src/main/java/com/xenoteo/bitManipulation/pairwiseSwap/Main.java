package com.xenoteo.bitManipulation.pairwiseSwap;

public class Main {
    public static void main(String[] args) {
        printOriginalAndSwappedNumber(0b111);
        printOriginalAndSwappedNumber(0b10010110);
        printOriginalAndSwappedNumber(0b1001);
    }

    /**
     * Printing the original number and the number with swapped bits.
     * @param n to perform the operations on
     */
    private static void printOriginalAndSwappedNumber(int n){
        System.out.printf("%-32s -> %s\n",
                Integer.toBinaryString(n),
                Integer.toBinaryString(new Solution().pairwiseSwapFast(n)));
    }
}