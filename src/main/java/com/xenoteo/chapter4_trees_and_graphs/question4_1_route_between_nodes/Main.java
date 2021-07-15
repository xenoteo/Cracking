package com.xenoteo.chapter4_trees_and_graphs.question4_1_route_between_nodes;

import com.xenoteo.helpers.graph.Graph;
import com.xenoteo.helpers.graph.Node;

public class Main {
    public static void main(String[] args) {
        Graph graph = createGraph();
        checkRoutes(graph);
    }

    /**
     * Checks an existence of routes between each pair of nodes and prints out the result of these checks.
     *
     * @param graph  the graph to check
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
     * Creates an example graph.
     *
     * @return the graph filled with the nodes
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

        System.out.println("""
                Graph graph = new Graph();

                Node node1 = new Node();
                Node node2 = new Node();
                Node node3 = new Node();
                Node node4 = new Node();

                node1.children = new Node[]{node2, node3};
                node2.children = new Node[]{node1, node4};
                node4.children = new Node[]{node3};

                graph.nodes = new Node[]{node1, node2, node3, node4};
                """);

        return graph;
    }
}
