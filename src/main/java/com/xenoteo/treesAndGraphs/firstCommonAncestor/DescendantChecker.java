package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

public abstract class DescendantChecker {

    protected boolean descendant(TreeNode parent, TreeNode child){
        if (parent == null) return false;
        if (parent == child) return true;
        return descendant(parent.left, child) || descendant(parent.right, child);
    }

}
