package com.xenoteo.chapter4_trees_and_graphs.question4_2_minimal_tree;

import com.xenoteo.helpers.tree.Tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        Tree tree = new Tree(new Solution().makeTree(arr));
        System.out.println(Arrays.toString(arr));
        System.out.printf("root: %d\ndepth: %d\n", tree.root.val, tree.depth());
    }
}
