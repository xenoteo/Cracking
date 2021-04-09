package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.NodeWithParents;
import com.xenoteo.helpers.tree.TreeNode;

/**
 * The class finding the first common ancestor using finding an intersection node like in two linked lists.
 * Complexity is O(D), where D is a maximum depth of a tree.
 */
public class SolutionWithParents implements ISolution {

    /**
     * Finds an intersection node.
     *
     * @param root  the root of a tree
     * @param p  the first node
     * @param q  the second node
     * @return the first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int depthP = depth(p);
        int depthQ = depth(q);
        NodeWithParents first;
        NodeWithParents second;

        // setting the depth of two nodes equal
        if (depthP > depthQ) {
            first = get(p, depthP - depthQ);
            second = (NodeWithParents) q;
        }
        else {
            first = (NodeWithParents) p;
            second = get(q, depthQ - depthP);
        }

        // finding the first common ancestor
        while (first != null && second != null && first != second){
            first = first.parent;
            second = second.parent;
        }
        return first;
    }

    /**
     * Finds the depth of a given node.
     *
     * @param node  the node to find depth
     * @return the depth of the node
     */
    private int depth(TreeNode node){
        NodeWithParents p = (NodeWithParents) node;
        int d = 0;
        while (p != null){
            d++;
            p = p.parent;
        }
        return d;
    }

    /**
     * Finds the node i levels higher than current.
     *
     * @param node  the node to start from
     * @param i  the level to get upper
     * @return the node at the required level
     */
    private NodeWithParents get(TreeNode node, int i){
        NodeWithParents p = (NodeWithParents) node;
        int k = 0;
        while (k < i && p != null) {
            p = p.parent;
            k++;
        }
        return p;
    }
}