package com.xenoteo.chapter2_linked_lists.question2_5_sum_lists;

import com.xenoteo.helpers.linked_list.*;

/**
 * The class adding the two numbers and finding the sum as a linked list,
 * where numbers are represented by a linked list,
 * where each node contains a single digit.
 * Using reversed lists, iterative approach.
 */
public class IterativeReversedSolution extends Reversed implements Summing{
    /**
     * Memory for carried for the next step of summing.
     */
    private int carry = 0;

    /**
     * Iterative sum of two numbers represented by linked lists.
     * Given lists become reversed and then summed.
     * Complexity is O(max(K, L)), where K and L are the lengths of the lists.
     * The memory for new list is allocated, so space complexity is also O(max(K, L)).
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     * @return the sum of two numbers represented by linked lists
     */
    public Node sum(Node head1, Node head2){
        setReversed(head1, head2);

        Node node1 = reversed1;
        Node node2 = reversed2;
        Node tail = null;

        while (node1 != null && node2 != null){
            int val = node1.val + node2.val + carry;
            Node newNode = new Node(val % 10, tail);  // assuming sum could not be of more than 2 digits
            carry = val / 10;
            tail = newNode;
            node1 = node1.next;
            node2 = node2.next;
        }
        tail = setTail(tail, node1);
        tail = setTail(tail, node2);

        while (carry != 0){
            Node newNode = new Node(carry % 10, tail);
            carry /= 10;
            tail = newNode;
        }

        return tail;
    }

    /**
     * Runs over the rest of the one of two lists in the case when one list is longer than another.
     * @param tail  the tail to be updated
     * @param node  the node to start running from
     * @return new tail
     */
    private Node setTail(Node tail, Node node){
        while (node != null){
            int val = node.val + carry;
            Node newNode = new Node(val % 10, tail);
            carry = val / 10;
            tail = newNode;
            node = node.next;
        }
        return tail;
    }
}
