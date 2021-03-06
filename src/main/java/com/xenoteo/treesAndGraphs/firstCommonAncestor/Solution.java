package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * Finding the first common ancestor using traversing of a tree.
 * Complexity is O(N).
 */
public class Solution extends DescendantChecker implements ISolution{

    /**
     * Finding the first common ancestor using traversing of a tree.
     * Starting value is null, and it will not be changed
     * if some of nodes does not belong to a tree.
     * @param root of a tree
     * @param first node
     * @param second node
     * @return first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode first, TreeNode second){
        return traverse(root, null, first, second);
    }

    /**
     * Traversing a tree to find the first common ancestor of two nodes,
     * cumulating the current ancestor.
     * @param current root to check
     * @param ancestor is the current ancestor
     * @param first node
     * @param second node
     * @return first common ancestor
     */
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
}
