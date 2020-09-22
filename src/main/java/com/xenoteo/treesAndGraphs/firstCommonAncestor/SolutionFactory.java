package com.xenoteo.treesAndGraphs.firstCommonAncestor;

public class SolutionFactory {

    ISolution getSolution(String type){
        if (type.equalsIgnoreCase("SOLUTION"))
            return new Solution();
        if (type.equalsIgnoreCase("SOLUTIONOPTIMAL"))
            return new SolutionOptimal();
        if (type.equalsIgnoreCase("SOLUTIONWITHPARENTS"))
            return new SolutionWithParents();
        if (type.equalsIgnoreCase("SOLUTIONWITHPARENTSOPTIMAL"))
            return new SolutionWithParentsOptimal();
        return null;
    }
}
