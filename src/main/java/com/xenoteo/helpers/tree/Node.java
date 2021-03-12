package com.xenoteo.helpers.tree;

/**
 * A simple tree node.
 */
public class Node extends TreeNode{

    public Node(int val) {
        super(val);
    }

    public Node(int val, TreeNode left, TreeNode right) {
        super(val, left, right);
    }
}
