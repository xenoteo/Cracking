package com.xenoteo.treesAndGraphs.listOfDepths;

import com.xenoteo.helpers.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node left = new Node(3);
        Node right = new Node(7);
        Node root = new Node(5, left, right);
        System.out.println("Node left = new Node(3);\n" +
                "Node right = new Node(7);\n" +
                "Node root = new Node(5, left, right);");

        Solution solution = new Solution();

        ArrayList<LinkedList<Node>> listsDfs = solution.getListOfDepthsDfs(root);
        ArrayList<LinkedList<Node>> listsBfs = solution.getListOfDepthsBfs(root);


        System.out.printf("listsDfs: %s\n", listToString(listsDfs));
        System.out.printf("listsBfs: %s", listToString(listsBfs));
    }

    /**
     * Converting list of lists to string.
     * @param lists to convert to string
     * @return string representing list of lists
     */
    private static String listToString(ArrayList<LinkedList<Node>> lists){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < lists.size() - 1; i++) {
            str.append("[");
            LinkedList<Node> list = lists.get(i);
            for (int j = 0; j < list.size() - 1; j++){
                str.append(list.get(j).val);
                str.append(", ");
            }
            str.append(list.get(list.size() - 1).val);
            str.append("], ");
        }
        str.append("[");
        LinkedList<Node> list = lists.get(lists.size() - 1);
        for (int j = 0; j < list.size() - 1; j++){
            str.append(list.get(j).val);
            str.append(", ");
        }
        str.append(list.get(list.size() - 1).val);
        str.append("]");
        str.append("]");
        return str.toString();
    }
}
