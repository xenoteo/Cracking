package com.xenoteo.chapter1_arrays_and_strings.question1_2_check_permutation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final String str1 = "aaddbbffrreewwqq";
    private final String str2 = "qqwwrreebbffddaa";
    private final String str3 = "abcdefghijklmnop";
    private final String str4 = "qqwwrr";

    private final Solution solution = new Solution();

    @Test
    public void isPermutationWithSortingTest(){
        Assert.assertTrue(solution.isPermutationWithSorting(str1, str2));
        Assert.assertFalse(solution.isPermutationWithSorting(str1, str3));
        Assert.assertFalse(solution.isPermutationWithSorting(str2, str4));
    }

    @Test
    public void isPermutationWithMapTest(){
        Assert.assertTrue(solution.isPermutationWithMap(str1, str2));
        Assert.assertFalse(solution.isPermutationWithMap(str1, str3));
        Assert.assertFalse(solution.isPermutationWithMap(str2, str4));
    }
}
