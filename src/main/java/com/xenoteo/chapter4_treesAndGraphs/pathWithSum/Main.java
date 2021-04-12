package com.xenoteo.chapter4_treesAndGraphs.pathWithSum;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

public class Main {
    private static final String TRAVERSING = "traversing";
    private static final String WITH_MAP = "with map";

    public static void main(String[] args) {
        printFindingPaths();
    }

    /**
     * Printing the creation of the tree and finding paths of a certain sum
     * using different approaches.
     */
    private static void printFindingPaths(){
        TreeNode root = createTree();
        Solution solution = new Solution();
        int sum = 3;
        System.out.printf("Finding sum = %d\n", sum);
        String format = "%-11s: %d\n";
        System.out.printf(format + format,
                TRAVERSING, solution.numberOfPathsWithSumTraversing(root, sum),
                WITH_MAP, solution.numberOfPathsWithSumWithMap(root, sum));
    }

    /**
     * Creating a tree and printing out the process of creating.
     * @return root of the created tree
     */
    private static TreeNode createTree(){
        TreeNode node1 = new Node(3);
        TreeNode node2 = new Node(-1, node1, null);
        TreeNode node3 = new Node(2);
        TreeNode root =  new Node(1, node2, node3);
        System.out.println("TreeNode node1 = new Node(3);\n" +
                "TreeNode node2 = new Node(-1, node1, null);\n" +
                "TreeNode node3 = new Node(2);\n" +
                "TreeNode root =  new Node(1, node2, node3);\n");
        return root;
    }
}