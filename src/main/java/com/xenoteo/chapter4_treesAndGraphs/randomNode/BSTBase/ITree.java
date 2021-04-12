package com.xenoteo.chapter4_treesAndGraphs.randomNode.BSTBase;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * Interface for basic BST operations.
 */
public interface ITree {

    /**
     * Inorder inserting a new value to a BST without duplicates.
     * @param val to insert
     */
    void insert(int val);

    /**
     * Finding a node of provided value.
     * @param val to find
     * @return node of val
     */
    TreeNode find(int val);

    /**
     * Deleting a node of val if exists.
     * @param val to delete
     * @return reference to a root (as it may be changed)
     *         and whether deleting was done (cannot be done if node does not exist in a tree)
     */
    DeleteResult delete(int val);
}
