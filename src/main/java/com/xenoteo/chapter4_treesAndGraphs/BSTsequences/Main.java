package com.xenoteo.chapter4_treesAndGraphs.BSTsequences;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        printTreeAndArrays();
    }

    /**
     * Prints a tree creation and all possible arrays that could have led to this tree.
     */
    private static void printTreeAndArrays(){
        TreeNode root = createTree();
        System.out.println("Possible arrays:");
        System.out.println(new Solution().getSequences(root));
    }

    /**
     * Creates a tree sample and prints the process of creation.
     *
     * @return the root of the tree
     */
    private static TreeNode createTree(){
        TreeNode node1 = new Node(1);
        TreeNode node2 = new Node(2, node1, null);

        TreeNode node4 = new Node(6);
        TreeNode node5 = new Node(5, null, node4);

        TreeNode root = new Node(4, node2, node5);

        System.out.println("""
                TreeNode node1 = new Node(1);
                TreeNode node2 = new Node(2, node1, null);

                TreeNode node4 = new Node(6);
                TreeNode node5 = new Node(5, null, node4);

                TreeNode root = new Node(4, node2, node5);
                """);

        return root;
    }
}
