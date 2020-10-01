package com.xenoteo.treesAndGraphs.randomNode.BSTBase;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.helpers.tree.TreeNodeFactory;

import java.util.HashMap;

/**
 * Abstract class of a BST node to inherit from.
 */
public abstract class IBSTNode extends TreeNode implements ITree{
    /**
     * Factory for inserting new nodes of appropriate type.
     */
    private final TreeNodeFactory factory;
    /**
     * Hash map for keeping links to parents of nodes (needed for finding successors).
     */
    private static HashMap<TreeNode, TreeNode> parents;

    public IBSTNode(int val) {
        super(val);
        factory = new TreeNodeFactory();
    }

    /**
     * Returning type of instance to create.
     * @return type of a "current" class
     */
    protected abstract String type();

    @Override
    public void insert(int val) {
        if (find(val) != null) return;
        if (val <= this.val){
            if (left == null)
                left = factory.getTreeNode(type(), val);
            else
                ((IBSTNode) left).insert(val);
        }
        else {
            if (right == null)
                right = factory.getTreeNode(type(), val);
            else
                ((IBSTNode) right).insert(val);
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
                return ((IBSTNode)left).find(val);
        else
            if (right == null)
                return null;
            else
                return ((IBSTNode)right).find(val);
    }

    @Override
    public DeleteResult delete(int val) {
        DeleteResult result = new DeleteResult();
        result.root = this;
        TreeNode toDelete = find(val);
        if (toDelete == null){
            result.deleted = false;
            return result;
        }

        initializeParents();

        TreeNode parent = parents.get(toDelete);
        if (toDelete.left == null){
            setChild(parent, toDelete, toDelete.right, result);
        }
        else if (toDelete.right == null){
            setChild(parent, toDelete, toDelete.left, result);
        }
        else {
            TreeNode successor = ((IBSTNode)toDelete).successor();
            toDelete.val = successor.val;
            TreeNode successorParent = parents.get(successor);
            setChild(successorParent, successor, null, result);
        }
        return result;
    }

    /**
     * Setting a new child to a parent.
     * If parent is null then the root of a tree should be changed.
     * @param parent to set a new child
     * @param oldChild to check whether left of right child is being changed
     * @param newChild to set
     * @param result to overwrite the root if necessary
     */
    private void setChild(TreeNode parent, TreeNode oldChild, TreeNode newChild, DeleteResult result){
        if (parent == null) {
            result.root = (IBSTNode) newChild;
            return;
        }
        if (parent.right == oldChild)
            parent.right = newChild;
        else
            parent.left = newChild;
    }

    /**
     * Initializing and filling the map with nodes parents.
     */
    public void initializeParents(){
        parents = new HashMap<>();
        fillParents(null, this);
    }

    /**
     * Recursive filling of parents map.
     * @param parent of a node
     * @param child to set parent
     */
    private void fillParents(TreeNode parent, TreeNode child){
        if (child == null)
            return;
        parents.put(child, parent);
        fillParents(child, child.left);
        fillParents(child, child.right);
    }

    /**
     * Finding a successor of the current node.
     * @return successor of the node
     */
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