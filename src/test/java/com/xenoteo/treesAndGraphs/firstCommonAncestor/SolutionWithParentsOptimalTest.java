package com.xenoteo.treesAndGraphs.firstCommonAncestor;

public class SolutionWithParentsOptimalTest extends ISolutionTest{
    @Override
    protected String getType() {
        return "NodeWithParents";
    }

    @Override
    protected ISolution getSolution() {
        return new SolutionWithParentsOptimal();
    }
}
