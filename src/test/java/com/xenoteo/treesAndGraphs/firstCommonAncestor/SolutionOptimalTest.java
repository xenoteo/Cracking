package com.xenoteo.treesAndGraphs.firstCommonAncestor;

public class SolutionOptimalTest extends ISolutionTest{
    @Override
    protected String getType() {
        return "Node";
    }

    @Override
    protected ISolution getSolution() {
        return new SolutionOptimal();
    }
}
