package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;
import org.junit.Assert;
import org.junit.Test;

public abstract class ISolutionTest {
    protected TreeNode root;
    protected TreeNode node1;
    protected TreeNode node2;
    protected TreeNode node3;
    protected TreeNode node4;
    protected TreeNode node5;
    protected TreeNode node6;
    protected TreeNode node7;
    protected TreeNode node8;


    public ISolutionTest(){
        String type = getType();
        TreeNodeFactory factory = new TreeNodeFactory();

        node1 = factory.getTreeNode(type, 5);
        node2 = factory.getTreeNode(type, 11);
        node3 = factory.getTreeNode(type, 4, null, node1);
        node4 = factory.getTreeNode(type, 7, node2, node3);

        node5 = factory.getTreeNode(type, 12);
        node6 = factory.getTreeNode(type, 13);
        node7 = factory.getTreeNode(type, 9, node5, node6);

        node8 = factory.getTreeNode(type, 66);

        root = factory.getTreeNode(type, 15, node4, node7);
    }

    protected abstract String getType();

    protected abstract ISolution getSolution();

    @Test
    public void firstCommonAncestorTest(){
        ISolution solution = getSolution();
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node2, node1));
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node2, node3));
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node4, node3));
        Assert.assertEquals(root, solution.firstCommonAncestor(root, node1, node6));
        Assert.assertEquals(root, solution.firstCommonAncestor(root, node4, node7));
        Assert.assertEquals(node7, solution.firstCommonAncestor(root, node5, node6));
        Assert.assertNull(solution.firstCommonAncestor(root, node5, node8));
    }
}
