package com.xenoteo.chapter4_treesAndGraphs.BSTsequences;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class SolutionTest {
    private TreeNode root;
    private HashSet<LinkedList<Integer>> resultSet;

    public SolutionTest(){
        createTree();
        fillResultSet();
    }

    private void createTree(){
        TreeNode node1 = new Node(1);
        TreeNode node2 = new Node(2, node1, null);

        TreeNode node4 = new Node(6);
        TreeNode node5 = new Node(5, null, node4);

        root = new Node(4, node2, node5);
    }

    private void fillResultSet(){
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        result.add(new LinkedList<>(Arrays.asList(4, 2, 5, 6, 1)));
        result.add(new LinkedList<>(Arrays.asList(4, 2, 5, 1, 6)));
        result.add(new LinkedList<>(Arrays.asList(4, 5, 2, 6, 1)));
        result.add(new LinkedList<>(Arrays.asList(4, 5, 2, 1, 6)));
        result.add(new LinkedList<>(Arrays.asList(4, 2, 1, 5, 6)));
        result.add(new LinkedList<>(Arrays.asList(4, 5, 6, 2, 1)));

        resultSet = new HashSet<>();
        resultSet.addAll(result);
    }

    @Test
    public void getSequencesTest(){
        Assert.assertEquals(resultSet, new HashSet<>(new Solution().getSequences(root)));
    }
}
