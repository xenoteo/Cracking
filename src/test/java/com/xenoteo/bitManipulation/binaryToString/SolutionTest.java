package com.xenoteo.bitManipulation.binaryToString;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void binaryToStringTest(){
        Solution solution = new Solution();
        Assert.assertEquals("0.11", solution.binaryToString(0.75));
        Assert.assertEquals("0.101", solution.binaryToString(0.625));
        Assert.assertEquals("ERROR", solution.binaryToString(0.72));
        Assert.assertEquals("ERROR", solution.binaryToString(0.06));
        Assert.assertEquals("ERROR", solution.binaryToString(1.55));
        Assert.assertEquals("ERROR", solution.binaryToString(-0.14));
        Assert.assertEquals("0.110011011101011", solution.binaryToString(0.804046630859375));
        Assert.assertEquals("0.1100110111010110101111010110111",
                solution.binaryToString(0.8040579217486083507537841796875));
    }
}
