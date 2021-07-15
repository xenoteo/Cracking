package com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node.bst_base;

/**
 * The simple node of a BST.
 */
public class BSTNode extends IBSTNode{
    public BSTNode(int val) {
        super(val);
    }

    @Override
    protected String type() {
        return "BSTNode";
    }
}
