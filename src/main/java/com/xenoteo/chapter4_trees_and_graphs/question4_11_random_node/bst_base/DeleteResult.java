package com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node.bst_base;

/**
 * The class for returning two values after delete() operation.
 */
public class DeleteResult {
    /**
     * Whether node was deleted.
     */
    public boolean deleted = true;

    /**
     * The new root of the tree.
     */
    public IBSTNode root;
}
