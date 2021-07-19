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
public class SolutionGroups {

    /**
     * The number of the poisoned bottle.
     */
    private final int poisonedBottle;

    public SolutionGroups(int poisonedBottle) {
        this.poisonedBottle = poisonedBottle;
    }

    /**
     * Finds the poisoned bottle grouping bottles according to the number of test strips left.
     *
     * @return the number of the poisoned bottle and number of day needed to detect it
     */
    public int[] findPoisonedBottle() {
        List<List<Integer>> tests;
        List<Integer> poisonedGroup;

        int days = 0;
        int strips = 10;

        int start = 1;
        int end = 1000;

        do {
            tests = formTestGroups(strips, start, end);
            days += 7;
            int poisonedGroupIndex = runTests(tests);

            strips--;
            poisonedGroup = tests.get(poisonedGroupIndex);

            start = poisonedGroup.get(0);
            end = poisonedGroup.get(poisonedGroup.size() - 1);
        }
        while (poisonedGroup.size() > 1);

        return new int[]{poisonedGroup.get(0), days};
    }

    /**
     * Forms test groups based on start and end of the interval as well as on the number of test strips.
     *
     * @param strips  the number of test strips
     * @param start  the start of the interval
     * @param end  the end of the interval
     * @return the list of test groups
     */
    private List<List<Integer>> formTestGroups(int strips, int start, int end) {
        List<List<Integer>> tests = new ArrayList<>();
        int interval = (end - start + 1) / strips;

        for (int i = 0; i < strips; i++) {
            List<Integer> testGroup = new ArrayList<>();
            for (int x = start + i * interval; x < start + interval * (i + 1); x++) {
                testGroup.add(x);
            }
            tests.add(testGroup);
        }
        for (int x = start + strips * interval; x <= end; x++) {
            tests.get(strips - 1).add(x);
        }

        return tests;
    }

    /**
     * Runs test groups and returns the index of poisoned group.
     *
     * @param tests  the list test groups
     * @return the number of poisoned sample
     */
    private int runTests(List<List<Integer>> tests) {
        for (int i = 0; i < tests.size(); i++) {
            if (tests.get(i).contains(poisonedBottle)) {
                return i;
            }
        }
        return -1;
    }
}
