package com.xenoteo.chapter6_math_and_logic_puzzles.question6_10_poison;

import java.util.ArrayList;
import java.util.List;

/**
 * From 1000 bottles of soda exactly one is poisoned.
 * There are 10 test strips which can be used to detect poison.
 * A single drop of poison will turn the test strip positive permanently.
 * It is possible to put any number of drops on a test strip at once
 * and it is possible to reuse reuse a test strip many times (as long as the results are negative).
 * However, it is possible to run tests once per day and it takes seven days to return a result.
 *
 * Figuring out the poisoned bottle in as few days as possible.
 */
public class SolutionBinary {

    /**
     * The number of the poisoned bottle.
     */
    private final int poisonedBottle;

    /**
     * The list of test groups.
     */
    private final List<List<Integer>> tests;

    public SolutionBinary(int poisonedBottle) {
        this.poisonedBottle = poisonedBottle;

        tests = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tests.add(new ArrayList<>());
        }

        fillTestGroups();
    }

    /**
     * Fills the test groups according to the binary representation of numbers
     * (number x lands in test group i if its bit on the position i is 1).
     */
    private void fillTestGroups() {
        int mask = 1;
        int testIndex = 0;
        while (mask < 1024) {
            List<Integer> currentTest = tests.get(testIndex);
            for (int x = 1; x <= 1000; x++) {
                if ((x & mask) > 0) {
                    currentTest.add(x);
                }
            }

            mask <<= 1;
            testIndex++;
        }
    }

    /**
     * Finds the poisoned bottle using binary representation.
     *
     * @return the number of the poisoned bottle and number of day needed to detect it
     */
    public int[] findPoisonedBottle() {
        boolean[] results = runTests(tests);
        int poisoned = 0;
        for (int i = 0; i < 10; i++) {
            if (results[i]) {
                poisoned += (int) Math.pow(2, i);
            }
        }

        return new int[]{poisoned, 7};
    }

    /**
     * Runs test groups and returns the results (value on the position i represent the ith test group)
     *
     * @param tests  the list test groups
     * @return the array with test results
     */
    private boolean[] runTests(List<List<Integer>> tests) {
        boolean[] results = new boolean[10];
        for (int i = 0; i < 10; i++) {
            if (tests.get(i).contains(poisonedBottle)) {
                results[i] = true;
            }
        }
        return results;
    }
}
