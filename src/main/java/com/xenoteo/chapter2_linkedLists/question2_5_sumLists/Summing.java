package com.xenoteo.chapter2_linkedLists.question2_5_sumLists;

import com.xenoteo.helpers.linkedList.Node;

/**
 * The interface to implement the sum of two numbers represented by linked lists.
 */
public interface Summing {
    /**
     * Sums two numbers represented by linked lists.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     * @return the sum of two numbers represented by linked lists
     */
    Node sum(Node head1, Node head2);
}
