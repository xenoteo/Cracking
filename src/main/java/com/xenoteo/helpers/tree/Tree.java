package com.xenoteo.helpers.tree;

/**
 * A simple tree class.
 */
public class Tree {
    /**
     * The root of the tree.
     */
    public Node root;

    public Tree(Node root){
        this.root = root;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Tree) && !(obj instanceof Node)) return false;
        if (obj instanceof Node) return treesEqual(root, (Node)obj);
        return treesEqual(root, ((Tree) obj).root);
    }

    /**
     * Recursively compares two trees.
     * Complexity is O(N).
     *
     * @param root1  the root of the first tree
     * @param root2  the root of the second tree
     * @return are trees equal
     */
    private boolean treesEqual(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val
                && treesEqual(root1.left, root2.left)
                && treesEqual(root1.right, root2.right);
    }

    /**
     * Counts the depth of the tree.
     * Complexity is O(N).
     *
     * @return the depth of the three.
     */
    public int depth(){
        return countDepth(root, 1, 0);
    }

    /**
     * Recursively counts the tree depth.
     * @param root  the node to start counting from
     * @param d  the current depth
     * @param max  the current maximum depth
     * @return the maximum depth
     */
    private int countDepth(TreeNode root, int d, int max){
        if (root == null) return max;
        if (d > max)
            max = d;
        max = countDepth(root.left, d + 1, max);
        max = countDepth(root.right, d + 1, max);
        return max;
    }
}