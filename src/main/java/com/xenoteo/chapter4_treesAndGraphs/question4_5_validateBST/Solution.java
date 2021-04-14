package com.xenoteo.chapter4_treesAndGraphs.question4_5_validateBST;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.LinkedList;

/**
 * The class checking if a binary tree is a binary search tree.
 */
public class Solution {

    /**
     * Checks if a binary tree is a binary search tree using range checks.
     *
     * Time complexity is O(N), space complexity is O(H), where H is the height of the tree.
     *
     * @param root  the root of the tree to check
     * @return if the tree is a BST
     */
    public boolean isBSTWithRange(TreeNode root){
        return traverseWithRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Traverses a tree and checks if each node is in the right place.
     *
     * @param node  the node to check
     * @param min  the min allowed value
     * @param max  the max allowed value
     * @return if the subtree is a BST
     */
    private boolean traverseWithRange(TreeNode node, int min, int max){
        if (node == null) return true;
        if (min < node.val && node.val <= max)
            return traverseWithRange(node.left, min, node.val) && traverseWithRange(node.right, node.val, max);
        return false;
    }



    /**
     * Checks if a binary tree is a binary search tree using list for remembering in-ordered elements.
     *
     * Works fine only with a tree without duplicates.
     *
     * Time complexity is O(N), space complexity is O(N).
     *
     * @param root  the root of a tree to check
     * @return if the tree is a BST
     */
    public boolean isBSTWithList(TreeNode root){
        LinkedList<Integer> list = new LinkedList<>();
        traverseAndFillList(list, root);
        return isSorted(list);
    }

    /**
     * Traverses a tree and fills a list with in-ordered elements.
     *
     * @param list  the list to fill
     * @param node  the node to add to the list
     */
    private void traverseAndFillList(LinkedList<Integer> list, TreeNode node){
        if (node == null) return;
        traverseAndFillList(list, node.left);
        list.add(node.val);
        traverseAndFillList(list, node.right);
    }

    /**
     * Checks if a list is sorted.
     *
     * @param list  the list to check
     * @return if the list is sorted
     */
    private boolean isSorted(LinkedList<Integer> list){
        Integer[] arr = list.toArray(new Integer[0]);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;
       return true;
    }



    /**
     * Checks if a binary tree is a binary search tree using list for remembering in-ordered elements but without list,
     * just with one variable storing the last value.
     *
     * Works fine only with a tree without duplicates.
     *
     * Time complexity is O(N), space complexity is O(H), where H is the height of the tree.
     *
     * @param root  the root of a tree to check
     * @return if the tree is a BST
     */
    public boolean isBSTRememberingValue(TreeNode root){
        lastValue = null;
        return traverseAndCompare(root);
    }

    /**
     * The last "touched" value.
     */
    private Integer lastValue = null;

    /**
     * Traverses a tree and compares the current value to the last remembered.
     *
     * @param node  the node to check
     * @return if the subtree is a BST
     */
    private boolean traverseAndCompare(TreeNode node){
        if (node == null) return true;
        if (!traverseAndCompare(node.left))
            return false;
        if (lastValue != null && node.val < lastValue)
            return false;
        lastValue = node.val;
        return traverseAndCompare(node.right);
    }
}
