package com.xenoteo.treesAndGraphs.checkBalanced;

/**
 * Keeping the height of a tree node and if a subtree is balanced.
 */
public class Result {
    public int height;
    public boolean isBalanced;

    public Result(int height, boolean isBalanced) {
        this.height = height;
        this.isBalanced = isBalanced;
    }
}
