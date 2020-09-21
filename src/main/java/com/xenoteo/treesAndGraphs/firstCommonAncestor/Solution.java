package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

public class Solution {

    // O(N)
    public TreeNode firstCommonAncestor(Node root, Node first, Node second){
        return traverse(root, null, first, second);
    }

    private TreeNode traverse(TreeNode current, TreeNode ancestor, TreeNode first, TreeNode second){
        if (current == null) return ancestor;
        if (descendant(current, first) && descendant(current, second)){
            ancestor = current;
            TreeNode next = traverse(current.left, ancestor, first, second);
            if (next == current)
                ancestor = traverse(current.right, ancestor, first, second);
            else
                ancestor = next;
        }
        return ancestor;
    }

    private boolean descendant(TreeNode parent, TreeNode child){
        if (parent == null) return false;
        if (parent == child) return true;
        return descendant(parent.left, child) || descendant(parent.right, child);
    }
}
