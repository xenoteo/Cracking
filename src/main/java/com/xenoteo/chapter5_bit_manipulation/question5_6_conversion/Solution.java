package com.xenoteo.chapter5_bit_manipulation.question5_6_conversion;

/**
 * The class determining the number of bits needed to flip to convert integer A to integer B.
 */
public class Solution {

    /**
     * Determines the number of bits needed to flip to convert integer A to integer B.
     *
     * @param a  A
     * @param b  B
     * @return the number of bits needed to flip to convert integer A to integer B
     */
    public int conversionNumber(int a, int b){
        int xor = a ^ b;
        int mask = 1;
        int count = 0;
        for (int i = 0; i < Integer.BYTES * 8 - 1; i++){
            if ((xor & mask) != 0)
                count++;
            mask <<= 1;
        }
        return count;
    }
}
