package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.List;
import java.util.Stack;

/**
 * Given a list of projects and a list of dependencies (which is a list of pairs of projects,
 * where the second project is dependent on the first project). All of a project's dependencies
 * must be built before the project is.
 * Finding a build order that will allow the projects to be built.
 * If there is no valid build order, returning an error.
 */
public class Solution {

    /**
     * Finding the valid build order by deleting nodes without any incoming edges.
     * Complexity is O(V + E),
     * where V is the number of nodes (projects) and E is the number of dependencies.
     * @param projects to build
     * @param dependencies between projects
     * @return valid build order (or error if not exists)
     */
    public String[] buildOrder(String[] projects, String[][] dependencies){
        Graph graph = new Graph(projects, dependencies);
        String[] order = new String[projects.length];
        int k = 0;
        while (!graph.nodes.isEmpty()){
            boolean deleted = false;
            for (Node node : graph.nodes){
                if (node.inComing == 0){
                    deleted = true;
                    order[k++] = node.name;
                    removeProject(node, graph);
                    break;
                }
            }
            if (!deleted)
                throw new NoValidBuildOrderError();
        }
        return order;
    }

    /**
     * Removing a project with all its dependencies.
     * @param node to remove
     * @param graph to remove the node from
     */
    private void removeProject(Node node, Graph graph){
        graph.nodes.remove(node);
        for (Node v : node.outComing){
            v.inComing--;
        }
    }



    /**
     * Finding the valid build order starting from the end using DFS and a stack.
     * Complexity is O(V + E),
     * where V is the number of nodes (projects) and E is the number of dependencies.
     * @param projects representing projects
     * @param dependencies between projects
     * @return valid build order (or error if not exists)
     */
    public String[] buildOrderDFS(String[] projects, String[][] dependencies){
        Graph graph = new Graph(projects, dependencies);
        Stack<Node> stack = fillStack(graph.nodes);
        if (stack == null)
            throw new NoValidBuildOrderError();
        String[] order = new String[projects.length];
        int k = 0;
        while (!stack.isEmpty()){
            order[k++] = stack.pop().name;
        }
        return order;
    }

    /**
     * Filling the stack of nodes with the right reversed order
     * starting DFS from here.
     * @param nodes of a graph
     * @return stack with the nodes in valid reversed order (or null if not exists)
     */
    private Stack<Node> fillStack(List<Node> nodes){
        Stack<Node> stack = new Stack<>();
        boolean orderExists = true;
        for (Node node : nodes){
            if (node.state == State.UNVISITED)
                orderExists = DFS(node, stack);
        }
        if (!orderExists) return null;
        return stack;
    }

    /**
     * DFS with adding visited nodes to a stack.
     * @param node to process
     * @param stack to fill
     * @return true if everything is OK (if there is no cycles)
     */
    private boolean DFS(Node node, Stack<Node> stack){
        node.state = State.VISITING;
        for (Node v : node.outComing){
            if (v.state == State.VISITING)
                return false;
            else if (v.state == State.UNVISITED)
                if (!DFS(v, stack))
                    return false;
        }
        node.state = State.VISITED;
        stack.add(node);
        return true;
    }
}