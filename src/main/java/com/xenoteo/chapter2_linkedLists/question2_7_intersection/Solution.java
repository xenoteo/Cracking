package com.xenoteo.chapter2_linkedLists.question2_7_intersection;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.Node;

import java.util.HashSet;

/**
 * Given two singly linked lists, determining if they intersect and returning the intersecting node.
 */
public class Solution {

    /**
     * Finds the intersection node of two linked lists
     * for all elements of the first list checking whether the second list contains these elements.
     * Time complexity is O(A * B), where A is the length of the first list and B is the length of the second list,
     * and space complexity is O(1).
     *
     * @param head1  the head of the first linked list
     * @param head2  the head of the second linked list
     * @return the intersection node
     */
    public Node intersectionNodeInPlace(Node head1, Node head2){
        Node node = head1;
        List list2 = new List(head2);
        while (node != null){
            if (list2.contains(node)) return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Finds the intersection node of two linked lists using hash set.
     * Time complexity is O(A + B), where A is the length of the first list and B is the length of the second list,
     * and space complexity is O(A).
     *
     * @param head1  the head of the first linked list
     * @param head2  the head of the second linked list
     * @return the intersection node
     */
    public Node intersectionNodeWithSet(Node head1, Node head2){
        Node node = head1;
        HashSet<Node> set1 = new HashSet<>();
        while (node != null){
            set1.add(node);
            node = node.next;
        }

        node = head2;
        while (node != null){
            if (set1.contains(node)) return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Finding the intersection node of two linked lists
     * iterating over the two lists' tails of equal length (that is of the length of the shortest list).
     * Time complexity is O(A + B), where A is the length of the first list and B is the length of the second list,
     * and space complexity is O(1).
     *
     * @param head1  the head of the first linked list
     * @param head2  the head of the second linked list
     * @return the intersection node
     */
    public Node intersectionNodeOptimal(Node head1, Node head2){
        List list1 = new List(head1);
        List list2 = new List(head2);

        if (list1.last() != list2.last()) return null;

        int len1 = list1.length();
        int len2 = list2.length();
        Node node1;
        Node node2;
        if (len1 > len2){
            node2 = head2;
            node1 = list1.get(len1 - len2);
        }
        else {
            node1 = head1;
            node2 = list2.get(len2 - len1);
        }

        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }

        return node1;
    }

}
