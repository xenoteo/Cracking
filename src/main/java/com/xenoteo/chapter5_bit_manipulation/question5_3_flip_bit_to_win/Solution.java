package com.xenoteo.chapter5_bit_manipulation.question5_3_flip_bit_to_win;

import java.util.ArrayList;
import java.util.List;

/**
 * The class finding the length of the longest sequence of 1s is possible to create.
 *
 * Having an integer and it is possible to flip exactly one bit from a 0 to a 1.
 */
public class Solution {

    /**
     * Finds the length of the longest sequence of 1s is possible to create
     * after flipping exactly one bit from a 0 to a 1.
     *
     * Using list to keep all the lengths of sequences of 1s and 0s.
     *
     * Time complexity is O(b) and space complexity if O(b), where b is the number of bits in n.
     *
     * @param n  the number to analyze
     * @return the length of the longest sequence of 1s is possible to create
     */
    public int flipBitWithList(int n){
        return findMaxSequence(getSequencesLengths(n));
    }

    /**
     * Finds the lengths of each 0 or 1 sequence starting from the end.
     *
     * The first written sequence length is always for 0 sequence, even if the value of 0 bit is 1.
     * For example for number 1011 we would get [0, 2, 1, 1, 28].
     *
     * @param n  the number to find sequences
     * @return the list representing the lengths of all 1 and 0 sequences
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
     * Finds the length of the max sequences having the lengths of all the sequences.
     *
     * Iterating over 0 sequences. If its length is 1 then we can merge two adjacent 1 sequences.
     * If it is more than 1 we can only lengthen the next or the previous sequences of 1 by 1.
     *
     * @param sequencesLengths  the list of sequences lengths to analyze
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
     * Finds the length of the longest sequence of 1s is possible to create
     * after flipping exactly one bit from a 0 to a 1.
     *
     * Keeping just the lengths of two last sequences of 1s and length of 0 sequence between them.
     *
     * Time complexity is O(b) and space complexity if O(1), where b is the number of bits in n.
     *
     * @param n  the number to analyze
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
     * Finds the length of the longest possible 1 sequence
     * having the lengths of two adjacent 1 sequences and the length of the 0 sequence between them.
     *
     * If the length of 0 sequence is 1 then we can merge two adjacent 1 sequences.
     * If it is more than 1 we can only lengthen the longest of two 1 sequences by 1.
     *
     * @param firstOnes  the length of the first 1 sequence
     * @param zeros  the length of 0 sequence
     * @param secondOnes  the length of the second 1 sequence
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