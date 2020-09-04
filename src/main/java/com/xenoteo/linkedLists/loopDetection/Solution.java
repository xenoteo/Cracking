package com.xenoteo.linkedLists.loopDetection;

import com.xenoteo.helpers.linkedList.Node;

import java.util.HashSet;

/**
 * Given a circular linked list, returning the node at the beginning of the loop.
 */
public class Solution {

    /**
     * Returning the first node of the loop using set.
     * Time complexity is O(N), space complexity is O(N).
     * @param head of the list
     * @return the first node of the loop
     */
    public Node detectLoopWithSet(Node head){
        Node node = head;
        HashSet<Node> set = new HashSet<>();
        while (node != null){
            if (!set.add(node)) return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Returning the first node of the loop using two pointers.
     * Time complexity is O(N), space complexity is O(1).
     * @param head of the list
     * @return the first node of the list
     */
    public Node detectLoopInPlace(Node head){
        Node fast = head;
        Node slow = head;
        Node collision = null;
        while (fast.next != null && collision == null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) collision = slow;
        }
        if (collision == null) return null;
        Node node = head;
        while (node != collision){
            collision = collision.next;
            node = node.next;
        }
        return node;
    }
}
