package com.xenoteo.treesAndGraphs.randomNode;

import com.xenoteo.helpers.tree.TreeNode;

public interface ITree {

    void insert(int val);

    TreeNode find(int val);

    boolean delete(int val);

}
