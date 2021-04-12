package com.xenoteo.chapter4_treesAndGraphs.successor;

import com.xenoteo.helpers.tree.NodeWithParents;
import com.xenoteo.helpers.tree.TreeNodeFactory;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private NodeWithParents root;
    private NodeWithParents node1;
    private NodeWithParents node2;
    private NodeWithParents node3;
    private NodeWithParents node4;
    private NodeWithParents node5;
    private NodeWithParents node6;


    public SolutionTest(){
        createTree();
    }

    private void createTree(){
        TreeNodeFactory factory = new TreeNodeFactory();

        node1 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 2);
        node2 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 6);
        node3 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 5, node1, node2);

        node4 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 9);
        node5 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 13);
        node6 = (NodeWithParents)factory.getTreeNode("NodeWithParents", 11, node4, node5);

        root = (NodeWithParents)factory.getTreeNode("NodeWithParents", 8, node3, node6);
    }

    @Test
    public void successorTest(){
        Solution solution = new Solution();
        Assert.assertEquals(node3, solution.successor(node1));
        Assert.assertEquals(node2, solution.successor(node3));
        Assert.assertEquals(root, solution.successor(node2));
        Assert.assertEquals(node4, solution.successor(root));
        Assert.assertEquals(node5, solution.successor(node6));
        Assert.assertEquals(node6, solution.successor(node4));
        Assert.assertNull(solution.successor(node5));
    }
}
