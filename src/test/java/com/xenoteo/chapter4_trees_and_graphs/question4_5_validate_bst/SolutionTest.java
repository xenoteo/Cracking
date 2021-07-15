package com.xenoteo.chapter4_trees_and_graphs.question4_5_validate_bst;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private TreeNode root1;
    private TreeNode root2;
    private TreeNode root3;
    private TreeNode root4;

    private final TreeNodeFactory factory;
    private final Solution solution;

    public SolutionTest(){
        factory = new TreeNodeFactory();
        solution = new Solution();
        createTree1();
        createTree2();
        createTree3();
        createTree4();
    }

    private void createTree1(){
        TreeNode node1 = factory.getTreeNode("Node", 2);
        TreeNode node2 = factory.getTreeNode("Node", 6);
        TreeNode node3 = factory.getTreeNode("Node", 5, node1, node2);

        TreeNode node4 = factory.getTreeNode("Node", 9);
        TreeNode node5 = factory.getTreeNode("Node", 13);
        TreeNode node6 = factory.getTreeNode("Node", 11, node4, node5);

        root1 = factory.getTreeNode("Node", 8, node3, node6);
    }

    private void createTree2(){
        TreeNode node1 = factory.getTreeNode("Node", 7);
        TreeNode node2 = factory.getTreeNode("Node", 9);
        TreeNode node3 = factory.getTreeNode("Node", 5, node1, node2);

        TreeNode node4 = factory.getTreeNode("Node", 9);
        TreeNode node5 = factory.getTreeNode("Node", 3);
        TreeNode node6 = factory.getTreeNode("Node", 17, node4, node5);

        root2 = factory.getTreeNode("Node", 8, node3, node6);
    }

    private void createTree3(){
        TreeNode node1 = factory.getTreeNode("Node", 3);
        TreeNode node2 = factory.getTreeNode("Node", 9);

        root3 = factory.getTreeNode("Node", 3, node1, node2);
    }

    private void createTree4(){
        TreeNode node1 = factory.getTreeNode("Node", 3);
        TreeNode node2 = factory.getTreeNode("Node", 9);

        root4 = factory.getTreeNode("Node", 9, node1, node2);
    }

    @Test
    public void isBSTWithRangeTest(){
        Assert.assertTrue(solution.isBSTWithRange(root1));
        Assert.assertFalse(solution.isBSTWithRange(root2));
        Assert.assertTrue(solution.isBSTWithRange(root3));
        Assert.assertFalse(solution.isBSTWithRange(root4));
    }

    @Test
    public void isBSTWithListTest(){
        Assert.assertTrue(solution.isBSTWithList(root1));
        Assert.assertFalse(solution.isBSTWithList(root2));
    }

    @Test
    public void isBSTRememberingValueTest(){
        Assert.assertTrue(solution.isBSTRememberingValue(root1));
        Assert.assertFalse(solution.isBSTRememberingValue(root2));
    }
}
