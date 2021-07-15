package com.xenoteo.chapter4_trees_and_graphs.question4_4_check_balanced;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

/**
 * The class checking if a binary tree is balanced.
 *
 * For the purposes of this question, a balanced tree is defined to be
 * a tree such that the heights of the two subtrees of any node never differ by more than one.
 */
public class Solution {

    /**
     * Checks if a tree is balanced without remembering any values.
     *
     * Time complexity is O(N * log(N)).
     *
     * @param root  the root of tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedBruteForce(Node root){
        if (root == null) return false;
        return traverseBruteForce(root);
    }

    /**
     * Recursively counts the height of the given node.
     *
     * @param node  the node to find the height
     * @return the height of the node
     */
    private int height(TreeNode node){
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * Traverses the tree and checks if the tree is balanced using brute force.
     *
     * @param node  the node to traverse
     * @return is the tree balanced
     */
    private boolean traverseBruteForce(TreeNode node){
        if (node == null) return true;
        if (Math.abs(height(node.right) - height(node.left)) < 2)
            return traverseBruteForce(node.left) && traverseBruteForce(node.right);
        return false;
    }



    /**
     * Checks if the tree is balanced using modified class of a tree node,which keeps heights of its subtrees.
     *
     * Complexity is O(N).
     *
     * @param root  the root of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedWithHeights(NodeWithHeights root){
        setHeights(root);
        return traverseWithHeights(root);
    }

    /**
     * Sets heights of every node in a tree using recursive counting.
     *
     * @param node  the node to set height.
     */
    private void setHeights(NodeWithHeights node){
        if (node == null) return;
        node.leftSubtreeHeight = height(node.left);
        node.rightSubtreeHeight = height(node.right);
        setHeights((NodeWithHeights) node.left);
        setHeights((NodeWithHeights) node.right);
    }

    /**
     * Traverses and checks if a tree is balanced using data stored in a modified tree node class.
     * @param node  the node to check
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
     * Checks if the tree is balanced using additional Result class.
     *
     * Complexity is O(N).
     *
     * @param root  the node of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalancedWithResultClass(Node root){
        return heightWithResultClass(root).isBalanced;
    }

    /**
     * Sets a height of every node in the tree and checks if the given node is balanced.
     *
     * @param node  the node to set height
     * @return the height of the node and if the node is balanced
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
     * Checks if a tree is balanced without any additional classes.
     *
     * The most optimal solution.
     * Complexity is O(N).
     *
     * @param root  the root of the tree to check
     * @return is the tree balanced
     */
    public boolean isBalanced(Node root){
        return heightAndIsBalanced(root) != -1;
    }

    /**
     * Finds the height of the tree if it is balanced or returning -1 if it is not.
     *
     * @param node  the node to find height
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
