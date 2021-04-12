package com.xenoteo.chapter4_treesAndGraphs.randomNode.BSTBase;

/**
 * Class for returning two values after delete() operation.
 */
public class DeleteResult {
    /**
     * Whether node was deleted.
     */
    public boolean deleted = true;

    /**
     * New root of a tree.
     */
    public IBSTNode root;
}
