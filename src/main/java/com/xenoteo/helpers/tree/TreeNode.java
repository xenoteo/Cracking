package com.xenoteo.helpers.tree;

/**
 * A simple abstract tree node to extend.
 */
public abstract class TreeNode {
    /**
     * The node's value.
     */
    public int val;
    /**
     * The node's left child.
     */
    public TreeNode left;
    /**
     * The node's right child.
     */
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
