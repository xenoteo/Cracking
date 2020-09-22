package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.Node;
import org.junit.Assert;
import org.junit.Test;

public abstract class ISolutionTest {
    protected Node root;
    protected Node node1;
    protected Node node2;
    protected Node node3;
    protected Node node4;
    protected Node node5;
    protected Node node6;
    protected Node node7;
    protected Node node8;

    public ISolutionTest(){
        node1 = new Node(5);
        node2 = new Node(11);
        node3 = new Node(4, null, node1);
        node4 = new Node(7, node2, node3);

        node5 = new Node(12);
        node6 = new Node(13);
        node7 = new Node(9, node5, node6);

        node8 = new Node(66);

        root = new Node(15, node4, node7);
    }

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
