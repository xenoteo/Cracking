package com.xenoteo.chapter4_treesAndGraphs.pathWithSum;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given a binary tree in which each node contains an integer value (which might be positive or negative),
 * counting the number of paths that sum to a given value.
 *
 * The path does not need to start or end at the root or a leaf, but it must go downwards
 * (traveling only from parent nodes to child nodes).
 */
public class Solution {

    /**
     * The number of paths that sum to a given value.
     */
    private int count;
    /**
     * The sum.
     */
    private int sum;
    /**
     * The set of path starting nodes.
     */
    private HashSet<TreeNode> starts;

    /**
     * Brute force traversal of the tree.
     *
     * Using additional hash set for tracking the starts of paths, for not counting the same path twice.
     *
     * Complexity is O(N * lg(N))
     *
     * @param root  the root of the tree
     * @param sum  the sum to find
     * @return the number of paths with given sum
     */
    public int numberOfPathsWithSumTraversing(TreeNode root, int sum) {
        resetData(sum);
        starts.add(root);
        traverse(root, 0);
        return count;
    }

    /**
     * Resets the data before the start of algorithm.
     *
     * @param sum  the sum to be set
     */
    private void resetData(int sum) {
        count = 0;
        this.sum = sum;
        starts = new HashSet<>();
    }

    /**
     * Traverses the tree and counts the number of appropriate paths.
     *
     * If new current sum is equal to target sum, then count is incremented.
     *
     * Continuing the path with the children nodes or starting new paths from the children.
     *
     * @param node  the node to analyze
     * @param currentSum  the current sum of the path
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
     * Traverses the tree once tracking all current sums (without starting of new paths)
     * then iterates over a map and finds the number of occurrences of sums with value (currentSum - sum),
     * as it means that there exist partial paths with required sum.
     *
     * All paths of required sum are also counted.
     *
     * Complexity is O(N).
     *
     * @param root  the root of the tree
     * @param sum  the sum to find
     * @return the number of paths with given sum
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
     * Fills the map with the number of occurrences of a certain sum.
     *
     * @param node  the node  to analyze
     * @param sum  the current sum
     * @param sumsCount  the map to be filled
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
