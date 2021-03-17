package com.xenoteo.linkedLists.partition;

import com.xenoteo.helpers.linkedList.*;

public class Main {
    private static final String ORIGINAL = "original list";
    private static final String VALUE = "partitions around value ";
    private static final String STABLE = "stable partition";
    private static final String NOT_STABLE = "not stable partition";

    public static void main(String[] args) {
        printLists(new int[]{3, 4, 7, 9, 2, 1, 6, 7, 9, 4}, 6);
        printLists(new int[]{2, 7, 6, 5, 4, 3, 3, 9, 7, 2}, 4);
    }

    /**
     * Prints the original list and the list after stable and not stable partitions.
     *
     * @param nums  the array of numbers to generate the list from
     * @param val  the value to make partition around
     */
    private static void printLists(int[] nums, int val){
        ListGenerator generator = new ListGenerator();
        Solution solution = new Solution();
        Node head = generator.generateList(nums);
        Node headCopy1 = generator.generateList(nums);
        Node headCopy2 = generator.generateList(nums);
        System.out.printf("%s%d\n%-21s: %s\n%-21s: %s\n%-21s: %s\n\n",
                VALUE, val,
                ORIGINAL, new List(head),
                STABLE, new List(solution.stablePartition(headCopy1, val)),
                NOT_STABLE, new List(solution.partition(headCopy2, val)));
    }

}
