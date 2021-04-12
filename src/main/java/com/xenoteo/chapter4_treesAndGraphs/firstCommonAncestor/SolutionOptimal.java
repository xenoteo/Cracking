package com.xenoteo.chapter4_treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;

/**
 * The class finding the first common ancestor with a faster traversing of a tree.
 * Complexity is O(N).
 */
public class SolutionOptimal extends DescendantChecker implements ISolution{

    /**
     * Checks whether two nodes belong to a given tree, and if yes finds their first common ancestor.
     *
     * @param root  the root of a tree
     * @param first  the first node
     * @param second  the second node
     * @return the first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        if (descendant(root, first) && descendant(root, second))
            return traverse(root, first, second);
        return null;
    }

    /**
     * Traverses a tree to find the first common ancestor.
     *
     * @param root  the of a tree
     * @param p  the first node
     * @param q  the second node
     * @return the first common ancestor
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
