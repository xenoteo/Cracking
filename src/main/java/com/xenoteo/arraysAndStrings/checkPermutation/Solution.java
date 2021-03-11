package com.xenoteo.arraysAndStrings.checkPermutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings checking if one is a permutation of the other.
 */
public class Solution {

    /**
     * Checks whether one string is a permutation of the other using sorting.
     * Complexity is O(N * log(N)).
     *
     * @param str1  the first string
     * @param str2  the second string
     * @return is str1 a permutation of str2
     */
    public boolean isPermutationWithSorting(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        return sort(str1).equals(sort(str2));
    }

    /**
     * Sorts a string.
     * @param str  the string to be sorted
     * @return the sorted string
     */
    private String sort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Checks whether one string is a permutation of the other using HashMap counting occurrences of each letter.
     *
     * @param str1  the first string
     * @param str2  the second string
     * @return is str1 a permutation of str2
     */
    public boolean isPermutationWithMap(String str1, String str2){
        if (str1.length() != str2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        fillMap(map1, str1);
        fillMap(map2, str2);
        return mapEquals(map1, map2);
    }

    /**
     * Fills the map with 'character' - 'number of occurrences' pairs.
     *
     * @param map  the map to be filled
     * @param str  the string to count letter occurrences from
     */
    private void fillMap(HashMap<Character, Integer> map, String str){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
    }

    /**
     * Checks whether two given maps contain the same characters with the same occurrences.
     *
     * @param map1  the first map
     * @param map2  the second map
     * @return are maps equals
     */
    private boolean mapEquals(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
        for (Map.Entry<Character, Integer> pair : map1.entrySet()){
            char c = pair.getKey();
            if (!(map2.containsKey(c) && map1.get(c).equals(map2.get(c)))) return false;
        }
        return true;
    }
}
