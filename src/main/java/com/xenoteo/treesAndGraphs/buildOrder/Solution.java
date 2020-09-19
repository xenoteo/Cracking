package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.LinkedList;
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
     * Constructing a graph having its vertexes (nodes) and edges (dependencies).
     * @param nodes of a graph
     * @param dependencies between nodes
     */
    private void constructGraph(List<Node> nodes, List<List<Node>> dependencies){
        for (Node node : nodes){
            node.outComing = new LinkedList<>();
        }

        for (List<Node> pair : dependencies){
            pair.get(0).outComing.add(pair.get(1));
            pair.get(1).inComing++;
        }
    }

    /**
     * Finding the valid build order by deleting nodes without any incoming edges.
     * Complexity is O(V + E),
     * where V is the number of nodes (projects) and E is the number of dependencies.
     * @param nodes representing projects
     * @param dependencies between projects
     * @return valid build order (or error if not exists)
     */
    public List<Node> buildOrder(List<Node> nodes, List<List<Node>> dependencies){
        constructGraph(nodes, dependencies);
        List<Node> order = new LinkedList<>();
        while (!nodes.isEmpty()){
            boolean deleted = false;
            for (Node node : nodes){
                if (node.inComing == 0){
                    deleted = true;
                    order.add(node);
                    nodes.remove(node);
                    for (Node v : node.outComing){
                        v.inComing--;
                    }
                    break;
                }
            }
            if (!deleted)
                throw new NoValidBuildOrderError();
        }
        return order;
    }

    /**
     * Finding the valid build order starting from the end using DFS and a stack.
     * Complexity is O(V + E),
     * where V is the number of nodes (projects) and E is the number of dependencies.
     * @param nodes representing projects
     * @param dependencies between projects
     * @return valid build order (or error if not exists)
     */
    public List<Node> buildOrderDFS(List<Node> nodes, List<List<Node>> dependencies){
        constructGraph(nodes, dependencies);
        Stack<Node> stack = fillStack(nodes);
        if (stack == null)
            throw new NoValidBuildOrderError();
        LinkedList<Node> order = new LinkedList<>();
        while (!stack.isEmpty()){
            order.add(stack.pop());
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
