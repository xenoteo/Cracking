package com.xenoteo.chapter4_treesAndGraphs.firstCommonAncestor;

public class SolutionWithParentsTest extends ISolutionTest {
    @Override
    protected String getType() {
        return "NodeWithParents";
    }

    @Override
    protected ISolution getSolution() {
        return new SolutionWithParents();
    }
}
