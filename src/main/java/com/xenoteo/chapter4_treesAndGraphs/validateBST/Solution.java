package com.xenoteo.chapter4_treesAndGraphs.validateBST;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.LinkedList;

/**
 * Checking if a binary tree is a binary search tree.
 */
public class Solution {

    /**
     * Checking if a binary tree is a binary search tree using range checks.
     * Time complexity is O(N), space complexity is O(H), where H is the height of the tree.
     * @param root of a tree to check
     * @return is the tree a BST
     */
    public boolean isBSTWithRange(TreeNode root){
        return traverseWithRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Traversing a tree and checking if each node is in the right place.
     * @param node to check
     * @param min allowed value
     * @param max allowed value
     * @return is the subtree a BST
     */
    private boolean traverseWithRange(TreeNode node, int min, int max){
        if (node == null) return true;
        if (min < node.val && node.val <= max)
            return traverseWithRange(node.left, min, node.val) && traverseWithRange(node.right, node.val, max);
        return false;
    }



    /**
     * Checking if a binary tree is a binary search tree
     * using list for remembering in-ordered elements.
     * Works fine only with a tree without duplicates.
     * Time complexity is O(N), space complexity is O(N).
     * @param root of a tree to check
     * @return is the tree a BST
     */
    public boolean isBSTWithList(TreeNode root){
        LinkedList<Integer> list = new LinkedList<>();
        traverseAndFillList(list, root);
        return isSorted(list);
    }

    /**
     * Traversing a tree and filling a list with in-ordered elements.
     * @param list to fill
     * @param node to add to list
     */
    private void traverseAndFillList(LinkedList<Integer> list, TreeNode node){
        if (node == null) return;
        traverseAndFillList(list, node.left);
        list.add(node.val);
        traverseAndFillList(list, node.right);
    }

    /**
     * Checking if list is sorted.
     * @param list to check
     * @return is the list sorted
     */
    private boolean isSorted(LinkedList<Integer> list){
        Integer[] arr = list.toArray(new Integer[0]);
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;
       return true;
    }



    /**
     * Checking if a binary tree is a binary search tree
     * using list for remembering in-ordered elements but without list,
     * just with one variable storing the last value.
     * Works fine only with a tree without duplicates.
     * Time complexity is O(N), space complexity is O(H), where H is the height of the tree.
     * @param root of a tree to check
     * @return is the tree a BST
     */
    public boolean isBSTRememberingValue(TreeNode root){
        lastValue = null;
        return traverseAndCompare(root);
    }

    /**
     * Last "touched" value.
     */
    private Integer lastValue = null;

    /**
     * Traversing a tree and comparing a current value to the last remembered.
     * @param node to check
     * @return is a subtree a BST
     */
    private boolean traverseAndCompare(TreeNode node){
        if (node == null) return true;
        if (!traverseAndCompare(node.left))
            return false;
        if (lastValue != null && node.val < lastValue)
            return false;
        lastValue = node.val;
        if (!traverseAndCompare(node.right))
            return false;
        return true;
    }
}
