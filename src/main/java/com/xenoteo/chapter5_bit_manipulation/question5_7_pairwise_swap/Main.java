package com.xenoteo.chapter5_bit_manipulation.question5_7_pairwise_swap;

public class Main {
    public static void main(String[] args) {
        printOriginalAndSwappedNumber(0b111);
        printOriginalAndSwappedNumber(0b10010110);
        printOriginalAndSwappedNumber(0b1001);
    }

    /**
     * Prints the original number and the number with swapped bits.
     *
     * @param n  the number to perform the operations on
     */
    private static void printOriginalAndSwappedNumber(int n){
        System.out.printf("%-32s -> %s\n",
                Integer.toBinaryString(n),
                Integer.toBinaryString(new Solution().pairwiseSwapFast(n)));
    }
}