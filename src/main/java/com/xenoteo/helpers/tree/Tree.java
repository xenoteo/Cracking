package com.xenoteo.helpers.tree;

public class Tree {
    public Node root;

    public Tree(){}

    public Tree(Node root){
        this.root = root;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Tree) && !(obj instanceof Node)) return false;
        if (obj instanceof Node) return treesEquals(root, (Node)obj);
        return treesEquals(root, ((Tree) obj).root);
    }

    private boolean treesEquals(Node root1, Node root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return root1.val == root2.val
                && treesEquals(root1.left, root2.left)
                && treesEquals(root1.right, root2.right);
    }

    public int depth(){
        return countDepth(root, 1, 0);
    }

    private int countDepth(Node root, int d, int max){
        if (root == null) return max;
        if (d > max)
            max = d;
        max = countDepth(root.left, d + 1, max);
        max = countDepth(root.right, d + 1, max);
        return max;
    }
}
