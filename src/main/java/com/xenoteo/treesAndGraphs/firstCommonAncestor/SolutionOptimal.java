package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * Finding the first common ancestor with faster traversing of a tree.
 * Complexity is O(N).
 */
public class SolutionOptimal extends DescendantChecker implements ISolution{

    /**
     * Checking whether two nodes belong to a given tree,
     * and if yes finding their first common ancestor.
     * @param root of a tree
     * @param first node
     * @param second node
     * @return first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        if (descendant(root, first) && descendant(root, second))
            return traverse(root, first, second);
        return null;
    }

    /**
     * Traversing a tree to find the first common ancestor.
     * @param root of a tree
     * @param p is the first node
     * @param q is the second node
     * @return first common ancestor
     */
    private TreeNode traverse(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)
            return null;

        TreeNode left = traverse(root.left, p, q);
        if (left != null && left != p && left != q)
            return left;

        TreeNode right = traverse(root.right, p, q);
        if (right != null && right != p && right != q)
            return right;

        if (left != null && right != null)
            return root;
        if (root == p || root == q)
            return root;
        if (left != null)
            return left;
        else
            return right;
    }

}
