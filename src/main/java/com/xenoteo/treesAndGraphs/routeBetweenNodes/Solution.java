package com.xenoteo.treesAndGraphs.routeBetweenNodes;

import com.xenoteo.helpers.graph.Graph;
import com.xenoteo.helpers.graph.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a directed graph finding out whether there is a route between two nodes.
 */
public class Solution {

    /**
     * Checking if there is a route between two nodes using DFS.
     * @param graph to check
     * @param v1 is the start vertex
     * @param v2 is the end vertex
     * @return if the route exists
     */
    public boolean routExistsDfs(Graph graph, Node v1, Node v2){
        DFS(v1);
        boolean result = v2.visited;
        clearVisits(graph);
        return result;
    }

    /**
     * Implementing DFS.
     * @param root to start from
     */
    private void DFS(Node root){
        if (root == null) {
            return;
        }
        root.visited = true;
        if (root.children == null) return;
        for (Node node : root.children)
            if (!node.visited)
                DFS(node);
    }

    /**
     * Checking if there is a route between two nodes using BFS.
     * @param graph to check
     * @param v1 is the start vertex
     * @param v2 is the end vertex
     * @return if the route exists
     */
    public boolean routExistsBfs(Graph graph, Node v1, Node v2){
        BFS(v1);
        boolean result = v2.visited;
        clearVisits(graph);
        return result;
    }

    /**
     * Implementing BFS.
     * @param s is a source to start from
     */
    private void BFS(Node s){
        Queue<Node> queue = new LinkedList<>();
        s.visited = true;
        queue.add(s);

        while (!queue.isEmpty()){
            Node node = queue.poll();
            node.visited = true;
            if (node.children == null) continue;
            for (Node v : node.children)
                if (!v.visited){
                    v.visited = true;
                    queue.add(v);
                }
        }
    }

    /**
     * Set all nodes visited field to false.
     * @param graph to clear visits
     */
    private void clearVisits(Graph graph){
        for (Node node : graph.nodes)
            node.visited = false;
    }
}
