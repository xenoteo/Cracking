package com.xenoteo.chapter5_bit_manipulation.question5_4_next_number;

/**
 * Given a positive integer, finding the next smallest and the next largest number
 * that have the same number of 1 bits in their binary representation.
 */
public class Solution {

    /**
     * Finds the smallest number that is bigger than n
     * and that has the same number of 1 bits in its binary representation.
     *
     * @param n  the given number
     * @return the next number with the same number of ones
     */
    public int nextWithTheSameNumberOfOnes(int n){
        int positionToSet = firstNotTailing(n, 0);
        if (positionToSet == -1) return n;
        int onesBeforePositionToSetCount = countOnes(n, positionToSet);
        n = setBit(n, positionToSet);
        n = clearBits(n, positionToSet);
        n = setBits(n, onesBeforePositionToSetCount - 1);
        return n;
    }

    /**
     * Finds the biggest number that is smaller than n
     * and that has the same number of 1 bits in its binary representation.
     *
     * @param n  the a given number
     * @return the previous number with the same number of ones
     */
    public int previousWithTheSameNumberOfOnes(int n){
        int positionToClear = firstNotTailing(n, 1);
        if (positionToClear == -1) return n;
        int onesBeforePositionToClearCount = countOnes(n, positionToClear);
        n = clearBit(n, positionToClear);
        n = setBits(n, positionToClear);
        n = clearBits(n, positionToClear - onesBeforePositionToClearCount - 1);
        return n;
    }

    /**
     * Sets the last bits of given number.
     *
     * @param n  the given number
     * @param count  the number of bits to set
     * @return the number with the last bits set
     */
    private int setBits(int n, int count){
        int mask = (1 << count) - 1;

        return n | mask;
    }

    /**
     * Clears the last bits of given number.
     *
     * @param n  the given number
     * @param count  the number of bits to clear
     * @return the number with the last bits cleared
     */
    private int clearBits(int n, int count){
        int mask = (~0 << count);
        return n & mask;
    }

    /**
     * Sets the bit of a given number at a given position.
     *
     * @param n  the given number
     * @param pos  the position of a bit to set
     * @return the number with the bit of the given position set
     */
    private int setBit(int n, int pos){
        int mask = (1 << pos);
        return mask | n;
    }

    /**
     * Clears the bit of a given number at a given position.
     *
     * @param n  the given number
     * @param pos  the position of a bit to clear
     * @return the number with the bit of the given position cleared
     */
    private int clearBit(int n, int pos){
        int mask = ~(1 << pos);
        return n & mask;
    }

    /**
     * Counts all the ones before a given position.
     *
     * @param n  the given number
     * @param pos  the position to stop counting
     * @return the number of ones before given position
     */
    private int countOnes(int n, int pos){
        int mask = 1;
        int count = 0;
        for (int i = 0; i < pos; i++){
            if ((n & mask) != 0) count++;
            mask <<= 1;
        }
        return count;
    }

    /**
     * Finds the position of the first bit being not at the tail.
     *
     * @param n  the given number
     * @param lookingFor  the bit looking for (1 or 0)
     * @return the position of the first bit being not at the tail
     */
    private int firstNotTailing(int n, int lookingFor){
        int mask = 1;
        boolean predecessorExist = false;
        for (int i = 0; i < Integer.BYTES * 8; i++){
            int bit = (n & mask);
            if (bit != 0){
                if (lookingFor == 0)
                    predecessorExist = true;
                else if (predecessorExist)
                    return i;
            }
            else{
                if (lookingFor == 1)
                    predecessorExist = true;
                else if (predecessorExist)
                    return i;
            }
            mask <<= 1;
        }
        return -1;
    }
}