package com.xenoteo.linkedLists.loopDetection;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;

public class Main {
    private static final String ORIGINAL = "given list";
    private static final String FIRST_LOOP = "first node in loop";
    private static final String IN_PLACE = "in place";
    private static final String WITH_SET = "with set";

    public static void main(String[] args) {
        ListGenerator generator = new ListGenerator();

        Node head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        List list1 = new List(head1);
        list1.last().next = list1.find(5);

        Node head2 = generator.generateList(new int[]{4, 8, 7, 2, 1, 9, 8, 6});
        new List(head2).last().next = head2;

        Node head3 = generator.generateList(new int[]{4, 7, 3, 6, 4, 2, 1});

        printLoop(head1);
        printLoop(head2);
        printLoop(head3);
    }

    /**
     * Printing a circular list and its first node of the loop
     * founded using different approaches.
     * @param head of the circular list
     */
    private static void printLoop(Node head){
        Solution solution = new Solution();
        System.out.printf("%s:\n%s\n%s\n%-8s: %s\n%-8s: %s\n\n",
                ORIGINAL,
                getListLoopString(head),
                FIRST_LOOP,
                WITH_SET, solution.detectLoopWithSet(head),
                IN_PLACE, solution.detectLoopInPlace(head));
    }

    /**
     * Generating a string representing nodes references of the circular list.
     * The first node of the loop is printed twice,
     * the last printed node is the first node of the loop printed the second time.
     * @param head of the circular list
     * @return string representing references of the nodes of the circular linked list
     */
    private static String getListLoopString(Node head){
        Node firstLoop = new Solution().detectLoopInPlace(head);
        int firstCount = 0;
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node node = head;
        while (firstCount < 2 && node != null){
            if (firstLoop == node)
                firstCount++;
            str.append(node);
            node = node.next;
            if (firstCount < 2 && node != null)
                str.append(", ");
            else str.append("]");
        }
        return str.toString();
    }
}
