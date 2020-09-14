package com.xenoteo.treesAndGraphs.listOfDepths;

import com.xenoteo.helpers.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a binary tree, creating a linked list of all the nodes at each depth.
 */
public class Solution {

    /**
     * Creating list of nodes at each depth using DFS.
     * @param root of a tree
     * @return list of nodes at each depth
     */
    public ArrayList<LinkedList<Node>> getListOfDepthsDfs(Node root){
        ArrayList<LinkedList<Node>> lists = new ArrayList<>();
        traverse(root, 0, lists);
        return lists;
    }

    /**
     * Traversing a tree and filling the list of nodes at each depth.
     * @param node to process
     * @param depth of a current node
     * @param lists of nodes at each depth
     */
    private void traverse(Node node, int depth, ArrayList<LinkedList<Node>> lists){
        if (node == null) return;
        LinkedList<Node> list;
        if (lists.size() > depth)
            list = lists.get(depth);
        else {
            list = new LinkedList<>();
            lists.add(list);
        }
        list.add(node);
        traverse(node.left, depth + 1, lists);
        traverse(node.right, depth + 1, lists);
    }

    /**
     * Creating list of nodes at each depth using BFS.
     * @param root of a tree
     * @return list of nodes at each depth
     */
    public ArrayList<LinkedList<Node>> getListOfDepthsBfs(Node root){
        ArrayList<LinkedList<Node>> lists = new ArrayList<>();

        LinkedList<Node> current = new LinkedList<>();
        current.add(root);

        while(!current.isEmpty()){
            lists.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();
            for (Node node : parents){
                if (node.left != null)
                    current.add(node.left);
                if (node.right != null)
                    current.add(node.right);
            }
        }

        return lists;
    }
}
