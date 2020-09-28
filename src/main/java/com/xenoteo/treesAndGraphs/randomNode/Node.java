package com.xenoteo.treesAndGraphs.randomNode;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.HashMap;

public class Node extends TreeNode implements ITree{
    private HashMap<TreeNode, TreeNode> parents;

    public Node(int val) {
        super(val);
    }

    public Node(int val, TreeNode left, TreeNode right) {
        super(val, left, right);
    }

    @Override
    public void insert(int val) {
        if (val <= this.val){
            if (left == null)
                left = new Node(val);
            else
                ((Node)left).insert(val);
        }
        else {
            if (right == null)
                right = new Node(val);
            else
                ((Node)right).insert(val);
        }
    }

    @Override
    public TreeNode find(int val) {
        if (val == this.val)
            return this;
        if (val < this.val)
            if (left == null)
                return null;
            else
                return ((Node)left).find(val);
        else
            if (right == null)
                return null;
            else
                return ((Node)right).find(val);
    }

    @Override
    public boolean delete(int val) {
        TreeNode toDelete = find(val);
        if (toDelete == null) return false;
        parents = new HashMap<>();
        fillParents(null, this);
        TreeNode parent = parents.get(toDelete);

        if (toDelete.left == null){
            setChild(parent, toDelete, toDelete.right);
        }
        else if (toDelete.right == null){
            setChild(parent, toDelete, toDelete.left);
        }
        else {
            TreeNode successor = ((Node)toDelete).successor();
            toDelete.val = successor.val;
            TreeNode successorParent = parents.get(successor);
            setChild(successorParent, successor, null);
        }
        return true;
    }

    private void setChild(TreeNode parent, TreeNode oldChild, TreeNode newChild){
        if (parent.right == oldChild)
            parent.right = newChild;
        else
            parent.left = newChild;
    }

    private void fillParents(TreeNode parent, TreeNode child){
        if (child == null)
            return;
        parents.put(child, parent);
        fillParents(child, child.left);
        fillParents(child, child.right);
    }

    public TreeNode successor(){
        if (right != null){
            TreeNode successor = right;
            while (successor.left != null)
                successor = successor.left;
            return successor;
        }
        else {
            TreeNode node = this;
            TreeNode parent = parents.get(node);
            while (parent != null && parent.right == node){
                node = parent;
                parent = parents.get(node);
            }
            return parent;
        }
    }
}