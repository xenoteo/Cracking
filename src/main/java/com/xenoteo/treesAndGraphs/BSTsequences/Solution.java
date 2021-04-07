package com.xenoteo.treesAndGraphs.BSTsequences;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.LinkedList;

/**
 * Given a binary search tree with distinct elements, finding all possible arrays that could have led to this tree
 * (by traversing through an array from left to right and inserting each element to the tree).
 */
public class Solution {

    /**
     * Recursively finds all possible arrays that could have led to this subtree.
     *
     * @param root  the root of the tree
     * @return the list of sequences that could have led to this tree
     */
    public LinkedList<LinkedList<Integer>> getSequences(TreeNode root){
        LinkedList<LinkedList<Integer>> sequences = new LinkedList<>();
        if (root == null){
            sequences.add(new LinkedList<>());
            return sequences;
        }

        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(root.val);

        LinkedList<LinkedList<Integer>> leftSequences = getSequences(root.left);
        LinkedList<LinkedList<Integer>> rightSequences = getSequences(root.right);

        for (LinkedList<Integer> left : leftSequences){
            for (LinkedList<Integer> right : rightSequences){
                LinkedList<LinkedList<Integer>> mixed = new LinkedList<>();
                mixSequences(mixed, left, right, prefix);
                sequences.addAll(mixed);
            }
        }

        return sequences;
    }

    /**
     * Mixes together sequences from right and left subtrees keeping the elements within each array in the same relative order.
     *
     * @param sequences  the result list of sequences to be updated
     * @param first  the first list to mix
     * @param second  the second list to mix
     * @param prefix  the prefix to be mixed with first and second, being at the beginning
     */
    private void mixSequences(LinkedList<LinkedList<Integer>> sequences,
                              LinkedList<Integer> first, LinkedList<Integer> second,
                              LinkedList<Integer> prefix){
        if (first.size() == 0 || second.size() == 0){
            LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
            result.addAll(first);
            result.addAll(second);
            sequences.add(result);
            return;
        }

        int headFirst = first.removeFirst();
        prefix.addLast(headFirst);
        mixSequences(sequences, first, second, prefix);
        prefix.removeLast();
        first.addFirst(headFirst);

        int headSecond = second.removeFirst();
        prefix.addLast(headSecond);
        mixSequences(sequences, first, second, prefix);
        prefix.removeLast();
        second.addFirst(headSecond);
    }
}