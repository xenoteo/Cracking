package com.xenoteo.chapter4_trees_and_graphs.question4_10_check_subtree;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * The class determining if T2 is a subtree of T1.
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2.
 */
public class Solution {

    /**
     * Determines if T2 is a subtree of T1 using comparison of preorder traversings.
     *
     * Complexity is O(M + N), where M is the size of T1 and N is the size of T2.
     *
     * @param root1  the root of T1
     * @param root2  the root of T2
     * @return is T2 a subtree of T1
     */
    public boolean isSubtreePreorder(TreeNode root1, TreeNode root2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        preorder(str1, root1);
        preorder(str2, root2);

        return new String(str1).contains(new String(str2));
    }

    /**
     * Fills str with the values from tree in preorder.
     *
     * @param str  the string builder to fill
     * @param node  the current node to add
     */
    private void preorder(StringBuilder str, TreeNode node){
        if (node == null){
            str.append("x ");
            return;
        }
        str.append(node.val);
        str.append(" ");
        preorder(str, node.left);
        preorder(str, node.right);
    }



    /**
     * Determines if T2 is a subtree of T1 using recursive traversing and comparison of subtrees.
     *
     * Complexity is O(M + K * N), where M is the size of T1, N is the size of T2,
     * and K is number of nodes in T1 with the value of T2's root.
     *
     * @param root1  the root of T1
     * @param root2  the root of T2
     * @return is T2 a subtree of T1
     */
    public boolean isSubtreeRecursive(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        List<TreeNode> subRoots = new LinkedList<>();
        findSubRoots(root1, subRoots, root2.val);
        for (TreeNode root : subRoots){
            if (equals(root, root2))
                return true;
        }
        return false;
    }

    /**
     * Finds all nodes of T1 with the value of T2's root.
     *
     * @param node  the current node to analyze
     * @param subRoots  the list of sub roots to fill
     * @param val  the value of T2's root
     */
    private void findSubRoots(TreeNode node, List<TreeNode> subRoots, int val){
        if (node == null)
            return;
        if (node.val == val)
            subRoots.add(node);
        if (node.val < val)
            findSubRoots(node.right, subRoots, val);
        else
            findSubRoots(node.left, subRoots, val);
    }

    /**
     * Checks whether two subtrees are equal.
     *
     * @param node1  the node from T1
     * @param node2  the node from T2
     * @return if subtrees are equal
     */
    private boolean equals(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;
        return node1.val == node2.val
                && equals(node1.left, node2.left)
                && equals(node1.right, node2.right);
    }
}