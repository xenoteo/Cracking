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
     * Creates a list of nodes at each depth using DFS.
     *
     * @param root  the root of the tree
     * @return the list of nodes at each depth
     */
    public ArrayList<LinkedList<TreeNode>> getListOfDepthsDfs(Node root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        traverse(root, 0, lists);
        return lists;
    }

    /**
     * Traverses a tree and fills the list of nodes at each depth.
     *
     * @param node  the node to process
     * @param depth  the depth of the current node
     * @param lists  the list of lists of nodes at each depth
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
     * Creates a list of nodes at each depth using BFS.
     *
     * @param root  the root of the tree
     * @return the list of nodes at each depth
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
