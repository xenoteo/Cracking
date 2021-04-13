package com.xenoteo.chapter4_treesAndGraphs.randomNode.BSTBase;

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
