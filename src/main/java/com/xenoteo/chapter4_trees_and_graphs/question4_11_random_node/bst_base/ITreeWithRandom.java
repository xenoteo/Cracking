package com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node.bst_base;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The interface for trees implementing method finding a random tree node.
 */
public interface ITreeWithRandom {
    /**
     * Gets a random tree node.
     *
     * @return the random tree node
     */
    TreeNode getRandomNode();
}
