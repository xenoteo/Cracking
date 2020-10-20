package com.xenoteo.bitManipulation.nextNumber;

/**
 * Given a positive integer, finding the next smallest and the next largest number
 * that have the same number of 1 bits in their binary representation.
 */
public class Solution {

    /**
     * Finding the smallest number that is bigger than n
     * and that has the same number of 1 bits in its binary representation.
     * @param n is a given number
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
     * Finding the biggest number that is smaller than n
     * and that has the same number of 1 bits in its binary representation.
     * @param n is a given number
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
     * Setting the last bits of given number.
     * @param n is a given number
     * @param count is a number of bits to set
     * @return number with the last bits set
     */
    private int setBits(int n, int count){
        int mask = (1 << count) - 1;

        return n | mask;
    }

    /**
     * Clearing the last bits of given number.
     * @param n is a given number
     * @param count is a number of bits to clear
     * @return number with the last bits cleared
     */
    private int clearBits(int n, int count){
        int mask = (~0 << count);
        return n & mask;
    }

    /**
     * Setting the bit of a given number at a given position.
     * @param n ia given number
     * @param pos is a position of a bit to set
     * @return number with the bit of the given position set
     */
    private int setBit(int n, int pos){
        int mask = (1 << pos);
        return mask | n;
    }

    /**
     * Clearing the bit of a given number at a given position.
     * @param n ia given number
     * @param pos is a position of a bit to clear
     * @return number with the bit of the given position cleared
     */
    private int clearBit(int n, int pos){
        int mask = ~(1 << pos);
        return n & mask;
    }

    /**
     * Counting all the ones before a given position.
     * @param n is a given number
     * @param pos is a position to stop counting
     * @return number of ones before given position
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
     * Finding the position of the first bit being not at the tail.
     * @param n is a given number
     * @param lookingFor is a bit looking for (1 or 0)
     * @return position of the first bit being not at the tail
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