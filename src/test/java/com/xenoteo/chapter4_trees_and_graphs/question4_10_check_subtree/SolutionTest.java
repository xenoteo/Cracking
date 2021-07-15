package com.xenoteo.chapter4_trees_and_graphs.question4_10_check_subtree;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private TreeNode root1_1;
    private TreeNode root2_1;

    private TreeNode root1_2;
    private TreeNode root2_2;

    private TreeNode root1_3;
    private TreeNode root2_3;

    private final Solution solution;

    public SolutionTest(){
        solution = new Solution();
        createPair1();
        createPair2();
        createPair3();
    }

    private void createPair1(){
        TreeNode node1 = new Node(14);
        TreeNode node2 = new Node(14, node1, null);

        TreeNode node3 = new Node(12);
        TreeNode node4 = new Node(11, null, node3);

        root1_1 = new Node(13, node4, node2);


        TreeNode node5 = new Node(14);

        TreeNode node6 = new Node(12);
        TreeNode node7 = new Node(11, null, node6);

        root2_1 = new Node(13, node7, node5);
    }

    private void createPair2(){
        TreeNode node1 = new Node(8);
        TreeNode node2 = new Node(9, node1, null);
        TreeNode node3 = new Node(10, node2, null);
        TreeNode node4 = new Node(11, node3, null);

        root1_2 = new Node(11, node4, null);


        TreeNode node5 = new Node(8);
        TreeNode node6 = new Node(9, node5, null);
        TreeNode node7 = new Node(10, node6, null);

        root2_2 = new Node(11, node7, null);
    }

    private void createPair3(){
        TreeNode node1 = new Node(8);
        TreeNode node2 = new Node(9, node1, null);
        TreeNode node3 = new Node(11);

        root1_3 = new Node(10, node2, node3);


        TreeNode node4 = new Node(8);

        root2_3 = new Node(9, node4, null);
    }

    @Test
    public void isSubtreePreorderTest(){
        Assert.assertFalse(solution.isSubtreePreorder(root1_1, root2_1));
        Assert.assertTrue(solution.isSubtreePreorder(root1_2, root2_2));
        Assert.assertTrue(solution.isSubtreePreorder(root1_3, root2_3));
        Assert.assertFalse(solution.isSubtreePreorder(root1_1, root2_2));
        Assert.assertFalse(solution.isSubtreePreorder(null, root2_1));
        Assert.assertTrue(solution.isSubtreePreorder(root1_1, null));
    }

    @Test
    public void isSubtreeRecursiveTest(){
        Assert.assertFalse(solution.isSubtreeRecursive(root1_1, root2_1));
        Assert.assertTrue(solution.isSubtreeRecursive(root1_2, root2_2));
        Assert.assertTrue(solution.isSubtreeRecursive(root1_3, root2_3));
        Assert.assertFalse(solution.isSubtreeRecursive(root1_1, root2_2));
        Assert.assertFalse(solution.isSubtreeRecursive(null, root2_1));
        Assert.assertTrue(solution.isSubtreeRecursive(root1_1, null));
    }
}
