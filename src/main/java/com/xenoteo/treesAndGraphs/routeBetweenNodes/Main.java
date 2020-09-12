package com.xenoteo.treesAndGraphs.routeBetweenNodes;

import com.xenoteo.helpers.graph.Graph;
import com.xenoteo.helpers.graph.Node;

public class Main {
    public static void main(String[] args) {
        Graph graph = createGraph();
        checkRoutes(graph);
    }

    /**
     * Checking existence of routes between each pair of nodes and printing out the result of these checks.
     * @param graph to check
     */
    private static void checkRoutes(Graph graph){
        Solution solution = new Solution();
        System.out.println("DFS");
        for (int i = 0; i < graph.nodes.length; i++){
            for (int j = 0; j < graph.nodes.length; j++){
                if (i != j)
                    System.out.printf("graph.nodes[%d] -> graph.nodes[%d]: %b\n",
                        i, j, solution.routExistsDfs(graph, graph.nodes[i], graph.nodes[j]));
            }
        }
        System.out.println("BFS");
        for (int i = 0; i < graph.nodes.length; i++){
            for (int j = 0; j < graph.nodes.length; j++){
                if (i != j)
                    System.out.printf("graph.nodes[%d] -> graph.nodes[%d]: %b\n",
                        i, j, solution.routExistsBfs(graph, graph.nodes[i], graph.nodes[j]));
            }
        }
    }

    /**
     * Creating an example graph.
     * @return graph filled with the nodes
     */
    private static Graph createGraph(){
        Graph graph = new Graph();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.children = new Node[]{node2, node3};
        node2.children = new Node[]{node1, node4};
        node4.children = new Node[]{node3};

        graph.nodes = new Node[]{node1, node2, node3, node4};

        System.out.println("Graph graph = new Graph();\n" +
                "\n" +
                "Node node1 = new Node();\n" +
                "Node node2 = new Node();\n" +
                "Node node3 = new Node();\n" +
                "Node node4 = new Node();\n" +
                "\n" +
                "node1.children = new Node[]{node2, node3};\n" +
                "node2.children = new Node[]{node1, node4};\n" +
                "node4.children = new Node[]{node3};\n" +
                "\n" +
                "graph.nodes = new Node[]{node1, node2, node3, node4};\n");

        return graph;
    }
}
