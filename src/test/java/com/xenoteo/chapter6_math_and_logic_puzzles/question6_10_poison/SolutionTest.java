package com.xenoteo.chapter6_math_and_logic_puzzles.question6_10_poison;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findPoisonedBottleGroups() {
        SolutionGroups solution = new SolutionGroups(999);
        Assert.assertEquals(999, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(827);
        Assert.assertEquals(827, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(324);
        Assert.assertEquals(324, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(1);
        Assert.assertEquals(1, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(11);
        Assert.assertEquals(11, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(1000);
        Assert.assertEquals(1000, solution.findPoisonedBottle()[0]);

        solution = new SolutionGroups(522);
        Assert.assertEquals(522, solution.findPoisonedBottle()[0]);
    }

    @Test
    public void findPoisonedBottleBinary() {
        SolutionBinary solution = new SolutionBinary(999);
        int[] result = solution.findPoisonedBottle();
        Assert.assertEquals(999, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(827);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(827, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(324);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(324, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(1);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(1, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(11);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(11, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(1000);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(1000, result[0]);
        Assert.assertEquals(7, result[1]);

        solution = new SolutionBinary(522);
        result = solution.findPoisonedBottle();
        Assert.assertEquals(522, result[0]);
        Assert.assertEquals(7, result[1]);
    }
}
