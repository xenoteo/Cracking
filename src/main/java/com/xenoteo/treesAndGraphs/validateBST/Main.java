package com.xenoteo.treesAndGraphs.validateBST;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;

public class Main {
    private static final String WITH_RANGE = "with range";
    private static final String WITH_LIST = "with list";
    private static final String REMEMBERING_VALUE = "remembering last value"; // 22

    public static void main(String[] args) {
        printChecks();
    }

    /**
     * Creating one BST and one not BST and checking if they are BST using different approaches.
     */
    private static void printChecks(){
        TreeNode bst = createBST();
        TreeNode notBst = createNotBST();
        printCheck("Checking BST\n", bst);
        printCheck("\nChecking not BST\n", notBst);
    }

    /**
     * Printing 3 checks if a given tree is BST.
     * @param header to print
     * @param root of the tree to check
     */
    private static void printCheck(String header, TreeNode root){
        Solution solution = new Solution();
        String format = "%-23s: %b\n";
        System.out.printf(header + format + format + format,
                WITH_RANGE, solution.isBSTWithRange(root),
                WITH_LIST, solution.isBSTWithList(root),
                REMEMBERING_VALUE, solution.isBSTRememberingValue(root));
    }

    /**
     * Creating an example of BST.
     * @return a tree root
     */
    private static TreeNode createBST(){
        TreeNodeFactory factory = new TreeNodeFactory();

        TreeNode node1 = factory.getTreeNode("Node", 2);
        TreeNode node2 = factory.getTreeNode("Node", 6);
        TreeNode node3 = factory.getTreeNode("Node", 5, node1, node2);

        TreeNode node4 = factory.getTreeNode("Node", 9);
        TreeNode node5 = factory.getTreeNode("Node", 13);
        TreeNode node6 = factory.getTreeNode("Node", 11, node4, node5);

        return factory.getTreeNode("Node", 8, node3, node6);
    }

    /**
     * Creating an example of not BST.
     * @return a tree root
     */
    private static TreeNode createNotBST(){
        TreeNodeFactory factory = new TreeNodeFactory();

        TreeNode node1 = factory.getTreeNode("Node", 7);
        TreeNode node2 = factory.getTreeNode("Node", 9);
        TreeNode node3 = factory.getTreeNode("Node", 5, node1, node2);

        TreeNode node4 = factory.getTreeNode("Node", 9);
        TreeNode node5 = factory.getTreeNode("Node", 3);
        TreeNode node6 = factory.getTreeNode("Node", 17, node4, node5);

        return factory.getTreeNode("Node", 8, node3, node6);
    }
}
