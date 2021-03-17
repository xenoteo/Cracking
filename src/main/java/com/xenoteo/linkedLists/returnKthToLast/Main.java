package com.xenoteo.linkedLists.returnKthToLast;

import com.xenoteo.helpers.linkedList.*;

public class Main {
    public static void main(String[] args) {
        printListAndKthToLast(new int[]{2, 4, 6, 8, 2, 4, 6, 8}, 3);
        printListAndKthToLast(new int[]{1, 6, 7, 9, 8, 4, 3, 2, 5}, 6);
    }

    /**
     * Generates and prints a list based on provided array of numbers,
     * finds and prints the kth to last element.
     *
     * @param nums  the array of numbers to generate list from
     * @param k  the index of element to find
     */
    private static void printListAndKthToLast(int[] nums, int k){
        ListGenerator generator = new ListGenerator();
        Node head = generator.generateList(nums);
        Solution solution = new Solution();
        System.out.printf("%s: %dth to last is %d\n",
                new List(head).toString(), k, solution.kthToLast(head, k).val);
    }
}
