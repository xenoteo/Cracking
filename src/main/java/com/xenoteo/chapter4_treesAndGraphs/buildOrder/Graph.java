package com.xenoteo.chapter4_treesAndGraphs.buildOrder;

import java.util.LinkedList;
import java.util.List;

/**
 * The graph representing all projects.
 */
public class Graph {
    /**
     * The list of graph nodes.
     */
    public List<Node> nodes;

    /**
     * Constructs a graph having projects and dependencies between them.
     *
     * @param projects  projects to build
     * @param dependencies  dependencies between projects
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

    /**
     * Gets the node of the given name.
     *
     * @param name  the node name
     * @return the node of the given name
     */
    public Node getNode(String name){
        for (Node node : nodes)
            if (node.name.equals(name))
                return node;
        return null;
    }
}
