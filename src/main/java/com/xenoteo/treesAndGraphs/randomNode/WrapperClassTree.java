package com.xenoteo.treesAndGraphs.randomNode;

import com.xenoteo.helpers.tree.TreeNode;
import com.xenoteo.treesAndGraphs.randomNode.ITree;
import com.xenoteo.treesAndGraphs.randomNode.ITreeWithRandom;
import com.xenoteo.treesAndGraphs.randomNode.Node;

import java.util.Random;

public class WrapperClassTree implements ITree, ITreeWithRandom {
    private Node root;
    private int size = 0;

    public WrapperClassTree(){

    }

    public WrapperClassTree(Node root) {
        this.root = root;
        size = 1;
    }

    @Override
    public void insert(int val) {
        if (root == null)
            root = new Node(val);
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
    public boolean delete(int val) {
        if (root != null) {
            boolean deleted = root.delete(val);
            if (deleted)
                size--;
            return deleted;
        }
        return false;
    }

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
        for (int i = 0; i < k; i++){
            node = ((Node)node).successor();
        }
        return node;
    }
}
