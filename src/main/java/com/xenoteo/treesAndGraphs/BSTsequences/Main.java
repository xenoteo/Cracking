package com.xenoteo.treesAndGraphs.BSTsequences;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

public class Main {

    public static void main(String[] args) {
        printTreeAndArrays();
    }

    /**
     * Printing a tree creation and all possible arrays that could have led to this tree.
     */
    private static void printTreeAndArrays(){
        TreeNode root = createTree();
        System.out.println("Possible arrays:");
        System.out.println(new Solution().getSequences(root));
    }

    /**
     * Creating a tree sample and printing the process of creation.
     * @return root of the tree
     */
    private static TreeNode createTree(){
        TreeNode node1 = new Node(1);
        TreeNode node2 = new Node(2, node1, null);

        TreeNode node4 = new Node(6);
        TreeNode node5 = new Node(5, null, node4);

        TreeNode root = new Node(4, node2, node5);

        System.out.println("TreeNode node1 = new Node(1);\n" +
                "TreeNode node2 = new Node(2, node1, null);\n" +
                "\n" +
                "TreeNode node4 = new Node(6);\n" +
                "TreeNode node5 = new Node(5, null, node4);\n" +
                "\n" +
                "TreeNode root = new Node(4, node2, node5);\n");

        return root;
    }
}
