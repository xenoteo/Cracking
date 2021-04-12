package com.xenoteo.chapter1_arraysAndStrings.question1_5_oneAway;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isOneAwayTest(){
        Solution solution = new Solution();
        Assert.assertTrue(solution.isOneAway("pale", "ple"));
        Assert.assertTrue(solution.isOneAway("pales", "pale"));
        Assert.assertTrue(solution.isOneAway("pale", "pale"));
        Assert.assertTrue(solution.isOneAway("pale", "bale"));
        Assert.assertTrue(solution.isOneAway("hippo", "hippos"));
        Assert.assertTrue(solution.isOneAway("world", "word"));

        Assert.assertFalse(solution.isOneAway("pale", "bake"));
        Assert.assertFalse(solution.isOneAway("hello", "world"));
        Assert.assertFalse(solution.isOneAway("long string", "short"));
    }
}
