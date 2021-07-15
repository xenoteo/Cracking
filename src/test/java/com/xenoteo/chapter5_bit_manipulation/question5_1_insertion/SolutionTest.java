package com.xenoteo.chapter5_bit_manipulation.question5_1_insertion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void insertTest(){
        Solution solution = new Solution();
        Assert.assertEquals(0b10001001100, solution.insert(0b10000000000, 0b10011, 2, 6));
        Assert.assertEquals(0b11001101101, solution.insert(0b11000000001, 0b11011, 2, 6));
        Assert.assertEquals(0b11011, solution.insert(0b11001, 0b101, 1, 3));
        Assert.assertEquals(0b11000111, solution.insert(0b11001111, 0b0001, 2, 5));
        Assert.assertEquals(0b101000, solution.insert(0b100000, 0b1, 3, 3));
        Assert.assertEquals(0b100000, solution.insert(0b100000, 0b0, 3, 3));
    }
}