package com.xenoteo.chapter5_bitManipulation.question5_7_pairwiseSwap;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void pairwiseSwapTest(){
        Solution solution = new Solution();
        Assert.assertEquals(0b110110, solution.pairwiseSwap(0b111001));
        Assert.assertEquals(0b101111, solution.pairwiseSwap(0b11111));
        Assert.assertEquals(0b0000, solution.pairwiseSwap(0b0000));
        Assert.assertEquals(0b01100101, solution.pairwiseSwap(0b10011010));
        Assert.assertEquals(0b001100101, solution.pairwiseSwap(0b010011010));
        Assert.assertEquals(0b0, solution.pairwiseSwap(0b0));
        Assert.assertEquals(0b10, solution.pairwiseSwap(0b1));
    }

    @Test
    public void pairwiseSwapFastTest(){
        Solution solution = new Solution();
        Assert.assertEquals(0b110110, solution.pairwiseSwapFast(0b111001));
        Assert.assertEquals(0b101111, solution.pairwiseSwapFast(0b11111));
        Assert.assertEquals(0b0000, solution.pairwiseSwapFast(0b0000));
        Assert.assertEquals(0b01100101, solution.pairwiseSwapFast(0b10011010));
        Assert.assertEquals(0b001100101, solution.pairwiseSwapFast(0b010011010));
        Assert.assertEquals(0b0, solution.pairwiseSwapFast(0b0));
        Assert.assertEquals(0b10, solution.pairwiseSwapFast(0b1));
    }
}
