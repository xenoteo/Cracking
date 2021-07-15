package com.xenoteo.chapter2_linked_lists.question2_5_sum_lists;

import com.xenoteo.helpers.linked_list.*;

public class Main {
    private static final String RECURSIVE = "recursive";
    private static final String RECURSIVE_REVERSED = "recursive reversed";
    private static final String ITERATIVE_REVERSED = "iterative reversed";

    public static void main(String[] args) {
        ListGenerator generator = new ListGenerator();
        printAllSums(
                generator.generateList(new int[]{1, 2, 3}),
                generator.generateList(new int[]{7, 7}));
    }

    /**
     * Prints the two given lists and their sum founded using provided summing object.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     */
    private static void printSum(Node head1, Node head2, Summing summing){
        String str1 = new List(head1).toString();
        String str2 = new List(head2).toString();
        String resultStr = new List(summing.sum(head1, head2)).toString();
        int maxLen = findMaxLen(str1, str2, resultStr);
        String format = "%" + maxLen + "s\n";
        System.out.printf(format + format + format + "\n", str1,  str2, resultStr);
    }

    /**
     * Finds the max length of 3 given strings.
     *
     * @param str1  the first string
     * @param str2  the second string
     * @param str3  the third string
     * @return the max length of the strings
     */
    private static int findMaxLen(String str1, String str2, String str3){
        int maxLen = Math.max(
                str1.length(),
                str2.length());
        maxLen = Math.max(
                maxLen,
                str3.length()
        );
        return maxLen;
    }

    /**
     * Prints sums of two given lists using all implemented approaches.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     */
    private static void printAllSums(Node head1, Node head2){
        System.out.println(ITERATIVE_REVERSED);
        printSum(head1, head2, new IterativeReversedSolution());
        System.out.println(RECURSIVE_REVERSED);
        printSum(head1, head2, new RecursiveReversedSolution());
        System.out.println(RECURSIVE);
        printSum(head1, head2, new RecursiveSolution());
    }
}
