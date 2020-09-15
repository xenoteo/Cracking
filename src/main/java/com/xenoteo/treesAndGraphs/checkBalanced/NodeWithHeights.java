package com.xenoteo.treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * Tree node keeping the heights of its right and left subtrees.
 */
public class NodeWithHeights extends TreeNode {
    public int leftSubtreeHeight;
    public int rightSubtreeHeight;

    public NodeWithHeights(int val) {
        super(val);
    }

    public NodeWithHeights(int val, TreeNode left, TreeNode right) {
        super(val, left, right);
    }
}
