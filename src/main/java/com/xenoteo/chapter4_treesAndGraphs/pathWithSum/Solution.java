package com.xenoteo.chapter4_treesAndGraphs.pathWithSum;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given a binary tree in which each node contains an integer value (which might be positive or negative),
 * counting the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 */
public class Solution {
    private int count;
    private int sum;
    private HashSet<TreeNode> starts;

    /**
     * Brute force traversing the tree.
     * Using additional hash set for tracking the starts of paths,
     * for not counting the same path twice.
     * Complexity is O(N * lg(N))
     *
     * @param root of the tree
     * @param sum  to find
     * @return number of paths with given sum
     */
    public int numberOfPathsWithSumTraversing(TreeNode root, int sum) {
        resetData(sum);
        starts.add(root);
        traverse(root, 0);
        return count;
    }

    /**
     * Resetting data before start of algorithm.
     *
     * @param sum to be set
     */
    private void resetData(int sum) {
        count = 0;
        this.sum = sum;
        starts = new HashSet<>();
    }

    /**
     * Traversing the tree and counting the number of appropriate paths.
     * If new current sum is equal to target sum, then count is incremented.
     * Continuing the path with the children nodes
     * or starting new paths from the children.
     *
     * @param node       to analyze
     * @param currentSum of path
     */
    private void traverse(TreeNode node, int currentSum) {
        if (node == null)
            return;
        currentSum += node.val;
        if (currentSum == sum)
            count++;
        traverse(node.left, currentSum);
        traverse(node.right, currentSum);
        if (!starts.contains(node.left)) {
            starts.add(node.left);
            traverse(node.left, 0);
        }
        if (!starts.contains(node.right)) {
            starts.add(node.right);
            traverse(node.right, 0);
        }
    }


    /**
     * Traversing the tree once tracking all current sums (without starting of new paths)
     * then iterating over a map and finding the number of occurrences of sums with value (currentSum - sum),
     * as it means that there exist partial paths with required sum.
     * All paths of required sum are also counted.
     * Complexity is O(N).
     *
     * @param root of the tree
     * @param sum  to find
     * @return number of paths with given sum
     */
    public int numberOfPathsWithSumWithMap(TreeNode root, int sum) {
        HashMap<Integer, Integer> sumsCount = new HashMap<>();
        fillMap(root, 0, sumsCount);
        int count = 0;
        for (Map.Entry<Integer, Integer> pair : sumsCount.entrySet()) {
            count += sumsCount.getOrDefault(pair.getKey() - sum, 0);
        }
        count += sumsCount.getOrDefault(sum, 0);
        return count;
    }

    /**
     * Filling the map with number of occurrences of a certain sum.
     * @param node to analyze
     * @param sum is a current sum
     * @param sumsCount is a map to be filled
     */
    private void fillMap(TreeNode node, int sum, HashMap<Integer, Integer> sumsCount) {
        if (node == null)
            return;
        sum += node.val;
        sumsCount.put(sum, sumsCount.getOrDefault(sum, 0) + 1);
        fillMap(node.left, sum, sumsCount);
        fillMap(node.right, sum, sumsCount);
    }
}
