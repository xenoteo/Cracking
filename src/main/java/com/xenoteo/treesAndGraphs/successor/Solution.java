package com.xenoteo.treesAndGraphs.successor;

import com.xenoteo.helpers.tree.NodeWithParents;

/**
 * Finding an in-order successor of a given node in a binary search tree.
 * Each node has a link to its parent.
 */
public class Solution {

    /**
     * Finding an in-order successor of a given node.
     * @param node to find successor.
     * @return node's successor
     */
    public NodeWithParents successor(NodeWithParents node){
        if (node.right != null){
            node = (NodeWithParents) node.right;
            while (node.left != null)
                node = (NodeWithParents) node.left;
            return node;
        }
        else {
            while (node.parent != null && node.parent.right == node)
                node = node.parent;
            return node.parent;
        }
    }
}
