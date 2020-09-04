package com.xenoteo.linkedLists.intersection;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;

public class Main {
    private static final String ORIGINAL = "given lists";
    private static final String IN_PLACE = "in place";
    private static final String WITH_SET = "with set";
    private static final String OPTIMAL = "optimal";

    public static void main(String[] args) {
        ListGenerator generator = new ListGenerator();
        Node head1 = generator.generateList(new int[]{1, 2, 3, 4});
        Node head2 = generator.generateList(new int[]{-2, -1, 0});
        new List(head2).last().next = head1;

        Node head3 = generator.generateList(new int[]{1, 2, 3, 4});

        printIntersection(head1, head2);
        printIntersection(head1, head3);
    }

    /**
     * Printing the references of all nodes of given lists and their intersection node
     * using different approaches.
     * @param head1 of the first list
     * @param head2 of the second list
     */
    private static void printIntersection(Node head1, Node head2){
        Solution solution = new Solution();
        String format = "%-8s: %s\n";
        System.out.printf("%s:\n%s\n%s\n" + format + format + format + "\n",
                ORIGINAL, new List(head1).referencesToString(), new List(head2).referencesToString(),
                IN_PLACE, solution.intersectionNodeInPlace(head1, head2),
                WITH_SET, solution.intersectionNodeWithSet(head1, head2),
                OPTIMAL, solution.intersectionNodeOptimal(head1, head2));
    }
}
