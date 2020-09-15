package com.xenoteo.helpers.tree;

/**
 * Simple tree class.
 */
public class Tree {
    public Node root;

    public Tree(){}

    public Tree(Node root){
        this.root = root;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Tree) && !(obj instanceof Node)) return false;
        if (obj instanceof Node) return treesEqual(root, (Node)obj);
        return treesEqual(root, ((Tree) obj).root);
    }

    /**
     * Recursive comparing of two trees.
     * Complexity is O(N).
     * @param root1 is a root of the first tree
     * @param root2 is a root of the second tree
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
     * Counting the depth of the tree.
     * Complexity is O(N).
     * @return the depth of the three.
     */
    public int depth(){
        return countDepth(root, 1, 0);
    }

    /**
     * Recursive counting of the tree depth.
     * @param root to start counting from
     * @param d is a current depth
     * @param max is a current maximum depth
     * @return maximum depth
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