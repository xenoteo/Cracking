package com.xenoteo.treesAndGraphs.pathWithSum;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private TreeNode root1;
    private TreeNode root2;
    private int result1;
    private int result2;

    public SolutionTest(){
        fillTree1();
        fillTree2();
    }

    private void fillTree1(){
        TreeNode node1 = new Node(0);
        TreeNode node2 = new Node(7);
        TreeNode node3 = new Node(3, node1, node2);
        TreeNode node4 = new Node(6);
        TreeNode node5 = new Node(2, node4, node3);
        TreeNode node6 = new Node(0);
        TreeNode node7 = new Node(5, null, node6);
        root1 = new Node(1, node5, node7);
        result1 = 5;
    }

    private void fillTree2(){
        TreeNode node1 = new Node(3);
        TreeNode node2 = new Node(-1, node1, null);
        TreeNode node3 = new Node(2);
        root2 = new Node(1, node2, node3);
        result2 = 3;
    }

    @Test
    public void numberOfPathsWithSumTraversingTest(){
        Solution solution = new Solution();
        Assert.assertEquals(result1, solution.numberOfPathsWithSumTraversing(root1, 6));
        Assert.assertEquals(result2, solution.numberOfPathsWithSumTraversing(root2, 3));
        Assert.assertEquals(0, solution.numberOfPathsWithSumTraversing(null, 6));
    }

    @Test
    public void numberOfPathsWithSumWithMapTest(){
        Solution solution = new Solution();
        Assert.assertEquals(result1, solution.numberOfPathsWithSumWithMap(root1, 6));
        Assert.assertEquals(result2, solution.numberOfPathsWithSumWithMap(root2, 3));
        Assert.assertEquals(0, solution.numberOfPathsWithSumWithMap(null, 6));
    }
}