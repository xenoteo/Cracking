package com.xenoteo.helpers.linkedList;

/**
 * The class representing a node of a simple linked list.
 */
public class Node {
    /**
     * The reference to the next node.
     */
    public Node next;
    /**
     * The value of the node.
     */
    public int val;

    public Node(int val){
        this.next = null;
        this.val = val;
    }

    public Node(int val, Node next){
        this.next = next;
        this.val = val;
    }
}
