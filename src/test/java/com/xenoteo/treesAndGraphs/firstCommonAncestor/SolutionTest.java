package com.xenoteo.treesAndGraphs.firstCommonAncestor;

public class SolutionTest extends ISolutionTest{
    @Override
    protected String getType() {
        return "Node";
    }

    @Override
    protected ISolution getSolution() {
        return new Solution();
    }
}
