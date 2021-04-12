package com.xenoteo.chapter4_treesAndGraphs.routeBetweenNodes;

import com.xenoteo.helpers.graph.Graph;
import com.xenoteo.helpers.graph.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final Graph graph1;
    private final Graph graph2;
    private final Graph graph3;
    private final Solution solution;

    public SolutionTest(){
        graph1 = new Graph();
        graph2 = new Graph();
        graph3 = new Graph();
        solution = new Solution();
        createGraphs();
    }

    private void createGraphs(){
        createGraph1();
        createGraph2();
        createGraph3();
    }

    private void createGraph1(){
        Node v1_1 = new Node();
        Node v2_1 = new Node();
        Node v3_1 = new Node();
        Node v4_1 = new Node();
        Node v5_1 = new Node();
        Node v6_1 = new Node();

        v1_1.children = new Node[]{v2_1, v3_1, v4_1};
        v2_1.children = new Node[]{v5_1, v6_1};
        v3_1.children = new Node[]{v4_1};
        v4_1.children = new Node[]{v1_1, v6_1};
        v6_1.children = new Node[]{v2_1, v5_1};

        graph1.nodes = new Node[]{v1_1, v2_1, v3_1, v4_1, v5_1, v6_1};
    }

    private void createGraph2(){
        Node v1_2 = new Node();
        Node v2_2 = new Node();
        Node v3_2 = new Node();
        Node v4_2 = new Node();

        v1_2.children = new Node[]{v2_2};
        v2_2.children = new Node[]{v3_2};
        v3_2.children = new Node[]{v4_2};
        v4_2.children = new Node[]{v1_2};

        graph2.nodes = new Node[]{v1_2, v2_2, v3_2, v4_2};
    }

    private void createGraph3(){
        Node v1_3 = new Node();
        Node v2_3 = new Node();
        Node v3_3 = new Node();

        v1_3.children = new Node[]{v2_3};

        graph3.nodes = new Node[]{v1_3, v2_3, v3_3};
    }

    @Test
    public void routeExistsGraph1DfsTest(){
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[0], graph1.nodes[3]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[0], graph1.nodes[5]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[0], graph1.nodes[4]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[2], graph1.nodes[5]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[1], graph1.nodes[4]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[3], graph1.nodes[1]));
        Assert.assertTrue(solution.routExistsDfs(graph1, graph1.nodes[3], graph1.nodes[2]));
        Assert.assertFalse(solution.routExistsDfs(graph1, graph1.nodes[4], graph1.nodes[5]));
        Assert.assertFalse(solution.routExistsDfs(graph1, graph1.nodes[4], graph1.nodes[5]));
        Assert.assertFalse(solution.routExistsDfs(graph1, graph1.nodes[4], graph1.nodes[0]));
        Assert.assertFalse(solution.routExistsDfs(graph1, graph1.nodes[1], graph1.nodes[2]));
    }

    @Test
    public void routeExistsGraph2DfsTest() {
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[0], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[0], graph2.nodes[2]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[0], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[1], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[1], graph2.nodes[2]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[1], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[2], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[2], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[2], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[3], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[3], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsDfs(graph2, graph2.nodes[3], graph2.nodes[2]));
    }

    @Test
    public void routeExistsGraph3DfsTest() {
        Assert.assertTrue(solution.routExistsDfs(graph3, graph3.nodes[0], graph3.nodes[1]));
        Assert.assertFalse(solution.routExistsDfs(graph3, graph3.nodes[0], graph3.nodes[2]));
        Assert.assertFalse(solution.routExistsDfs(graph3, graph3.nodes[1], graph3.nodes[2]));
        Assert.assertFalse(solution.routExistsDfs(graph3, graph3.nodes[1], graph3.nodes[0]));
        Assert.assertFalse(solution.routExistsDfs(graph3, graph3.nodes[2], graph3.nodes[0]));
        Assert.assertFalse(solution.routExistsDfs(graph3, graph3.nodes[2], graph3.nodes[1]));
    }

    @Test
    public void routeExistsGraph1BfsTest(){
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[0], graph1.nodes[3]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[0], graph1.nodes[5]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[0], graph1.nodes[4]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[2], graph1.nodes[5]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[1], graph1.nodes[4]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[3], graph1.nodes[1]));
        Assert.assertTrue(solution.routExistsBfs(graph1, graph1.nodes[3], graph1.nodes[2]));
        Assert.assertFalse(solution.routExistsBfs(graph1, graph1.nodes[4], graph1.nodes[5]));
        Assert.assertFalse(solution.routExistsBfs(graph1, graph1.nodes[4], graph1.nodes[5]));
        Assert.assertFalse(solution.routExistsBfs(graph1, graph1.nodes[4], graph1.nodes[0]));
        Assert.assertFalse(solution.routExistsBfs(graph1, graph1.nodes[1], graph1.nodes[2]));
    }

    @Test
    public void routeExistsGraph2BfsTest() {
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[0], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[0], graph2.nodes[2]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[0], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[1], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[1], graph2.nodes[2]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[1], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[2], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[2], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[2], graph2.nodes[3]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[3], graph2.nodes[0]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[3], graph2.nodes[1]));
        Assert.assertTrue(solution.routExistsBfs(graph2, graph2.nodes[3], graph2.nodes[2]));
    }

    @Test
    public void routeExistsGraph3BfsTest() {
        Assert.assertTrue(solution.routExistsBfs(graph3, graph3.nodes[0], graph3.nodes[1]));
        Assert.assertFalse(solution.routExistsBfs(graph3, graph3.nodes[0], graph3.nodes[2]));
        Assert.assertFalse(solution.routExistsBfs(graph3, graph3.nodes[1], graph3.nodes[2]));
        Assert.assertFalse(solution.routExistsBfs(graph3, graph3.nodes[1], graph3.nodes[0]));
        Assert.assertFalse(solution.routExistsBfs(graph3, graph3.nodes[2], graph3.nodes[0]));
        Assert.assertFalse(solution.routExistsBfs(graph3, graph3.nodes[2], graph3.nodes[1]));
    }
}
