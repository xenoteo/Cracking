package com.xenoteo.helpers.tree;

/**
 * Simple tree node.
 */
public class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
