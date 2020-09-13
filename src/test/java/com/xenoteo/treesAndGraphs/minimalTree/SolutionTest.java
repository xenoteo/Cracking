package com.xenoteo.treesAndGraphs.minimalTree;

import com.xenoteo.helpers.tree.Node;
import com.xenoteo.helpers.tree.Tree;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private int[] arr1;
    private int[] arr2;
    private int[] arr3;
    private Node root1;
    private Node root2;
    private Node root3;

    /**
     * Creating arrays and hand filling of the trees.
     */
    public SolutionTest(){
        createTree1();
        createTree2();
        createTree3();
    }

    private void createTree1(){
        arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        Node node8 = new Node(9);
        Node node7 = new Node(8, null, node8);
        Node node6 = new Node(6);
        Node node5 = new Node(7, node6, node7);

        Node node4 = new Node(1);
        Node node3 = new Node(4);
        Node node2 = new Node(3, null, node3);
        Node node1 = new Node(2, node4, node2);
        root1 = new Node(5, node1, node5);
    }

    private void createTree2(){
        arr2 = new int[]{2, 4, 6, 8};

        Node node3 = new Node(8);
        Node node2 = new Node(6, null, node3);
        Node node1 = new Node(2);
        root2 = new Node(4, node1, node2);
    }

    private void createTree3(){
        arr3 = new int[]{1, 2};

        Node node = new Node(2);
        root3 = new Node(1, null, node);
    }

    @Test
    public void makeTreeTest(){
        Solution solution = new Solution();
        Assert.assertEquals(new Tree(root1), solution.makeTree(arr1));
        Assert.assertEquals(new Tree(root2), solution.makeTree(arr2));
        Assert.assertEquals(new Tree(root3), solution.makeTree(arr3));
    }
}
