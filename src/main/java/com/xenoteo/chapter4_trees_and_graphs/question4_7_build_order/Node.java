package com.xenoteo.chapter4_trees_and_graphs.question4_7_build_order;

import java.util.List;

/**
 * The node representing one vertex of the graph.
 */
public class Node {
    /**
     * The list of node's "children", or the list of projects dependent on the current project.
     */
    public List<Node> outComing;

    /**
     * The number of incoming edges, or the number of projects the current project depends on.
     */
    public int inComing;

    /**
     * The state of the node used for DFS.
     */
    public State state = State.UNVISITED;

    /**
     * The optional name of the node.
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
