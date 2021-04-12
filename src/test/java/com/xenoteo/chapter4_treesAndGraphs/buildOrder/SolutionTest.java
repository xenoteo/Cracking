package com.xenoteo.chapter4_treesAndGraphs.buildOrder;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private String[] nodes1;
    private String[][] dependencies1;
    private String[] order1_1;
    private String[] order1_2;

    private String[] nodes2;
    private String[][] dependencies2;

    private final Solution solution;

    public SolutionTest(){
        solution = new Solution();
        constructGraph1();
        constructGraph2();
    }

    private void constructGraph1(){
        nodes1 = new String[]{"a", "b", "c", "d", "e", "f"};
        dependencies1 = new String[][]{
            {"a", "d"},
            {"f", "b"},
            {"b", "d"},
            {"f", "a"},
            {"d", "c"}
        };
        order1_1 = new String[]{"e", "f", "a", "b", "d", "c"};
        order1_2 = new String[]{"f", "e", "b", "a", "d", "c"};
    }

    private void constructGraph2(){
        nodes2 = new String[]{"a", "b", "c"};
        dependencies2 = new String[][]{
                {"a", "b"},
                {"b", "c"},
                {"c", "a"}
        };
    }

    @Test(expected = NoValidBuildOrderError.class)
    public void buildOrderTest(){
        Assert.assertEquals(order1_1, solution.buildOrder(nodes1, dependencies1));
        solution.buildOrder(nodes2, dependencies2);
    }

    @Test(expected = NoValidBuildOrderError.class)
    public void buildOrderDFSTest(){
        Assert.assertEquals(order1_2, solution.buildOrderDFS(nodes1, dependencies1));
        solution.buildOrderDFS(nodes2, dependencies2);
    }
}

