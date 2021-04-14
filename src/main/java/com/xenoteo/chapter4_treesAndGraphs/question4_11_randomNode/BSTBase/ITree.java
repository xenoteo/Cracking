package com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The interface for basic BST operations.
 */
public interface ITree {

    /**
     * Inorder insertion of a new value to the BST without duplicates.
     * @param val to insert
     */
    void insert(int val);

    /**
     * Finds a node of the provided value.
     *
     * @param val  the value to find
     * @return the node of val
     */
    TreeNode find(int val);

    /**
     * Deletes a node of the provided value if exists.
     *
     * @param val  the value to delete
     * @return the reference to a root (as it may be changed)
     *         and whether deleting was done (cannot be done if node does not exist in a tree)
     */
    DeleteResult delete(int val);
}
