package com.xenoteo.chapter6_math_and_logic_puzzles.question6_9_100_lockers;

/**
 * There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
 * Next, he closes every second locker. Then, on his third pass, he toggles every third locker
 * (closes it if it is open or opens it if it is closed). This process continues for 100 passes,
 * such that on each pass i, the man toggles every ith locker.
 *
 * The solution counting how many lockers remain open after the last iteration.
 */
public class Solution {

    /**
     * Counts the number of open lockers using brute force solution.
     *
     * Time complexity is O(N) and space complexity is O(N), where N is the number of lockers.
     *
     * @param lockersNumber  the number of lockers
     * @return the number of open lockers
     */
    public int countOpenLockers(int lockersNumber) {
        boolean[] lockers = new boolean[lockersNumber];
        for (int k = 1; k <= lockersNumber; k++) {
            for (int i = k - 1; i < lockersNumber; i += k) {
                lockers[i] = !lockers[i];
            }
        }

        int openLockersCount = 0;
        for (boolean open : lockers) {
            if (open) openLockersCount++;
        }
        return openLockersCount;
    }

    /**
     * Counts the number of open lockers using math approach.
     *
     * Time complexity is O(1) and space complexity is O(1).
     *
     * @param lockersNumber  the number of lockers
     * @return the number of open lockers
     */
    public int countOpenLockersOptimal(int lockersNumber) {
        return (int) Math.sqrt(lockersNumber);
    }
}
