package com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode;

import com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase.DeleteResult;
import com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase.IBSTNode;
import com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase.ITree;
import com.xenoteo.chapter4_treesAndGraphs.question4_11_randomNode.BSTBase.ITreeWithRandom;

import java.util.Random;

/**
 * The BST node implementing insert(), find(), delete() and getRandomNode() methods.
 *
 * Using additional field size representing the size of a current subtree.
 *
 * Finding random node using the size of the current tree and the size of the left subtree.
 */
public class NodeWithSize extends IBSTNode implements ITree, ITreeWithRandom {
    /**
     * The size of the current tree.
     */
    public int size;

    public NodeWithSize(int val) {
        super(val);
        size = 1;
    }

    @Override
    protected String type() {
        return "NodeWithSize";
    }

    @Override
    public NodeWithSize getRandomNode() {
        int k = new Random().nextInt(size);
        int leftSize = left == null ? 0 : ((NodeWithSize) left).size;
        if (k < leftSize)
            return ((NodeWithSize) left).getRandomNode();
        else if (k == leftSize)
            return this;
        else
            return ((NodeWithSize) right).getRandomNode();
    }

    @Override
    public void insert(int val) {
        super.insert(val);
        size++;
    }

    @Override
    public DeleteResult delete(int val) {
        DeleteResult result = super.delete(val);
        if (result.deleted)
            size--;
        return result;
    }
}