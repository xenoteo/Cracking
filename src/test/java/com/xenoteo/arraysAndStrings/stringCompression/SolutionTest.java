package com.xenoteo.arraysAndStrings.stringCompression;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void compressStringTest(){
        Solution solution = new Solution();
        Assert.assertEquals("a2b1c5a3", solution.compressString("aabcccccaaa"));
        Assert.assertEquals("compress", solution.compressString("compress"));
        Assert.assertEquals("simple", solution.compressString("simple"));
        Assert.assertEquals("beeeater", solution.compressString("beeeater"));
        Assert.assertEquals("m5k2o1l4", solution.compressString("mmmmmkkollll"));
    }
}
