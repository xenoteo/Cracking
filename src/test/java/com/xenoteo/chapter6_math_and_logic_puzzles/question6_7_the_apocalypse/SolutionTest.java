package com.xenoteo.chapter6_math_and_logic_puzzles.question6_7_the_apocalypse;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void girlsRatioForNFamiliesTest() {
        Solution solution = new Solution();

        double ratio1 = solution.girlsRatioForNFamilies(10);
        double ratio2 = solution.girlsRatioForNFamilies(100);
        double ratio3 = solution.girlsRatioForNFamilies(1000);
        double ratio4 = solution.girlsRatioForNFamilies(10000);
        double ratio5 = solution.girlsRatioForNFamilies(100000);
        double ratio6 = solution.girlsRatioForNFamilies(1000000);
        double ratio7 = solution.girlsRatioForNFamilies(10000000);

        Assert.assertTrue(0.4 <= ratio1 && ratio1 <= 0.6);
        Assert.assertTrue(0.4 <= ratio2 && ratio2 <= 0.6);
        Assert.assertTrue(0.4 <= ratio3 && ratio3 <= 0.6);
        Assert.assertTrue(0.4 <= ratio4 && ratio4 <= 0.6);
        Assert.assertTrue(0.4 <= ratio5 && ratio5 <= 0.6);
        Assert.assertTrue(0.4 <= ratio6 && ratio6 <= 0.6);
        Assert.assertTrue(0.4 <= ratio7 && ratio7 <= 0.6);
    }
}
