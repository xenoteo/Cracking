package com.xenoteo.chapter2_linked_lists.question2_5_sum_lists;

import com.xenoteo.helpers.linked_list.Node;

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
