package com.xenoteo.linkedLists.duplicatesRemoving;

import com.xenoteo.helpers.linkedList.Node;

import java.util.HashSet;

/**
 * Removing duplicates from an unsorted linked list.
 */
public class Solution {

    /**
     * Removing duplicates from an unsorted linked list without using extra space.
     * Time complexity is O(N^2), space complexity is O(1).
     * @param head is a head of the list
     * @return head of a list without duplicates
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
     * Removing duplicates from an unsorted linked list using HashSet.
     * Time complexity is O(N), space complexity is O(N).
     * @param head is a head of the list
     * @return head of a list without duplicates
     */
    public Node removeDuplicatesWithSet(Node head){
        HashSet<Integer> numbersSet = new HashSet<>();
        numbersSet.add(head.val);
        Node prev = head;
        Node cur = head.next;
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
     * Setting provided value unique in the list with a given head.
     * @param head is a head of the list
     * @param val is a value to be unique
     */
    private void setUnique(Node head, int val){
        boolean found = false;
        if (head.val == val) found = true;
        Node prev = head;
        Node cur = head.next;
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

