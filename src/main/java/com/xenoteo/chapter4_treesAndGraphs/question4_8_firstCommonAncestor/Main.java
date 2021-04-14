package com.xenoteo.chapter4_treesAndGraphs.question4_8_firstCommonAncestor;

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
     * Creates a tree, prints the process of creating and shows current references of all the nodes.
     *
     * @param type  the type of tree to create
     */
    private static void createTree(String type){
        TreeNodeFactory factory = new TreeNodeFactory();
        node1 = factory.getTreeNode(type, 1);
        node2 = factory.getTreeNode(type, 2);
        node3 = factory.getTreeNode(type, 3, null, node2);
        root = factory.getTreeNode(type, 4, node1, node3);
        System.out.printf("type = %s\n", type);
        System.out.println("""
                node1 = factory.getTreeNode(type, 1);
                node2 = factory.getTreeNode(type, 2);
                node3 = factory.getTreeNode(type, 3, null, node2);
                root = factory.getTreeNode(type, 4, node1, node3);
                """);
        String format = "node%d: %s\n";
        System.out.printf("root : %s\n" + format + format + format + "\n",
                root,
                 1, node1,
                 2, node2,
                 3, node3);
    }

    /**
     * Prints founded common ancestors using different approaches.
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
     * Prints out what a task is performing.
     */
    private static void printTask(){
        System.out.println("Finding the first common ancestor for the nodes node1 and node2");
    }

    /**
     * Prints the solution founded using the solution class of the given type.
     *
     * @param type  the type of solution to use
     */
    private static void printSolution(String type){
        String format = "%-27s: %s\n";
        System.out.printf(format, type,
                new SolutionFactory().getSolution(type)
                        .firstCommonAncestor(root, node1, node2));
    }
}