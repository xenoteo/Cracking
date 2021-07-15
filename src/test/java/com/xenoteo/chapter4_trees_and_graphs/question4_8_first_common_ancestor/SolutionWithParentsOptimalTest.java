package com.xenoteo.chapter4_trees_and_graphs.question4_8_first_common_ancestor;

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
