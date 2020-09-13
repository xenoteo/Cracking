package com.xenoteo.treesAndGraphs.minimalTree;

import com.xenoteo.helpers.tree.Node;

/**
 * Given a sorted (increasing order) array with unique integer elements,
 * creating a binary search tree with minimal height.
 */
public class Solution {

    /**
     * Making a tree from array using helper function.
     * General complexity is O(N).
     * @param arr to create tree from
     * @return tree root
     */
    public Node makeTree(int[] arr){
        return fillTree(arr, 0, arr.length - 1);
    }

    /**
     * Creating a subtree representing an array from index l to r.
     * @param arr to make tree from
     * @param l is an index to start from
     * @param r is an index to end
     * @return root of the subtree
     */
    private Node fillTree(int[] arr, int l, int r){
        if (l > r) return null;
        int m = (l + r) / 2;
        Node root = new Node(arr[m]);
        root.left = fillTree(arr, l, m - 1);
        root.right = fillTree(arr, m + 1, r);
        return root;
    }
}
