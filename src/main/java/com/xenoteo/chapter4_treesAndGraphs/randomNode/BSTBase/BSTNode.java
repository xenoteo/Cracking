package com.xenoteo.chapter4_treesAndGraphs.randomNode.BSTBase;

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
