package com.xenoteo.chapter2_linked_lists.question2_8_loop_detection;

import com.xenoteo.helpers.linked_list.Node;

import java.util.HashSet;

/**
 * Given a circular linked list, returning the node at the beginning of the loop.
 */
public class Solution {

    /**
     * Returns the first node of the loop using set.
     * Time complexity is O(N), space complexity is O(N).
     *
     * @param head  the of the list
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
     * Returns the first node of the loop using two pointers.
     * Time complexity is O(N), space complexity is O(1).
     *
     * @param head  the of the list
     * @return the first node of the loop
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
