package com.xenoteo.treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.Tree;
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
     * Creating a balanced tree.
     * @param type of a tree to create
     * @return a root of the tree
     */
    private static TreeNode createBalancedTree(String type){
        TreeNodeFactory factory = new TreeNodeFactory();
        TreeNode node1 = factory.getTreeNode(type, 5);
        TreeNode node2 = factory.getTreeNode(type, 4, node1, null);
        TreeNode node3 = factory.getTreeNode(type, 3);
        return factory.getTreeNode(type, 7, node2, node3);
    }

    /**
     * Creating an unbalanced tree.
     * @param type of a tree to create
     * @return a root of the tree
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
     * Creating trees, checking if they are balanced using different approaches and printing results.
     */
    private static void printCheckingIsBalanced(){
        Node balanced = (Node)createBalancedTree("Node");
        Node notBalanced = (Node)createNotBalancedTree("Node");
        NodeWithHeights balancedWithHeights = (NodeWithHeights)createBalancedTree("NodeWithHeights");
        NodeWithHeights notBalancedWithHeights = (NodeWithHeights)createNotBalancedTree("NodeWithHeights");

        Solution solution = new Solution();

        String format = "%-18s: %b\n";
        System.out.printf("checking a balanced tree\n" + format + format + format + format,
                BRUTE_FORCE, solution.isBalanced(balanced),
                WITH_HEIGHTS, solution.isBalancedWithHeights(balancedWithHeights),
                WITH_RESULT_CLASS, solution.isBalancedWithResultClass(balanced),
                OPTIMAL, solution.isBalanced(balanced));

        System.out.printf("\nchecking an unbalanced tree\n" + format + format + format + format,
                BRUTE_FORCE, solution.isBalanced(notBalanced),
                WITH_HEIGHTS, solution.isBalancedWithHeights(notBalancedWithHeights),
                WITH_RESULT_CLASS, solution.isBalancedWithResultClass(notBalanced),
                OPTIMAL, solution.isBalanced(notBalanced));
    }
}
