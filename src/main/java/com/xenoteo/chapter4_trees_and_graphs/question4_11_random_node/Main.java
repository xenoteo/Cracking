package com.xenoteo.chapter4_trees_and_graphs.question4_11_random_node;

public class Main {

    /**
     * Demonstration of the work of delete(), insert() and getRandomNode() methods
     * (and indirectly find() method too, as it is used in both delete() in insert() methods)
     * of two versions of the solution.
     *
     * @param args  the args of main
     */
    public static void main(String[] args) {
        System.out.println("NodeWithSize");
        NodeWithSize root = new NodeWithSize(5);
        root.insert(3);
        root.insert(6);

        System.out.println("""
                IBSTNode root = new NodeWithSize(5);
                root.insert(3);
                root.insert(6);
                """);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);

        root = (NodeWithSize) root.delete(5).root;
        System.out.println("root = (NodeWithSize) root.delete(5).root;");
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);

        root = (NodeWithSize) root.delete(3).root;
        System.out.println("root = (NodeWithSize) root.delete(3).root;");
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);

        root.insert(7);
        root.insert(1);
        System.out.println("""
                        root.insert(7);
                        root.insert(1);
                        """);

        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);
        System.out.printf("root.getRandomNode().val = %d\n", root.getRandomNode().val);



        System.out.println("\n\nWrapperClassTree");
        WrapperClassTree tree = new WrapperClassTree();
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        System.out.println("""
                WrapperClassTree tree = new WrapperClassTree();
                tree.insert(5);
                tree.insert(4);
                tree.insert(3);
                """);

        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);

        tree.delete(5);
        tree.delete(4);
        System.out.println("""
                tree.delete(5);
                tree.delete(4);
                """);

        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);

        tree.insert(9);
        tree.insert(8);
        System.out.println("""
                tree.insert(9);
                tree.insert(8);
                """);

        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
        System.out.printf("tree.getRandomNode().val = %d\n", tree.getRandomNode().val);
    }
}