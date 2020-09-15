package com.xenoteo.treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

/**
 * Checking if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be
 * a tree such that the heights of the two subtrees of any node never differ by more than one.
 */
public class Solution {

    /**
     * Checking if a tree is balanced without remembering any values.
     * Time complexity is O(N * log(N)).
     * @param root of tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedBruteForce(Node root){
        if (root == null) return false;
        return traverseBruteForce(root);
    }

    /**
     * Recursive counting the height of a given node.
     * @param node to find height
     * @return the height of the node
     */
    private int height(TreeNode node){
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * Traversing and checking if a tree is balanced using brute force.
     * @param node to traverse
     * @return is the tree balanced
     */
    private boolean traverseBruteForce(TreeNode node){
        if (node == null) return true;
        if (Math.abs(height(node.right) - height(node.left)) < 2)
            return traverseBruteForce(node.left) && traverseBruteForce(node.right);
        return false;
    }



    /**
     * Checking if a tree is balanced using modified class of a tree node,
     * which keeps heights of its subtrees.
     * Complexity is O(N).
     * @param root of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedWithHeights(NodeWithHeights root){
        setHeights(root);
        return traverseWithHeights(root);
    }

    /**
     * Setting heights of every node in a tree using recursive counting.
     * @param node to set height.
     */
    private void setHeights(NodeWithHeights node){
        if (node == null) return;
        node.leftSubtreeHeight = height(node.left);
        node.rightSubtreeHeight = height(node.right);
        setHeights((NodeWithHeights) node.left);
        setHeights((NodeWithHeights) node.right);
    }

    /**
     * Traversing and checking if a tree is balanced
     * using data stored in modified tree node class.
     * @param node to check
     * @return is the tree balanced
     */
    private boolean traverseWithHeights(NodeWithHeights node){
        if (node == null) return true;
        if (Math.abs(node.leftSubtreeHeight - node.rightSubtreeHeight) < 2)
            return traverseWithHeights((NodeWithHeights) node.left)
                    && traverseWithHeights((NodeWithHeights) node.right);
        return false;
    }



    /**
     * Checking if a tree is balanced using additional Result class.
     * Complexity is O(N).
     * @param root of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedWithResultClass(Node root){
        return heightWithResultClass(root).isBalanced;
    }

    /**
     * Setting height of every node in a tree and checking if given node is balanced.
     * @param node to set height
     * @return height of the node and if the node is balanced
     */
    private Result heightWithResultClass(TreeNode node){
        if (node == null) return new Result(0, true);
        Result leftResult = heightWithResultClass(node.left);
        Result rightResult = heightWithResultClass(node.right);
        return new Result(1 + Math.max(leftResult.height, rightResult.height),
                leftResult.isBalanced && rightResult.isBalanced
                        && Math.abs(leftResult.height - rightResult.height) < 2);
    }



    /**
     * Checking if a tree is balanced without any additional classes.
     * The most optimal solution.
     * Complexity is O(N).
     * @param root of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalanced(Node root){
        return heightAndIsBalanced(root) != -1;
    }

    /**
     * Finding the height of a tree if it is balanced or returning -1 if it is not.
     * @param node to find height
     * @return the height of the node or -1 if it is not balanced
     */
    private int heightAndIsBalanced(Node node){
        if (node == null) return 0;
        int left = heightAndIsBalanced((Node) node.left);
        int right = heightAndIsBalanced((Node) node.right);
        if (Math.abs(left - right) > 1 || left == -1 || right == -1)
            return -1;
        return 1 + Math.max(left, right);
    }
}
