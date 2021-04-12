package com.xenoteo.chapter4_treesAndGraphs.checkBalanced;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private TreeNode root1;
    private TreeNode root2;
    private TreeNode root3;
    private TreeNode root4;
    private TreeNode root5;

    private final TreeNodeFactory factory;
    private final Solution solution;

    public SolutionTest(){
        factory = new TreeNodeFactory();
        solution = new Solution();
    }

    private void createTrees(String type){
        createTree1(type);
        createTree2(type);
        createTree3(type);
        createTree4(type);
        createTree5(type);
    }

    private void createTree1(String type){
        TreeNode node1 = factory.getTreeNode(type, 7);
        TreeNode node2 = factory.getTreeNode(type, 4, node1, null);
        TreeNode node3 = factory.getTreeNode(type, 5);
        TreeNode node4 = factory.getTreeNode(type, 2, node2, node3);

        TreeNode node5 = factory.getTreeNode(type, 8);
        TreeNode node6 = factory.getTreeNode(type, 3, null, node5);

        root1 = factory.getTreeNode(type, 1, node4, node6);
    }

    private void createTree2(String type){
        TreeNode node1 = factory.getTreeNode(type, 7);
        TreeNode node2 = factory.getTreeNode(type, 4, node1, null);
        TreeNode node3 = factory.getTreeNode(type, 5);
        TreeNode node4 = factory.getTreeNode(type, 2, node2, node3);

        TreeNode node6 = factory.getTreeNode(type, 3);

        root2 = factory.getTreeNode(type, 1, node4, node6);
    }

    private void createTree3(String type){
        root3 = factory.getTreeNode(type, 7);
    }

    private void createTree4(String type){
        TreeNode node1 = factory.getTreeNode(type, 4);
        TreeNode node2 = factory.getTreeNode(type, 5);
        root4 = factory.getTreeNode(type, 1, node1, node2);
    }

    private void createTree5(String type){
        TreeNode node1 = factory.getTreeNode(type, 4);
        TreeNode node2 = factory.getTreeNode(type, 5, null, node1);
        root5 = factory.getTreeNode(type, 1, node2, null);
    }

    @Test
    public void isBalancedBruteForceTest(){
        createTrees("Node");
        Assert.assertTrue(solution.isBalancedBruteForce((Node)root1));
        Assert.assertFalse(solution.isBalancedBruteForce((Node)root2));
        Assert.assertTrue(solution.isBalancedBruteForce((Node)root3));
        Assert.assertTrue(solution.isBalancedBruteForce((Node)root4));
        Assert.assertFalse(solution.isBalancedBruteForce((Node)root5));
    }

    @Test
    public void isBalancedWithHeightsTest(){
        createTrees("NodeWithHeights");
        Assert.assertTrue(solution.isBalancedWithHeights((NodeWithHeights)root1));
        Assert.assertFalse(solution.isBalancedWithHeights((NodeWithHeights)root2));
        Assert.assertTrue(solution.isBalancedWithHeights((NodeWithHeights)root3));
        Assert.assertTrue(solution.isBalancedWithHeights((NodeWithHeights)root4));
        Assert.assertFalse(solution.isBalancedWithHeights((NodeWithHeights)root5));
    }

    @Test
    public void isBalancedWithResultClassTest(){
        createTrees("Node");
        Assert.assertTrue(solution.isBalancedWithResultClass((Node)root1));
        Assert.assertFalse(solution.isBalancedWithResultClass((Node)root2));
        Assert.assertTrue(solution.isBalancedWithResultClass((Node)root3));
        Assert.assertTrue(solution.isBalancedWithResultClass((Node)root4));
        Assert.assertFalse(solution.isBalancedWithResultClass((Node)root5));
    }

    @Test
    public void isBalancedTest(){
        createTrees("Node");
        Assert.assertTrue(solution.isBalanced((Node)root1));
        Assert.assertFalse(solution.isBalanced((Node)root2));
        Assert.assertTrue(solution.isBalanced((Node)root3));
        Assert.assertTrue(solution.isBalanced((Node)root4));
        Assert.assertFalse(solution.isBalanced((Node)root5));
    }

}
