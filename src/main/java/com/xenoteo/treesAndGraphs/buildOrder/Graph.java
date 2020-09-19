package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.List;

/**
 * Graph representing all projects and dependencies.
 */
public class Graph {
    public List<Node> nodes;
    List<List<Node>> dependencies;
}
