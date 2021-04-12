package com.xenoteo.chapter2_linkedLists.question2_5_sumLists;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.Node;


/**
 * The class adding the two numbers and finding the sum as a linked list,
 * where numbers are represented by a linked list,
 * where each node contains a single digit.
 * Using lists in the right order, recursive approach.
 */
public class RecursiveSolution implements Summing{
    /**
     * The heads of updated lists (with added zeros to the beginning to make the lists' lengths equal).
     */
    private Node updated1;
    private Node updated2;

    /**
     * Recursive sum of two numbers represented by linked lists.
     * Complexity is O(max(K, L)), where K and L are the lengths of the lists.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     * @return the sum of two numbers represented by linked lists
     */
    public Node sum(Node head1, Node head2){
        setUpdated(head1, head2);
        SumData data = digitsSum(updated1, updated2);
        if (data.carry == 0)
            return data.node;
        else
            return new Node(data.carry, data.node);
    }

    /**
     * Sets the heads of updated lists, such that they have the same length.
     *
     * @param head1  the head of the first list
     * @param head2  the head of the second list
     */
    private void setUpdated(Node head1, Node head2){
        int len1 = new List(head1).length();
        int len2 = new List(head2).length();
        if (len1 > len2){
            updated2 = addZeros(head2, len1 - len2);
            updated1 = head1;
        }
        else {
            updated1 = addZeros(head1, len2 - len1);
            updated2 = head2;
        }
    }

    /**
     * Adds zeros to the beginning of the list.
     *
     * @param head  the head of the list to add zeros to
     * @param diff  the number of zeros to be added
     * @return the head of updated list
     */
    private Node addZeros(Node head, int diff){
        for (int i = 0; i < diff; i++){
            head = new Node(0, head);
        }
        return head;
    }

    /**
     * Performs the recursive sum of digits.
     *
     * @param node1  the first node
     * @param node2  the second node
     * @return the reference to the current node and carry
     */
    private SumData digitsSum(Node node1, Node node2){
        if (node1 == null && node2 == null)
            return new SumData();

        SumData data = digitsSum(node1.next, node2.next);
        SumData currentData = new SumData();
        int sum = node1.val + node2.val + data.carry;
        currentData.node = new Node(sum % 10, data.node);
        currentData.carry = sum / 10;
        return currentData;
    }
}
