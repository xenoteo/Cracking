package com.xenoteo.chapter6_math_and_logic_puzzles.question6_7_the_apocalypse;

import java.util.Random;

/**
 * The simulation of the next post-apocalypses generation
 * (when the current generation continue to have children until they have one girl,
 * at which point they immediately stop to have new children).
 */
public class Solution {

    /**
     * Finds the girls ratio for N families.
     *
     * @param n  the number of families
     * @return the girls ratio for N families
     */
    public double girlsRatioForNFamilies(int n) {
        int girls = 0;
        int boys = 0;
        for (int i = 0; i < n; i++) {
            boys += findOneFamilyChildren();
            girls++;
        }
        return 1.0 * girls / (girls + boys);
    }

    /**
     * Finds the number of boys born by one family before a girl birth.
     *
     * @return the number of boys born before a girl
     */
    private int findOneFamilyChildren() {
        Random random = new Random();
        int girls = 0;
        int boys = 0;
        while (girls == 0) {
            boolean girl = random.nextBoolean();
            if (girl) {
                girls++;
            }
            else {
                boys++;
            }
        }
        return boys;
    }
}
