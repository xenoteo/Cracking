package com.xenoteo.chapter4_treesAndGraphs.firstCommonAncestor;

/**
 * The factory of solution classes.
 */
public class SolutionFactory {

    /**
     * Gets the solution class of the provided type.
     *
     * @param type  the type of the solution
     * @return the solution class of the provided type
     */
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
