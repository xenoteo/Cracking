package com.xenoteo.treesAndGraphs.listOfDepths;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;

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
    public ArrayList<LinkedList<TreeNode>> getListOfDepthsDfs(Node root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        traverse(root, 0, lists);
        return lists;
    }

    /**
     * Traversing a tree and filling the list of nodes at each depth.
     * @param node to process
     * @param depth of a current node
     * @param lists of nodes at each depth
     */
    private void traverse(TreeNode node, int depth, ArrayList<LinkedList<TreeNode>> lists){
        if (node == null) return;
        LinkedList<TreeNode> list;
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
    public ArrayList<LinkedList<TreeNode>> getListOfDepthsBfs(Node root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();

        LinkedList<TreeNode> current = new LinkedList<>();
        current.add(root);

        while(!current.isEmpty()){
            lists.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();
            for (TreeNode node : parents){
                if (node.left != null)
                    current.add(node.left);
                if (node.right != null)
                    current.add(node.right);
            }
        }

        return lists;
    }
}
