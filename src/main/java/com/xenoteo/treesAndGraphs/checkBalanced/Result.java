package com.xenoteo.treesAndGraphs.checkBalanced;

/**
 * The class keeping the height of a tree node and if a subtree is balanced.
 */
public class Result {
    /**
     * The height of the tree.
     */
    public int height;
    /**
     * Whether tree is balanced or not.
     */
    public boolean isBalanced;

    public Result(int height, boolean isBalanced) {
        this.height = height;
        this.isBalanced = isBalanced;
    }
}
