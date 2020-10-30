package com.xenoteo.bitManipulation.conversion;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void conversionNumberTest(){
        Solution solution = new Solution();
        Assert.assertEquals( 2, solution.conversionNumber(0b11101, 0b01111));
        Assert.assertEquals( 3, solution.conversionNumber(0b10101, 0b01111));
        Assert.assertEquals( 1, solution.conversionNumber(0b0011, 0b0010));
        Assert.assertEquals( 0, solution.conversionNumber(0b101111, 0b101111));
    }
}
