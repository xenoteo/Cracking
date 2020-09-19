package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.LinkedList;
import java.util.List;

/**
 * Graph representing all projects.
 */
public class Graph {
    public List<Node> nodes;

    /**
     * Constructing a graph having projects and dependencies between them.
     * @param projects to build
     * @param dependencies between projects
     */
    public Graph(String[] projects, String[][] dependencies){
        nodes = new LinkedList<>();
        for (String name : projects){
            Node node = new Node(name);
            node.outComing = new LinkedList<>();
            nodes.add(node);
        }

        for (String[] dependency : dependencies){
            Node main = getNode(dependency[0]);
            Node dependent = getNode(dependency[1]);
            main.outComing.add(dependent);
            dependent.inComing++;
        }
    }

    public Node getNode(String name){
        for (Node node : nodes)
            if (node.name.equals(name))
                return node;
        return null;
    }
}
