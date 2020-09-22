package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * Finding the first common ancestor of two nodes in a binary tree.
 * Avoiding storing additional nodes in a data structure.
 * This is not necessarily a binary search tree.
 */
public interface ISolution {

    TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q);

}
