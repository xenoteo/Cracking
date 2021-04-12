package com.xenoteo.chapter2_linkedLists.question2_6_palindrome;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;

public class Main {
    private static final String REVERSED = "comparing to reversed";
    private static final String HALF_REVERSED = "comparing two halves";
    private static final String WITH_STACK = "with stack";
    private static final String RECURSIVE = "recursive";

    public static void main(String[] args) {
        printIsPalindrome(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1});
        printIsPalindrome(new int[] {1, 8, 7, 4, 5, 4, 3, 2, 9});
    }

    /**
     * Generates a list from given array of numbers and prints the result of checking whether provided list is a palindrome
     * (using different approaches).
     * @param nums  the array of numbers generate a linked list from
     */
    private static void printIsPalindrome(int[] nums){
        ListGenerator generator = new ListGenerator();
        Node head = generator.generateList(nums);
        Node headCopy = generator.generateList(nums);
        Solution solution = new Solution();
        String format = "%-22s: %b\n";
        System.out.printf("%s\n" + format + format + format + format + "\n",
                new List(head),
                REVERSED, solution.isPalindromeReversed(head),
                WITH_STACK, solution.isPalindromeWithStack(head),
                RECURSIVE, solution.isPalindromeRecursive(head),
                HALF_REVERSED, solution.isPalindromeHalfReversed(headCopy));
    }
}
