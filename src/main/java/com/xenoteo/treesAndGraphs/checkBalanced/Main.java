package com.xenoteo.treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;

public class Main {
    private static final String BRUTE_FORCE = "brute force";
    private static final String WITH_HEIGHTS = "with heights";
    private static final String WITH_RESULT_CLASS = "with Result class";
    private static final String OPTIMAL = "optimal";


    public static void main(String[] args) {
        printCheckingIsBalanced();
    }

    /**
     * Creates a balanced tree.
     *
     * @param type  the type of a tree to create
     * @return the root of the tree
     */
    private static TreeNode createBalancedTree(String type){
        TreeNodeFactory factory = new TreeNodeFactory();
        TreeNode node1 = factory.getTreeNode(type, 5);
        TreeNode node2 = factory.getTreeNode(type, 4, node1, null);
        TreeNode node3 = factory.getTreeNode(type, 3);
        return factory.getTreeNode(type, 7, node2, node3);
    }

    /**
     * Creates an unbalanced tree.
     *
     * @param type  the type of a tree to create
     * @return the root of the tree
     */
    private static TreeNode createNotBalancedTree(String type){
        TreeNodeFactory factory = new TreeNodeFactory();
        TreeNode node1 = factory.getTreeNode(type, 5);
        TreeNode node2 = factory.getTreeNode(type, 2, node1, null);
        TreeNode node3 = factory.getTreeNode(type, 4, node2, null);
        TreeNode node4 = factory.getTreeNode(type, 3);
        return factory.getTreeNode(type, 7, node3, node4);
    }

    /**
     * Creates trees, checks if they are balanced using different approaches and printing results.
     */
    private static void printCheckingIsBalanced(){
        Node balanced = (Node)createBalancedTree("Node");
        Node notBalanced = (Node)createNotBalancedTree("Node");
        NodeWithHeights balancedWithHeights = (NodeWithHeights)createBalancedTree("NodeWithHeights");
        NodeWithHeights notBalancedWithHeights = (NodeWithHeights)createNotBalancedTree("NodeWithHeights");

        printCheck("checking a balanced tree\n", balanced, balancedWithHeights);
        printCheck("\nchecking an unbalanced tree\n", notBalanced, notBalancedWithHeights);
    }

    /**
     * Prints one check of provided nodes.
     *
     * @param header  the header to print
     * @param node  the node  to check
     * @param nodeWithHeights  the node with heights to check
     */
    private static void printCheck(String header, Node node, NodeWithHeights nodeWithHeights){
        Solution solution = new Solution();
        String format = "%-18s: %b\n";
        System.out.printf(header + format + format + format + format,
                BRUTE_FORCE, solution.isBalanced(node),
                WITH_HEIGHTS, solution.isBalancedWithHeights(nodeWithHeights),
                WITH_RESULT_CLASS, solution.isBalancedWithResultClass(node),
                OPTIMAL, solution.isBalanced(node));
    }
}
