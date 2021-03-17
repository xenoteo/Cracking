package com.xenoteo.linkedLists.returnKthToLast;

import com.xenoteo.helpers.linkedList.Node;

/**
 * The class finding the kth to last element of a singly linked list.
 */
public class Solution {

    /**
     * Finds the kth to last element of a linked list using two pointers.
     * Complexity is O(N).
     *
     * @param head  the head of the linked list
     * @param k  the index of element to find
     * @return the kth to last element of the list
     */
    public Node kthToLast(Node head, int k){
        Node first = head;
        for (int i = 0; i < k; i++){
            first = first.next;
            if (first == null && i < k - 1) return null;
        }
        Node second = head;
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
