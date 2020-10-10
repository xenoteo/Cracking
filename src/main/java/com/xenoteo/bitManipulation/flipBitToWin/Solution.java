package com.xenoteo.bitManipulation.flipBitToWin;

import java.util.ArrayList;
import java.util.List;

/**
 * Having an integer and you can flip exactly one bit from a 0 to a 1.
 * Finding the length of the longest sequence of 1s is possible to create.
 */
public class Solution {

    /**
     * Finding the length of the longest sequence of 1s is possible to create
     * after flipping exactly one bit from a 0 to a 1.
     *
     * Using list to keep all the lengths of sequences of 1s and 0s.
     *
     * Time complexity is O(b) and space complexity if O(b), where b is the number of bits in n.
     *
     * @param n to analyze
     * @return the length of the longest sequence of 1s is possible to create
     */
    public int flipBitWithList(int n){
        return findMaxSequence(getSequencesLengths(n));
    }

    /**
     * Finding the lengths of each 0 or 1 sequence starting from the end.
     *
     * The first written sequence length is always for 0 sequence,
     * even if the value of 0 bit is 1.
     * For example for number 1011 we would get [0, 2, 1, 1, 28].
     *
     * @param n to find sequences
     * @return list representing the lengths of all 1 and 0 sequences
     */
    private List<Integer> getSequencesLengths(int n){
        List<Integer> sequencesLengths = new ArrayList<>();
        int count = 0;
        int wanted = 0;
        for (int i = 0; i < Integer.BYTES * 8; i++){
            int current = n & 1;
            if (current != wanted) {
                sequencesLengths.add(count);
                count = 0;
                wanted = current;
            }
            count++;
            n >>>= 1;
        }
        sequencesLengths.add(count);
        return sequencesLengths;
    }

    /**
     * Finding the length of the max sequences having the lengths of all the sequences.
     *
     * Iterating over 0 sequences. If its length is 1 then we can merge two adjacent 1 sequences.
     * If it is more than 1 we can only lengthen the next or the previous sequences of 1 by 1.
     *
     * @param sequencesLengths to analyze
     * @return the length of the longest sequence of 1s after flipping one bit to 1
     */
    private int findMaxSequence(List<Integer> sequencesLengths){
        int maxLen = 0;
        int size = sequencesLengths.size();
        for (int i = 0; i < size; i += 2){
            int zeroLen = sequencesLengths.get(i);
            int prevLen = i - 1 >= 0 ? sequencesLengths.get(i - 1) : 0;
            int nextLen = i + 1 < size ? sequencesLengths.get(i + 1) : 0;
            maxLen = Math.max(getCurrentMaxLength(prevLen, zeroLen, nextLen), maxLen);
        }
        return maxLen;
    }



    /**
     * Finding the length of the longest sequence of 1s is possible to create
     * after flipping exactly one bit from a 0 to a 1.
     *
     * Keeping just the lengths of two last sequences of 1s and length of 0 sequence between them.
     *
     * Time complexity is O(b) and space complexity if O(1), where b is the number of bits in n.
     *
     * @param n to analyze
     * @return the length of the longest sequence of 1s is possible to create
     */
    public int flipBitOptimal(int n){
        int count = 0;
        int wanted = 0;
        int maxLen = 0;
        int firstOnes = 0;
        int zeros = 0;
        int secondOnes = 0;

        for (int i = 0; i < Integer.BYTES * 8; i++){
            int current = n & 1;
            if (current != wanted) {
                if (wanted == 0)        // finished with 0 sequence
                    zeros = count;
                else {                  // finished with 1 sequence
                    secondOnes = count;
                    maxLen = Math.max(getCurrentMaxLength(firstOnes, zeros, secondOnes), maxLen);
                    firstOnes = secondOnes;
                }
                count = 0;
                wanted = current;
            }
            count++;
            n >>>= 1;
        }

        if (wanted == 0) zeros = count;
        else secondOnes = count;
        maxLen = Math.max(getCurrentMaxLength(firstOnes, zeros, secondOnes), maxLen);

        return maxLen;
    }

    /**
     * Finding the length of the longest possible 1 sequence
     * having the lengths of two adjacent 1 sequences and the length of the 0 sequence between them.
     *
     * If the length of 0 sequence is 1 then we can merge two adjacent 1 sequences.
     * If it is more than 1 we can only lengthen the longest of two 1 sequences by 1.
     *
     * @param firstOnes is the length of the first 1 sequence
     * @param zeros is the length of 0 sequence
     * @param secondOnes is the length of the second 1 sequence
     * @return the length of the longest sequence of 1s after flipping one bit to 1
     */
    private int getCurrentMaxLength(int firstOnes, int zeros, int secondOnes){
        int currentLen;

        if (zeros == 1)
            currentLen = firstOnes + 1 + secondOnes;
        else if (zeros == 0)
            currentLen = Math.max(firstOnes, secondOnes);
        else
            currentLen = 1 + Math.max(firstOnes, secondOnes);

        return currentLen;
    }
}