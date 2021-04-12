package com.xenoteo.chapter2_linkedLists.question2_6_palindrome;

import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Node head1;
    private Node head2;
    private Node head3;

    private final Solution solution;

    public SolutionTest(){
        solution = new Solution();
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1});
        head2 = generator.generateList(new int[]{3, 4, 7, 9, 2, 2, 9, 7, 4, 3});
        head3 = generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6, 2, 8});
    }

    @Test
    public void isPalindromeReversedTest(){
        Assert.assertTrue(solution.isPalindromeReversed(head1));
        Assert.assertTrue(solution.isPalindromeReversed(head2));
        Assert.assertFalse(solution.isPalindromeReversed(head3));
    }

    @Test
    public void isPalindromeWithStackTest(){
        Assert.assertTrue(solution.isPalindromeWithStack(head1));
        Assert.assertTrue(solution.isPalindromeWithStack(head2));
        Assert.assertFalse(solution.isPalindromeWithStack(head3));
    }

    @Test
    public void isPalindromeRecursiveTest(){
        Assert.assertTrue(solution.isPalindromeRecursive(head1));
        Assert.assertTrue(solution.isPalindromeRecursive(head2));
        Assert.assertFalse(solution.isPalindromeRecursive(head3));
    }

    @Test
    public void isPalindromeHalfReversedTest(){
        Assert.assertTrue(solution.isPalindromeHalfReversed(head1));
        Assert.assertTrue(solution.isPalindromeHalfReversed(head2));
        Assert.assertFalse(solution.isPalindromeHalfReversed(head3));
    }
}
