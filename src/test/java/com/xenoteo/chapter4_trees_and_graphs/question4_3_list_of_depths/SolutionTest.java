package com.xenoteo.chapter4_trees_and_graphs.question4_3_list_of_depths;

import com.xenoteo.helpers.tree.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class SolutionTest {
    private Node root1;
    private Node root2;
    private Node root3;
    private ArrayList<LinkedList<Node>> lists1;
    private ArrayList<LinkedList<Node>> lists2;
    private ArrayList<LinkedList<Node>> lists3;

    public SolutionTest(){
        createTree1();
        createTree2();
        createTree3();
    }

    private void createTree1(){
        Node node1 = new Node(1);
        Node node2 = new Node(2, node1, null);
        Node node3 = new Node(7, node2, null);
        Node node4 = new Node(9);
        Node node5 = new Node(4, node3, node4);

        Node node6 = new Node(3);
        Node node7 = new Node(4, node6, null);
        Node node8 = new Node(3, null, node7);

        root1 = new Node(1, node5, node8);

        lists1 = new ArrayList<>();

        LinkedList<Node> depth0 = new LinkedList<>();
        LinkedList<Node> depth1 = new LinkedList<>();
        LinkedList<Node> depth2 = new LinkedList<>();
        LinkedList<Node> depth3 = new LinkedList<>();
        LinkedList<Node> depth4 = new LinkedList<>();

        depth0.add(root1);
        depth1.add(node5);
        depth1.add(node8);
        depth2.add(node3);
        depth2.add(node4);
        depth2.add(node7);
        depth3.add(node2);
        depth3.add(node6);
        depth4.add(node1);

        lists1.add(depth0);
        lists1.add(depth1);
        lists1.add(depth2);
        lists1.add(depth3);
        lists1.add(depth4);
    }

    private void createTree2(){
        Node left = new Node(1);
        Node right = new Node(3);
        root2 = new Node(2, left, right);

        lists2 = new ArrayList<>();

        LinkedList<Node> depth0 = new LinkedList<>();
        LinkedList<Node> depth1 = new LinkedList<>();

        depth0.add(root2);
        depth1.add(left);
        depth1.add(right);

        lists2.add(depth0);
        lists2.add(depth1);
    }

    private void createTree3(){
        root3 = new Node(5);

        lists3 = new ArrayList<>();

        LinkedList<Node> depth0 = new LinkedList<>();
        depth0.add(root3);
        lists3.add(depth0);
    }

    @Test
    public void getListOfDepthsDfsTest(){
        Solution solution = new Solution();
        Assert.assertEquals(lists1, solution.getListOfDepthsDfs(root1));
        Assert.assertEquals(lists2, solution.getListOfDepthsDfs(root2));
        Assert.assertEquals(lists3, solution.getListOfDepthsDfs(root3));
    }

    @Test
    public void getListOfDepthsBfsTest(){
        Solution solution = new Solution();
        Assert.assertEquals(lists1, solution.getListOfDepthsBfs(root1));
        Assert.assertEquals(lists2, solution.getListOfDepthsBfs(root2));
        Assert.assertEquals(lists3, solution.getListOfDepthsBfs(root3));
    }

}
