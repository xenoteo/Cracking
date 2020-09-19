package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.List;

/**
 * Node representing the vertex of a graph.
 */
public class Node {
    /**
     * "Children" of the node, or projects dependent on the current project.
     */
    public List<Node> outComing;

    /**
     * Number of incoming edges, or number of projects the current project depends on.
     */
    public int inComing;

    /**
     * State of the node used for DFS.
     */
    public State state = State.UNVISITED;

    /**
     * Optional name of the node.
     */
    public String name;

    public Node(){}

    public Node(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
