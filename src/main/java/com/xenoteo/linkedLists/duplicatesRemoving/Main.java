package com.xenoteo.linkedLists.duplicatesRemoving;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;

public class Main {
    private static final String ORIGINAL = "original list";
    private static final String WITHOUT_DUPS = "without duplicates ";
    private static final String IN_PLACE = "in place";
    private static final String WITH_SET = "with set";

    public static void main(String[] args) {
        printLists(new int[]{3, 3, 5, 6, 7, 7, 9, 3, 2, 2, 1});
    }

    /**
     * Printing the original list and the list with removed duplicates sing different approaches.
     * @param nums is an array of numbers to make a list from
     */
    private static void printLists(int[] nums){
        Solution solution = new Solution();
        Node head = new ListGenerator().generateList(nums);
        Node headCopy1 = new ListGenerator().generateList(nums);
        Node headCopy2 = new ListGenerator().generateList(nums);
        System.out.printf("%-28s: %s\n%-28s: %s\n%-28s: %s\n\n",
                ORIGINAL, new List(head),
                WITHOUT_DUPS + IN_PLACE, new List(solution.removeDuplicatesInPlace(headCopy1)),
                WITHOUT_DUPS + WITH_SET, new List(solution.removeDuplicatesWithSet(headCopy2)));
    }
}
