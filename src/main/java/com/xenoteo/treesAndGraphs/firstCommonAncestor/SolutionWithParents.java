package com.xenoteo.treesAndGraphs.firstCommonAncestor;

import com.xenoteo.helpers.tree.NodeWithParents;
import com.xenoteo.helpers.tree.TreeNode;

/**
 * Finding the first common ancestor using finding an intersection node like in two linked lists.
 * Complexity is O(D), where D is a maximum depth of a tree.
 */
public class SolutionWithParents implements ISolution {

    /**
     * Finding an intersection node.
     * @param root of a tree
     * @param p is the first node
     * @param q is the second node
     * @return first common ancestor
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
     * Finding the depth of a given node.
     * @param node to find depth
     * @return depth of the node
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
     * Finding the node i levels higher than current.
     * @param node to start from
     * @param i level to get upper
     * @return node at required level
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