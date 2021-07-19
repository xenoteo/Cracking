package com.xenoteo.chapter6_math_and_logic_puzzles.question6_8_the_egg_drop_problem;

/**
 * The class simulating the building of 100 floors.
 * If an egg drops from the Nth floor or above, it will break. If it's dropped from any floor below, it will not break.
 * Given two eggs, finding N, while minimizing the number of drops for the worst case.
 */
public class Building {

    /**
     * The breaking point.
     */
    private int breakingPoint;

    /**
     * The number of steps needed to find the breaking point.
     */
    private int steps;

    public void setBreakingPoint(int breakingPoint) {
        this.breakingPoint = breakingPoint;
    }

    /**
     * Find the breaking point.
     *
     * @return the array of two numbers: the breaking point and the number of steps needed to find it
     */
    public int[] findBreakingPoint() {
        steps = 0;
        int interval = 14;
        int previousFloor = 0;
        int egg1Floor = interval;
        int egg2Floor;

        while (!drops(egg1Floor) && egg1Floor <= 100) {
            interval--;
            previousFloor = egg1Floor;
            egg1Floor += interval;
        }

        egg2Floor = previousFloor + 1;
        while (egg2Floor < egg1Floor && egg2Floor < 100 && !drops(egg2Floor)) {
            egg2Floor++;
        }

        return new int[]{egg2Floor, steps};
    }

    /**
     * Checks whether an egg drops on the provided floor or not.
     *
     * @param floor  the floor
     * @return whether an egg drops on the provided floor or not
     */
    private boolean drops(int floor) {
        steps++;
        return floor >= breakingPoint;
    }
}
