package com.xenoteo.treesAndGraphs.checkSubtree;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

public class Main {
    private static TreeNode root1_1;
    private static TreeNode root2_1;
    private static TreeNode root1_2;
    private static TreeNode root2_2;
    private static final String PREORDER = "Preorder";
    private static final String RECURSIVE = "Recursive";

    public static void main(String[] args) {
        printSubtreeChecks();
    }

    /**
     * Printing the whole process of checking if T2 is a subtree of T1.
     */
    private static void printSubtreeChecks(){
        System.out.println("Creating two pair of trees:\n");
        createPair1();
        System.out.println("\n\n");
        createPair2();
        System.out.println("\n\n");
        printCheck(PREORDER);
        System.out.println();
        printCheck(RECURSIVE);
    }

    /**
     * Checking two pairs using provided method.
     * @param str is a string representing method to use.
     */
    private static void printCheck(String str){
        boolean pair1;
        boolean pair2;
        Solution solution = new Solution();
        if (str.equals(PREORDER)){
            pair1 = solution.isSubtreePreorder(root1_1, root2_1);
            pair2 = solution.isSubtreePreorder(root1_2, root2_2);
        }
        else if (str.equals(RECURSIVE)){
            pair1 = solution.isSubtreeRecursive(root1_1, root2_1);
            pair2 = solution.isSubtreeRecursive(root1_2, root2_2);
        }
        else return;
        System.out.printf("%s:\npair1: %b\npair2: %b\n",
                str, pair1, pair2);
    }

    /**
     * Creating the first pair of trees, printing out this process.
     */
    private static void createPair1(){
        TreeNode node1 = new Node(14);
        TreeNode node2 = new Node(14, node1, null);

        TreeNode node3 = new Node(12);
        TreeNode node4 = new Node(11, null, node3);

        root1_1 = new Node(13, node4, node2);


        TreeNode node5 = new Node(14);

        TreeNode node6 = new Node(12);
        TreeNode node7 = new Node(11, null, node6);

        root2_1 = new Node(13, node7, node5);

        System.out.println("TreeNode node1 = new Node(14);\n" +
                "TreeNode node2 = new Node(14, node1, null);\n" +
                "\n" +
                "TreeNode node3 = new Node(12);\n" +
                "TreeNode node4 = new Node(11, null, node3);\n" +
                "\n" +
                "root1_1 = new Node(13, node4, node2);\n" +
                "\n" +
                "\n" +
                "TreeNode node5 = new Node(14);\n" +
                "\n" +
                "TreeNode node6 = new Node(12);\n" +
                "TreeNode node7 = new Node(11, null, node6);\n" +
                "\n" +
                "root2_1 = new Node(13, node7, node5);");
    }

    /**
     * Creating the second pair of trees, printing out this process.
     */
    private static void createPair2(){
        TreeNode node1 = new Node(8);
        TreeNode node2 = new Node(9, node1, null);
        TreeNode node3 = new Node(10, node2, null);
        TreeNode node4 = new Node(11, node3, null);

        root1_2 = new Node(11, node4, null);


        TreeNode node5 = new Node(8);
        TreeNode node6 = new Node(9, node5, null);
        TreeNode node7 = new Node(10, node6, null);

        root2_2 = new Node(11, node7, null);

        System.out.println("TreeNode node1 = new Node(8);\n" +
                "TreeNode node2 = new Node(9, node1, null);\n" +
                "TreeNode node3 = new Node(10, node2, null);\n" +
                "TreeNode node4 = new Node(11, node3, null);\n" +
                "\n" +
                "root1_2 = new Node(11, node4, null);\n" +
                "\n" +
                "\n" +
                "TreeNode node5 = new Node(8);\n" +
                "TreeNode node6 = new Node(9, node5, null);\n" +
                "TreeNode node7 = new Node(10, node6, null);\n" +
                "\n" +
                "root2_2 = new Node(11, node7, null);");
    }
}
