package com.xenoteo.chapter4_treesAndGraphs.question4_8_firstCommonAncestor;

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
