package com.xenoteo.chapter4_trees_and_graphs.question4_8_first_common_ancestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The abstract class checking whether one node is a descendant of another.
 */
public abstract class DescendantChecker {

    /**
     * Checks whether one node is a descendant of another.
     *
     * @param parent  the parent node
     * @param child  the child node
     * @return whether one node is a descendant of another
     */
    protected boolean descendant(TreeNode parent, TreeNode child){
        if (parent == null) return false;
        if (parent == child) return true;
        return descendant(parent.left, child) || descendant(parent.right, child);
    }

}
