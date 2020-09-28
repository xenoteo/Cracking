package com.xenoteo.treesAndGraphs.randomNode;

import com.xenoteo.helpers.tree.TreeNode;

import java.util.Random;

public class NodeWithSize extends Node implements ITreeWithRandom {
    public int size;

    public NodeWithSize(int val) {
        super(val);
        size = 1;
    }

    @Override
    public TreeNode getRandomNode() {
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
    public boolean delete(int val) {
        boolean deleted = super.delete(val);
        if (deleted)
            size--;
        return deleted;
    }
}