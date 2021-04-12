package com.xenoteo.chapter4_treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The tree node keeping the heights of its right and left subtrees.
 */
public class NodeWithHeights extends TreeNode {
    /**
     * The height of the left subtree.
     */
    public int leftSubtreeHeight;
    /**
     * The height of the right subtree.
     */
    public int rightSubtreeHeight;

    public NodeWithHeights(int val) {
        super(val);
    }

    public NodeWithHeights(int val, TreeNode left, TreeNode right) {
        super(val, left, right);
    }
}
