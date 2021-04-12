package com.xenoteo.chapter4_treesAndGraphs.firstCommonAncestor;

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
