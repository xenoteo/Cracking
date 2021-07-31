package com.xenoteo.chapter6_math_and_logic_puzzles.question6_9_100_lockers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void countOpenLockersTest() {
        Solution solution = new Solution();
        Assert.assertEquals(10, solution.countOpenLockers(100));
        Assert.assertEquals(10, solution.countOpenLockers(110));
        Assert.assertEquals(11, solution.countOpenLockers(122));
        Assert.assertEquals(9, solution.countOpenLockers(90));
        Assert.assertEquals(1, solution.countOpenLockers(1));
        Assert.assertEquals(0, solution.countOpenLockers(0));
        Assert.assertEquals(15, solution.countOpenLockers(225));
        Assert.assertEquals(14, solution.countOpenLockers(224));
    }

    @Test
    public void countOpenLockersOptimalTest() {
        Solution solution = new Solution();
        Assert.assertEquals(10, solution.countOpenLockersOptimal(100));
        Assert.assertEquals(10, solution.countOpenLockersOptimal(110));
        Assert.assertEquals(11, solution.countOpenLockersOptimal(122));
        Assert.assertEquals(9, solution.countOpenLockersOptimal(90));
        Assert.assertEquals(1, solution.countOpenLockersOptimal(1));
        Assert.assertEquals(0, solution.countOpenLockersOptimal(0));
        Assert.assertEquals(15, solution.countOpenLockersOptimal(225));
        Assert.assertEquals(14, solution.countOpenLockersOptimal(224));
    }
}
