package com.xenoteo.chapter5_bit_manipulation.question5_1_insertion;

/**
 * Given two 32-bit numbers, N and M, and two bit positions, i and j,
 * inserting M into N such that M starts at bit j and ends at bit i.
 * Assuming that the bits j through i have enough space to fit all of M.
 */
public class Solution {

    /**
     * Given two 32-bit numbers, N and M, and two bit positions, i and j,
     * inserts M into N such that M starts at bit j and ends at bit i.
     *
     * Assuming that the bits j through i have enough space to fit all of M.
     *
     * @param n  N
     * @param m  M
     * @param i  i
     * @param j  j
     * @return the new number
     */
    public int insert(int n, int m, int i, int j){
        // creating a mask for clearing the n's bits
        int leftMask = ~0 << (j + 1);
        int rightMask = (1 << i) - 1;
        int mask = leftMask | rightMask;

        // merged
        // n with cleared bits from i to j
        // and shifted m to suit n
        return (n & mask) | (m << i);
    }
}
