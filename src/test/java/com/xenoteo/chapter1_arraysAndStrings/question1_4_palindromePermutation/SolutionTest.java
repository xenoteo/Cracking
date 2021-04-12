package com.xenoteo.chapter1_arraysAndStrings.question1_4_palindromePermutation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final String palindrome1 = "Never odd or even";
    private final String palindrome2 = "Able was I ere I saw Elba";
    private final String palindrome3 = "A man a plan a canal Panama";
    private final String nonPalindrome1 = "Rock And A Hard Place";
    private final String nonPalindrome2 = "Have A Nice Day";

    private final Solution solution = new Solution();

    @Test
    public void isPalindromePermutationWithSortingTest(){
        Assert.assertTrue(solution.isPalindromePermutationWithSorting(palindrome1));
        Assert.assertTrue(solution.isPalindromePermutationWithSorting(palindrome2));
        Assert.assertTrue(solution.isPalindromePermutationWithSorting(palindrome3));
        Assert.assertFalse(solution.isPalindromePermutationWithSorting(nonPalindrome1));
        Assert.assertFalse(solution.isPalindromePermutationWithSorting(nonPalindrome2));
    }

    @Test
    public void isPalindromePermutationWithMapTest(){
        Assert.assertTrue(solution.isPalindromePermutationWithMap(palindrome1));
        Assert.assertTrue(solution.isPalindromePermutationWithMap(palindrome2));
        Assert.assertTrue(solution.isPalindromePermutationWithMap(palindrome3));
        Assert.assertFalse(solution.isPalindromePermutationWithMap(nonPalindrome1));
        Assert.assertFalse(solution.isPalindromePermutationWithMap(nonPalindrome2));
    }


}
