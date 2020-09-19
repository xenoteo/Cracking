package com.xenoteo.treesAndGraphs.buildOrder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionTest {
    private List<Node> nodes1;
    private List<List<Node>> dependencies1;
    private List<Node> order1_1;
    private List<Node> order1_2;

    private List<Node> nodes2;
    private List<List<Node>> dependencies2;

    public SolutionTest(){
        constructGraph1();
        constructGraph2();
    }

    private void constructGraph1(){
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();
        nodes1 = new LinkedList<>();
        nodes1.add(a);
        nodes1.add(b);
        nodes1.add(c);
        nodes1.add(d);
        nodes1.add(e);
        nodes1.add(f);

        dependencies1 = new LinkedList<>();
        List<Node> edge1 = new ArrayList<>();
        edge1.add(a);
        edge1.add(d);
        List<Node> edge2 = new ArrayList<>();
        edge2.add(f);
        edge2.add(b);
        List<Node> edge3 = new ArrayList<>();
        edge3.add(b);
        edge3.add(d);
        List<Node> edge4 = new ArrayList<>();
        edge4.add(f);
        edge4.add(a);
        List<Node> edge5 = new ArrayList<>();
        edge5.add(d);
        edge5.add(c);
        dependencies1.add(edge1);
        dependencies1.add(edge2);
        dependencies1.add(edge3);
        dependencies1.add(edge4);
        dependencies1.add(edge5);

        order1_1 = new LinkedList<>();
        order1_1.add(e);
        order1_1.add(f);
        order1_1.add(a);
        order1_1.add(b);
        order1_1.add(d);
        order1_1.add(c);

        order1_2 = new LinkedList<>();
        order1_2.add(f);
        order1_2.add(e);
        order1_2.add(b);
        order1_2.add(a);
        order1_2.add(d);
        order1_2.add(c);
    }

    private void constructGraph2(){
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        nodes2 = new LinkedList<>();
        nodes2.add(a);
        nodes2.add(b);
        nodes2.add(c);

        dependencies2 = new LinkedList<>();
        List<Node> edge1 = new ArrayList<>();
        edge1.add(a);
        edge1.add(b);
        List<Node> edge2 = new ArrayList<>();
        edge2.add(b);
        edge2.add(c);
        List<Node> edge3 = new ArrayList<>();
        edge3.add(c);
        edge3.add(a);
        dependencies2.add(edge1);
        dependencies2.add(edge2);
        dependencies2.add(edge3);
    }

    @Test(expected = NoValidBuildOrderError.class)
    public void buildOrderTest(){
        Solution solution = new Solution();
        Assert.assertEquals(order1_1, solution.buildOrder(nodes1, dependencies1));
        solution.buildOrder(nodes2, dependencies2);
    }

    @Test(expected = NoValidBuildOrderError.class)
    public void buildOrderDFSTest(){
        Solution solution = new Solution();
        Assert.assertEquals(order1_2, solution.buildOrderDFS(nodes1, dependencies1));
        solution.buildOrderDFS(nodes2, dependencies2);
    }
}

