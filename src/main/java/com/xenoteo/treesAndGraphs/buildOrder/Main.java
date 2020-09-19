package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        constructAndPrintBuildOrder();
    }

    /**
     * Constructing a graph and printing a valid build order.
     */
    private static void constructAndPrintBuildOrder(){
        Graph graph = constructGraph();
        System.out.println(new Solution().buildOrder(graph.nodes, graph.dependencies));
    }

    /**
     * Constructing a graph.
     * @return constructed graph
     */
    private static Graph constructGraph(){
        Graph graph = new Graph();
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");
        graph.nodes = new LinkedList<>();
        graph.nodes.add(a);
        graph.nodes.add(b);
        graph.nodes.add(c);
        graph.nodes.add(d);
        graph.nodes.add(e);
        graph.nodes.add(f);
        graph.nodes.add(g);

        graph.dependencies = new LinkedList<>();
        List<Node> edge1 = new ArrayList<>();
        edge1.add(f);
        edge1.add(a);
        List<Node> edge2 = new ArrayList<>();
        edge2.add(f);
        edge2.add(b);
        List<Node> edge3 = new ArrayList<>();
        edge3.add(f);
        edge3.add(c);
        List<Node> edge4 = new ArrayList<>();
        edge4.add(a);
        edge4.add(e);
        List<Node> edge5 = new ArrayList<>();
        edge5.add(b);
        edge5.add(e);
        List<Node> edge6 = new ArrayList<>();
        edge6.add(c);
        edge6.add(a);
        List<Node> edge7 = new ArrayList<>();
        edge7.add(b);
        edge7.add(a);
        List<Node> edge8 = new ArrayList<>();
        edge8.add(d);
        edge8.add(g);
        graph.dependencies.add(edge1);
        graph.dependencies.add(edge2);
        graph.dependencies.add(edge3);
        graph.dependencies.add(edge4);
        graph.dependencies.add(edge5);
        graph.dependencies.add(edge6);
        graph.dependencies.add(edge7);
        graph.dependencies.add(edge8);

        return graph;
    }
}
