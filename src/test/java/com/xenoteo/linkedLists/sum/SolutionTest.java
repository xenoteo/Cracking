package com.xenoteo.linkedLists.sum;

import com.xenoteo.helpers.linkedList.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Node head1;
    private Node head2;
    private Node head3;
    private Node head4;
    private Node head5;
    private Node head6;

    private Node sum1_2;
    private Node sum1_3;
    private Node sum2_4;
    private Node sum3_5;
    private Node sum4_5;
    private Node sum3_6;

    public SolutionTest(){
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();

        head1 = generator.generateList(new int[]{1, 2, 3});
        head2 = generator.generateList(new int[]{7, 7});
        head3 = generator.generateList(new int[]{3, 2, 8});
        head4 = generator.generateList(new int[]{4});
        head5 = generator.generateList(new int[]{1, 5, 7});
        head6 = generator.generateList(new int[]{7, 4, 3});

        sum1_2 = generator.generateList(new int[]{2, 0, 0});
        sum1_3 = generator.generateList(new int[]{4, 5, 1});
        sum2_4 = generator.generateList(new int[]{8, 1});
        sum3_5 = generator.generateList(new int[]{4, 8, 5});
        sum4_5 = generator.generateList(new int[]{1, 6, 1});
        sum3_6 = generator.generateList(new int[]{1, 0, 7, 1});
    }

    @Test
    public void iterativeReversedSumTest(){
        sumTest(new IterativeReversedSolution());
    }

    @Test
    public void recursiveReversedSumTest(){
        sumTest(new RecursiveReversedSolution());
    }

    @Test
    public void recursiveSumTest(){
        sumTest(new RecursiveSolution());
    }

    private void sumTest(Summing solution){
        Assert.assertEquals(new List(sum1_2), new List(solution.sum(head1, head2)));
        Assert.assertEquals(new List(sum1_3), new List(solution.sum(head1, head3)));
        Assert.assertEquals(new List(sum2_4), new List(solution.sum(head2, head4)));
        Assert.assertEquals(new List(sum3_5), new List(solution.sum(head3, head5)));
        Assert.assertEquals(new List(sum4_5), new List(solution.sum(head4, head5)));
        Assert.assertEquals(new List(sum3_6), new List(solution.sum(head3, head6)));
    }
}
