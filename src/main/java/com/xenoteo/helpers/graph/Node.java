package com.xenoteo.helpers.graph;

/**
 * The class representing a graph vertex.
 */
public class Node {
    /**
     * The vertex name.
     */
    public String name;

    /**
     * The array of vertex's neighbours.
     */
    public Node[] children;

    /**
     * Whether the vertex is visited or not.
     */
    public boolean visited;
}
