package com.xenoteo.chapter6_math_and_logic_puzzles.question6_9_100_lockers;

public class Main {
    private static final String BRUTEFORCE = "bruteforce";
    private static final String MATH = "math";

    public static void main(String[] args) {
        findOpenLockersUsingDifferentSolutions(100);
        findOpenLockersUsingDifferentSolutions(10);
        findOpenLockersUsingDifferentSolutions(8);
        findOpenLockersUsingDifferentSolutions(50);
        findOpenLockersUsingDifferentSolutions(3000);
    }

    /**
     * Finds and prints the number of lockers open after the provided number of operations.
     *
     * @param lockerNumber  the number of lockers
     */
    private static void findOpenLockersUsingDifferentSolutions(int lockerNumber) {
        Solution solution = new Solution();
        System.out.printf("The number of open lockers after %d iterations found using %-10s solution is %d\n",
                lockerNumber, BRUTEFORCE, solution.countOpenLockers(lockerNumber));
        System.out.printf("The number of open lockers after %d iterations found using %10s solution is %d\n",
                lockerNumber, MATH, solution.countOpenLockersOptimal(lockerNumber));
    }
}
