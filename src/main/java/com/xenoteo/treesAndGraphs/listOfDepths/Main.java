package com.xenoteo.treesAndGraphs.listOfDepths;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Node left = new Node(3);
        Node right = new Node(7);
        Node root = new Node(5, left, right);
        System.out.println("""
                Node left = new Node(3);
                Node right = new Node(7);
                Node root = new Node(5, left, right);""");

        Solution solution = new Solution();

        ArrayList<LinkedList<TreeNode>> listsDfs = solution.getListOfDepthsDfs(root);
        ArrayList<LinkedList<TreeNode>> listsBfs = solution.getListOfDepthsBfs(root);


        System.out.printf("listsDfs: %s\n", listToString(listsDfs));
        System.out.printf("listsBfs: %s", listToString(listsBfs));
    }

    /**
     * Converts a list of lists to string.
     *
     * @param lists  the list of lists to convert to string
     * @return the string representing list of lists
     */
    private static String listToString(ArrayList<LinkedList<TreeNode>> lists){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < lists.size() - 1; i++) {
            str.append("[");
            LinkedList<TreeNode> list = lists.get(i);
            for (int j = 0; j < list.size() - 1; j++){
                str.append(list.get(j).val);
                str.append(", ");
            }
            str.append(list.get(list.size() - 1).val);
            str.append("], ");
        }
        str.append("[");
        LinkedList<TreeNode> list = lists.get(lists.size() - 1);
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
