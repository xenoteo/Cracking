package com.xenoteo.bitManipulation.nextNumber;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void nextWithTheSameNumberOfOnesTest(){
        Solution solution = new Solution();
        Assert.assertEquals(0b11010101, solution.nextWithTheSameNumberOfOnes(0b11010011));
        Assert.assertEquals(0b1100, solution.nextWithTheSameNumberOfOnes(0b1010));
        Assert.assertEquals(0b1010, solution.nextWithTheSameNumberOfOnes(0b1001));
        Assert.assertEquals(0b11011010001111, solution.nextWithTheSameNumberOfOnes(0b11011001111100));

        // corner cases
        Assert.assertEquals(0b10000000000000000000000000000000,
                solution.nextWithTheSameNumberOfOnes(0b10000000000000000000000000000000));
        Assert.assertEquals(0, solution.nextWithTheSameNumberOfOnes(0));
        Assert.assertEquals(~0, solution.nextWithTheSameNumberOfOnes(~0));
    }

    @Test
    public void previousWithTheSameNumberOfOnesTest(){
        Solution solution = new Solution();
        Assert.assertEquals(0b11001110, solution.previousWithTheSameNumberOfOnes(0b11010011));
        Assert.assertEquals(0b1001, solution.previousWithTheSameNumberOfOnes(0b1010));
        Assert.assertEquals(0b0110, solution.previousWithTheSameNumberOfOnes(0b1001));
        Assert.assertEquals(0b11011001111010, solution.previousWithTheSameNumberOfOnes(0b11011001111100));

        // corner cases
        Assert.assertEquals(0, solution.previousWithTheSameNumberOfOnes(0));
        Assert.assertEquals(~0, solution.previousWithTheSameNumberOfOnes(~0));
        Assert.assertEquals(0b01111111111111111111111111111111,
                solution.previousWithTheSameNumberOfOnes(0b01111111111111111111111111111111));
    }
}