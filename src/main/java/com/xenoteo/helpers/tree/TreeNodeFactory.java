package com.xenoteo.helpers.tree;

import com.xenoteo.chapter4_trees_and_graphs.question4_4_check_balanced.NodeWithHeights;
import com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node.bst_base.BSTNode;
import com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node.NodeWithSize;

/**
 * The class generating a tree node of provided type using one of two available constructors.
 */
public class TreeNodeFactory {

    public TreeNode getTreeNode(String type, int val){
        if (type.equalsIgnoreCase("NODE"))
            return new Node(val);
        if (type.equalsIgnoreCase("NODEWITHHEIGHTS"))
            return new NodeWithHeights(val);
        if (type.equalsIgnoreCase("NODEWITHPARENTS"))
            return new NodeWithParents(val);
        if (type.equalsIgnoreCase("NODEWITHSIZE"))
            return new NodeWithSize(val);
        if (type.equalsIgnoreCase("BSTNODE"))
            return new BSTNode(val);
        return null;
    }

    public TreeNode getTreeNode(String type, int val, TreeNode left, TreeNode right){
        if (type.equalsIgnoreCase("NODE"))
            return new Node(val, left, right);
        if (type.equalsIgnoreCase("NODEWITHHEIGHTS"))
            return new NodeWithHeights(val, left, right);
        if (type.equalsIgnoreCase("NODEWITHPARENTS"))
            return new NodeWithParents(val, (NodeWithParents)left, (NodeWithParents)right);
        return null;
    }
}
