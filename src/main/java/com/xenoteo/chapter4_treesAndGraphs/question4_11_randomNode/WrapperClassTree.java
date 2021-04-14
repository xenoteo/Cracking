package com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase.*;

import java.util.Random;

/**
 * The wrapper tree class for a BST implementing insert(), find(), delete() and getRandomNode() methods.
 *
 * Keeping the reference to the current root and the size of the current tree.
 *
 * Finding random node using the size of the current tree and successor() method.
 */
public class WrapperClassTree implements ITree, ITreeWithRandom {
    /**
     * The current root.
     */
    private IBSTNode root;
    /**
     * The size of the current tree.
     */
    private int size = 0;

    public WrapperClassTree(){

    }

    public WrapperClassTree(IBSTNode root) {
        this.root = root;
        size = 1;
    }

    @Override
    public void insert(int val) {
        if (find(val) != null)
            return;
        if (root == null)
            root = new BSTNode(val);
        else
            root.insert(val);
        size++;
    }

    @Override
    public TreeNode find(int val) {
        if (root == null)
            return null;
        return root.find(val);
    }

    @Override
    public DeleteResult delete(int val) {
        DeleteResult result = new DeleteResult();
        result.root = root;
        if (root != null) {
            result = root.delete(val);
            if (result.deleted)
                size--;
            root = result.root;
        }
        else
            result.deleted = false;
        return result;
    }

    /**
     * Returns the min element of the current tree.
     *
     * @return the min element of the current tree
     */
    private TreeNode min(){
        if (root == null)
            return null;
        TreeNode node = root;
        while (node.left != null)
            node = node.left;
        return node;
    }

    @Override
    public TreeNode getRandomNode() {
        if (root == null)
            return null;
        int k = new Random().nextInt(size);
        TreeNode node = min();
        root.initializeParents();
        for (int i = 0; i < k; i++){
            node = ((IBSTNode)node).successor();
        }
        return node;
    }
}
