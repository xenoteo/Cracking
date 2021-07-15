package com.xenoteo.chapter2_linked_lists.question2_3_delete_middle_node;

import com.xenoteo.helpers.linked_list.*;

public class Main {
    public static void main(String[] args) {
        printLists(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 7);
        printLists(new int[]{9, 7, 6, 5, 4, 3, 2, 7}, 4);
    }

    /**
     * Generates and prints a list based on given array of numbers
     * before and after removing a node with a given val.
     *
     * @param nums  the array of numbers to make a list from
     * @param val  the value of the node to be removed
     */
    private static void printLists(int[] nums, int val){
        ListGenerator generator = new ListGenerator();
        List list = new List(generator.generateList(nums));
        List listCopy = new List(generator.generateList(nums));
        Node toRemove = list.find(val);
        new Solution().removeNode(toRemove);
        System.out.printf("%s -> %s\n",
                listCopy.toString(), list.toString());

    }
}
