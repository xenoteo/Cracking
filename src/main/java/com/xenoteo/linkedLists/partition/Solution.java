package com.xenoteo.linkedLists.partition;

import com.xenoteo.helpers.linkedList.Node;

/**
 * Partition of a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 * If x is contained within the list, the values of x only need to be after the elements less than x.
 * The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
 */
public class Solution {

    /**
     * Stable partition using 4 pointers.
     * Complexity is O(N).
     *
     * @param head   the head of the linked list
     * @param val  the value to make partition around
     * @return the head of a "new" list
     */
    public Node stablePartition(Node head, int val){
        Node lastLesser = null;
        Node lastNotLesser = null;
        Node firstLesser = null;
        Node firstNotLesser = null;
        Node node = head;
        while (node != null){
            if (node.val < val){
                if (lastLesser != null)
                    lastLesser.next = node;
                else firstLesser = node;
                lastLesser = node;
            }
            else {
                if (lastNotLesser != null)
                    lastNotLesser.next = node;
                else firstNotLesser = node;
                lastNotLesser = node;
            }
            node = node.next;
        }
        if (lastNotLesser != null)
            lastNotLesser.next = null;
        if (lastLesser != null)
            lastLesser.next = firstNotLesser;
        if (firstLesser != null)
            return firstLesser;
        return firstNotLesser;
    }

    /**
     * Not stable partition using 2 pointers.
     * Complexity is O(N).
     *
     * @param listHead  the head of the linked list
     * @param val  the value to make partition around
     * @return the head of a "new" list
     */
    public Node partition(Node listHead, int val){
        if (listHead == null) return null;
        Node head = listHead;
        Node tail = listHead;
        Node node = listHead;
        while (node != null) {
            Node next = node.next;
            if (node.val < val){
                node.next = head;
                head = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}
