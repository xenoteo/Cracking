package com.xenoteo.chapter2_linked_lists.question2_5_sum_lists;

import com.xenoteo.helpers.linked_list.Node;

/**
 * The class adding the two numbers and finding the sum as a linked list,
 * where numbers are represented by a linked list,
 * where each node contains a single digit.
 * Using reversed lists, recursive approach.
 */
public class RecursiveReversedSolution extends Reversed implements Summing{

    /**
     * Recursive sum of two numbers represented by linked lists.
     * Given lists become reversed and then summed.
     * Complexity is O(max(K, L)), where K and L are the lengths of the lists.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     * @return the sum of two numbers represented by linked lists
     */
    public Node sum(Node head1, Node head2){
        setReversed(head1, head2);
        return reversedDigitsSum(reversed1, reversed2, 0, null);
    }

    /**
     * Finds the recursive sum of two numbers represented by two reversed linked lists.
     * Generating the result represented by a linked list in the right order.
     *
     * @param node1  the head of the first list
     * @param node2  the head of the second list
     * @param carry  the carry to add
     * @param last   the last found node (to set the reference to the current's next)
     * @return the head of the summed lists
     */
    private Node reversedDigitsSum(Node node1, Node node2, int carry, Node last){
        if (node1 == null && node2 == null && carry == 0) return last;
        int sum = countSum(node1, node2) + carry;
        Node node = new Node(sum % 10, last);
        Node next1 = getNext(node1);
        Node next2 = getNext(node2);
        return reversedDigitsSum(next1, next2, sum / 10, node);
    }

    /**
     * Finds the sum of two nodes, considering that they may be null.
     *
     * @param node1  the first node
     * @param node2  the second node
     * @return the sum of two nodes
     */
    private int countSum(Node node1, Node node2){
        int sum = 0;
        if (node1 != null)
            sum += node1.val;
        if (node2 != null)
            sum += node2.val;
        return sum;
    }

    /**
     * Finds the next element of the node, considering that it may be null.
     *
     * @param node  the node to find the next
     * @return the next node
     */
    private Node getNext(Node node){
        if (node != null) return node.next;
        return null;
    }
}
