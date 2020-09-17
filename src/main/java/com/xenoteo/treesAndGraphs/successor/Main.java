package com.xenoteo.treesAndGraphs.successor;

import com.xenoteo.helpers.tree.NodeWithParents;
import com.xenoteo.helpers.tree.TreeNodeFactory;

public class Main {
    public static void main(String[] args) {
        createTreeAndFindSuccessors();
    }

    /**
     * Creating a tree, finding successors of all of nodes and printing them.
     */
    private static void createTreeAndFindSuccessors(){
        TreeNodeFactory factory = new TreeNodeFactory();

        NodeWithParents node1 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 2);
        NodeWithParents node2 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 6);
        NodeWithParents node3 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 5, node1, node2);
        NodeWithParents root = (NodeWithParents)factory.getTreeNode("NodeWithParents", 8, node3, null);
        System.out.println("NodeWithParents node1 = (NodeWithParents)factory.getTreeNode(\"NodeWithParents\", 2);\n" +
                "NodeWithParents node2 = (NodeWithParents)factory.getTreeNode(\"NodeWithParents\", 6);\n" +
                "NodeWithParents node3 = (NodeWithParents)factory.getTreeNode(\"NodeWithParents\", 5, node1, node2);\n" +
                "NodeWithParents root = (NodeWithParents)factory.getTreeNode(\"NodeWithParents\", 8, node3, null);\n");
        Solution solution = new Solution();

        String format = "%-5s  %-9s\n";
        System.out.printf(format, "node", "successor");
        System.out.printf(format, node1.val, solution.successor(node1).val);
        System.out.printf(format, node2.val, solution.successor(node2).val);
        System.out.printf(format, node3.val, solution.successor(node3).val);
        System.out.printf(format, root.val, solution.successor(root));
    }
}
