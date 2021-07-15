package com.xenoteo.chapter2_linked_lists.question2_3_delete_middle_node;

import com.xenoteo.helpers.linked_list.Node;

/**
 * Deleting a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 */
public class Solution {

    /**
     * Removing a node in the middle of a linked list.
     * Complexity is O(1).
     *
     * @param node  the node to delete
     */
    public void removeNode(Node node){
        if (node == null || node.next == null) return;
        Node next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
