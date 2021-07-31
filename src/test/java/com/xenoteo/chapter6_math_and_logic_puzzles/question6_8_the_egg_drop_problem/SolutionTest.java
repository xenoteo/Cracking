package com.xenoteo.chapter6_math_and_logic_puzzles.question6_8_the_egg_drop_problem;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void findBreakingPointTest() {
        Building building = new Building();

        building.setBreakingPoint(1);
        int[] result1 = building.findBreakingPoint();

        building.setBreakingPoint(100);
        int[] result2 = building.findBreakingPoint();

        building.setBreakingPoint(48);
        int[] result3 = building.findBreakingPoint();

        building.setBreakingPoint(34);
        int[] result4 = building.findBreakingPoint();

        building.setBreakingPoint(76);
        int[] result5 = building.findBreakingPoint();

        building.setBreakingPoint(82);
        int[] result6 = building.findBreakingPoint();

        building.setBreakingPoint(99);
        int[] result7 = building.findBreakingPoint();

        Assert.assertTrue(result1[0] == 1 && result1[1] <= 14);
        Assert.assertTrue(result2[0] == 100 && result2[1] <= 14);
        Assert.assertTrue(result3[0] == 48 && result3[1] <= 14);
        Assert.assertTrue(result4[0] == 34 && result4[1] <= 14);
        Assert.assertTrue(result5[0] == 76 && result5[1] <= 14);
        Assert.assertTrue(result6[0] == 82 && result6[1] <= 14);
        Assert.assertTrue(result7[0] == 99 && result7[1] <= 14);
    }
}
