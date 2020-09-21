package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Node root;
    private Node node1;
    private Node node2;
    private Node node3;
    private Node node4;
    private Node node5;
    private Node node6;
    private Node node7;
    private Node node8;

    public SolutionTest(){
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

    @Test
    public void firstCommonAncestorTest(){
        Solution solution = new Solution();
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node2, node1));
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node2, node3));
        Assert.assertEquals(node4, solution.firstCommonAncestor(root, node4, node3));
        Assert.assertEquals(root, solution.firstCommonAncestor(root, node1, node6));
        Assert.assertEquals(root, solution.firstCommonAncestor(root, node4, node7));
        Assert.assertEquals(node7, solution.firstCommonAncestor(root, node5, node6));
        Assert.assertNull(solution.firstCommonAncestor(root, node5, node8));
    }
}
