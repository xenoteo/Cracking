package com.xenoteo.linkedLists.deleteMiddleNode;

import com.xenoteo.helpers.linkedList.Node;

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
