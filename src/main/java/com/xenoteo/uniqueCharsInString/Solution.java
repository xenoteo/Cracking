package com.xenoteo.uniqueCharsInString;

import java.util.*;

/**
 * Implementing an algorithm to determine if a string has all unique characters.
 */
class Solution {
    /**
     * Array of chars representing given string.
     */
    private final char[] arr;

    /**
     * Constructor converting given string to an array of chars.
     * @param str is a given string
     */
    public Solution(String str){
        arr = str.toCharArray();
    }

    /**
     * Swapping two characters in the arr.
     * @param i is an index of the first char
     * @param j is an index of the second char
     */
    private void swap(int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Quick sort on arr.
     * @param low is an index to start sorting from
     * @param high is the last index to sort to
     */
    private void quickSort(int low, int high){
        if (low < high){
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    /**
     * Partition of arr needed for quick sort.
     * @param low is an index to start partition from
     * @param high is the last included index to the partition process
     * @return pivot
     */
    private int partition(int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return (i + 1);
    }

    /**
     * Checking if arr has all the characters unique in place.
     * Complexity is O(N^2).
     * @return is given string unique
     */
    public boolean isUniqueInPlace(){
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    /**
     * Checking if arr has all the characters unique using quick sort.
     * Complexity is O(N * log(N)).
     * @return is given string unique
     */
    public boolean isUniqueWithSorting(){
        quickSort(0, arr.length - 1);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == arr[i + 1]) return false;
        return true;
    }

    /**
     * Checking if arr has all the characters unique using HashSet.
     * Complexity is O(N) (as adding to a HashSet takes O(1)).
     * @return is given string unique
     */
    public boolean isUniqueWithSet(){
        Set<Character> set = new HashSet<>();
        for (char c : arr)
            if (!set.add(c)) return false;
        return true;
    }
}