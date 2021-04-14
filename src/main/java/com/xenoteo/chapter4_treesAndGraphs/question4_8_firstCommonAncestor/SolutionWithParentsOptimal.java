package com.xenoteo.chapter4_treesAndGraphs.question4_8_firstCommonAncestor;

import com.xenoteo.helpers.tree.NodeWithParents;
import com.xenoteo.helpers.tree.TreeNode;

/**
 * The class finding the first common ancestor checking only unchecked subtree.
 * Complexity is O(S), where S is a size of a subtree before a first common ancestor.
 */
public class SolutionWithParentsOptimal extends DescendantChecker implements ISolution {

    /**
     * Finds the first common ancestor
     * traversing a tree up until the "brother" of current node will be an ancestor of the second node.
     *
     * @param root  the root of a tree
     * @param p  the first node
     * @param q  the second node
     * @return the first common ancestor
     */
    public TreeNode firstCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!descendant(root, p) || !descendant(root, q)) return null;
        if (descendant(p, q)) return p;
        if (descendant(q, p)) return q;

        NodeWithParents brother = getBrother((NodeWithParents) p);
        NodeWithParents parent = ((NodeWithParents) p).parent;
        while (!(descendant(brother, q))){
            brother = getBrother(parent);
            parent = parent.parent;
        }
        return parent;
    }

    /**
     * Gets a brother of a given node.
     *
     * @param node  the node to find a brother
     * @return the brother of the node
     */
    private NodeWithParents getBrother(NodeWithParents node){
        NodeWithParents parent = node.parent;
        if (parent.left == node) return (NodeWithParents) parent.right;
        else return (NodeWithParents) parent.left;
    }
}