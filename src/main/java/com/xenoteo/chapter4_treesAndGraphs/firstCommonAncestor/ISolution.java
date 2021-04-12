package com.xenoteo.chapter4_treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The interface for finding the first common ancestor of two nodes in a binary tree.
 *
 * Avoiding storing additional nodes in a data structure.
 *
 * This is not necessarily a binary search tree.
 */
public interface ISolution {

    /**
     * Finds the first common ancestor of two nodes in a binary tree.
     *
     * @param root  the root of the tree
     * @param p  the first node
     * @param q  the second node
     * @return the first common ancestor of two nodes in a binary tree
     */
    TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q);

}
