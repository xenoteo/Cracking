package com.xenoteo.helpers.tree;

/**
 * Tree node with a reference to parent.
 */
public class NodeWithParents extends TreeNode{
    public NodeWithParents parent;

    public NodeWithParents(int val) {
        super(val);
    }

    public NodeWithParents(int val, NodeWithParents left, NodeWithParents right) {
        super(val, left, right);
        if (left != null ) left.parent = this;
        if (right != null) right.parent = this;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof NodeWithParents)) return false;
        NodeWithParents other = (NodeWithParents)obj;
        return val == other.val && parent == other.parent && left == other.left && right == other.right;
    }
}
