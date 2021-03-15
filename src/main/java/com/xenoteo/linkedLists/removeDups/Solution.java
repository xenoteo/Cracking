package com.xenoteo.linkedLists.removeDups;

import com.xenoteo.helpers.linkedList.Node;

import java.util.HashSet;

/**
 * The class removing duplicates from an unsorted linked list.
 */
public class Solution {

    /**
     * Removes duplicates from an unsorted linked list without using extra space.
     * Time complexity is O(N^2), space complexity is O(1).
     *
     * @param head  the head of the list
     * @return the head of a list without duplicates
     */
    public Node removeDuplicatesInPlace(Node head){
        Node node = head;
        while (node != null) {
            setUnique(head, node.val);
            node = node.next;
        }
        return head;
    }

    /**
     * Removes duplicates from an unsorted linked list using HashSet.
     * Time complexity is O(N), space complexity is O(N).
     *
     * @param head  the head of the list
     * @return the head of a list without duplicates
     */
    public Node removeDuplicatesWithSet(Node head){
        HashSet<Integer> numbersSet = new HashSet<>();
        Node prev = null;
        Node cur = head;
        while (cur != null){
            if (!numbersSet.add(cur.val)) {
                prev.next = cur.next;
            }
            else
                prev = cur;
            cur = cur.next;
        }
        return head;
    }

    /**
     * Sets provided value unique in the list with a given head.
     * @param head  the head of the list
     * @param val  the value to be unique
     */
    private void setUnique(Node head, int val){
        boolean found = false;
        Node prev = null;
        Node cur = head;
        while (cur != null){
            if (cur.val == val && found) {
                prev.next = cur.next;
            }
            else prev = cur;
            if (cur.val == val  && !found) found = true;
            cur = cur.next;
        }
    }
}

