package com.xenoteo.treesAndGraphs.randomNode.BSTBase;

/**
 * Simple node of a BST.
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
