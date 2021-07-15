package com.xenoteo.chapter2_linked_lists.question2_5_sum_lists;

import com.xenoteo.helpers.linked_list.List;
import com.xenoteo.helpers.linked_list.Node;

/**
 * The abstract class to inherit reversed solutions from.
 */
public abstract class Reversed {
    /**
     * The heads of two reversed lists.
     */
    protected Node reversed1;
    protected Node reversed2;

    /**
     * Sets reversed lists.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     */
    public void setReversed(Node head1, Node head2){
        reversed1 = new List(head1).reversed();
        reversed2 = new List(head2).reversed();
    }
}
