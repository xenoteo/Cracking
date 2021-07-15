package com.xenoteo.chapter5_bit_manipulation.question5_1_insertion;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j.
 * Inserting M into N such that M starts at bit j and ends at bit i.
 * Assuming that the bits j through i have enough space to fit all of M.
 */
public class Solution {
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
