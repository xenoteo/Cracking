package com.xenoteo.chapter4_trees_and_graphs.question4_8_first_common_ancestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The class finding the first common ancestor using traversing of a tree.
 * Complexity is O(N).
 */
public class Solution extends DescendantChecker implements ISolution{

    /**
     * Finds the first common ancestor using traversing of a tree.
     *
     * Starting value is null, and it will not be changed if some of nodes does not belong to a tree.
     *
     * @param root  the root of a tree
     * @param first  the first node
     * @param second  the second node
     * @return the first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode first, TreeNode second){
        return traverse(root, null, first, second);
    }

    /**
     * Traverses a tree to find the first common ancestor of two nodes, cumulating the current ancestor.
     *
     * @param current  the current root to check
     * @param ancestor  the current ancestor
     * @param first  the first node
     * @param second  the second node
     * @return the first common ancestor
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
