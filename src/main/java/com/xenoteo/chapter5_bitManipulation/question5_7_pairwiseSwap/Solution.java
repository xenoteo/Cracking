package com.xenoteo.chapter5_bitManipulation.question5_7_pairwiseSwap;

/**
 * Swapping odd and even bits in an integer with as few instructions as possible
 * (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
 */
public class Solution {

    /**
     * Swapping odd and even bits in a number using the check of each pair of bits and swapping them.
     * The number of operations is O(B), where B is the number of bits in a number (that is 32 or 64).
     * @param n to swap bits
     * @return number with swapped bits
     */
    public int pairwiseSwap(int n){
        for (int i = 0; i < Integer.BYTES * 4; i += 2){
            int even = getBit(n, i);
            int odd = getBit(n, i + 1);
            if (odd != even){
                if (even == 1)
                    n += Math.pow(2, i);
                else
                    n -= Math.pow(2, i);
            }
        }
        return n;
    }

    /**
     * Finding the bit of a number at the given position.
     * @param n is a number to find bit from
     * @param i is the position of the bit to find
     * @return the bit at the given position
     */
    private int getBit(int n, int i){
        return ((1 << i) & n) != 0 ? 1 : 0;
    }



    /**
     * Swapping odd and even bits in a number using two "fast" masks for finding only odd/even bytes.
     * @param n to swap bits
     * @return number with swapped bits
     */
    public int pairwiseSwapFast(int n){
        int oddMask = 0b10101010101010101010101010101010;
        int evenMask = 0b01010101010101010101010101010101;
        int odds = n & oddMask;
        int evens = n & evenMask;
        int newOdds = odds >>> 1;
        int newEvens = evens << 1;
        n = newOdds | newEvens;
        return n;
    }
}
