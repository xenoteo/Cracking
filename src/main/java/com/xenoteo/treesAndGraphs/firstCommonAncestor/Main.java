package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;

public class Main {
    private static TreeNode root;
    private static TreeNode node1;
    private static TreeNode node2;
    private static TreeNode node3;

    public static void main(String[] args) {
        printFirstCommonAncestorFinding();
    }

    /**
     * Creating a tree, printing the process of creating and showing current references of all the nodes.
     * @param type of tree to create
     */
    private static void createTree(String type){
        TreeNodeFactory factory = new TreeNodeFactory();
        node1 = factory.getTreeNode(type, 1);
        node2 = factory.getTreeNode(type, 2);
        node3 = factory.getTreeNode(type, 3, null, node2);
        root = factory.getTreeNode(type, 4, node1, node3);
        System.out.printf("type = %s\n", type);
        System.out.println("node1 = factory.getTreeNode(type, 1);\n" +
                "node2 = factory.getTreeNode(type, 2);\n" +
                "node3 = factory.getTreeNode(type, 3, null, node2);\n" +
                "root = factory.getTreeNode(type, 4, node1, node3);\n");
        String format = "node%d: %s\n";
        System.out.printf("root : %s\n" + format + format + format + "\n",
                root,
                 1, node1,
                 2, node2,
                 3, node3);
    }

    /**
     * Printing founded common ancestors using different approaches.
     */
    private static void printFirstCommonAncestorFinding(){
        createTree("Node");
        printTask();
        printSolution("Solution");
        printSolution("SolutionOptimal");
        System.out.println("\n");

        createTree("NodeWithParents");
        printTask();
        printSolution("SolutionWithParents");
        printSolution("SolutionWithParentsOptimal");
        System.out.println("\n");
    }

    /**
     * Printing out what task is performing.
     */
    private static void printTask(){
        System.out.println("Finding the first common ancestor for the nodes node1 and node2");
    }

    /**
     * Printing solution founded using the solution class of given type.
     * @param type of solution to use
     */
    private static void printSolution(String type){
        String format = "%-27s: %s\n";
        System.out.printf(format, type,
                new SolutionFactory().getSolution(type)
                        .firstCommonAncestor(root, node1, node2));
    }
}