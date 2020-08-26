package com.xenoteo.helpers.linkedList;

/**
 * Node of a simple linked list.
 */
public class Node {
    public Node next;
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
