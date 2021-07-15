package com.xenoteo.chapter5_bit_manipulation.question5_3_flip_bit_to_win;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void flipBitWithListTest(){
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.flipBitWithList(0));
        Assert.assertEquals(4, solution.flipBitWithList(0b1001100111));
        Assert.assertEquals(6, solution.flipBitWithList(0b1111100111));
        Assert.assertEquals(5, solution.flipBitWithList(0b1011100111));
        Assert.assertEquals(11, solution.flipBitWithList(0b1111111111));
        Assert.assertEquals(32, solution.flipBitWithList(0b11111111111111111111111111111111));
    }

    @Test
    public void flipBitOptimalTest(){
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.flipBitOptimal(0));
        Assert.assertEquals(4, solution.flipBitOptimal(0b1001100111));
        Assert.assertEquals(6, solution.flipBitOptimal(0b1111100111));
        Assert.assertEquals(5, solution.flipBitOptimal(0b1011100111));
        Assert.assertEquals(11, solution.flipBitOptimal(0b1111111111));
        Assert.assertEquals(32, solution.flipBitOptimal(0b11111111111111111111111111111111));
    }
}
