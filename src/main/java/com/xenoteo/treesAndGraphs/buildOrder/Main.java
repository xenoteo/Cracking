package com.xenoteo.treesAndGraphs.buildOrder;

import java.util.Arrays;

public class Main {
    private static final String REMOVING = "Removing independent projects";
    private static final String DFS = "Using DFS";

    public static void main(String[] args) {
        String[] projects = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        String[][] dependencies = new String[][]{
                {"f", "c"},
                {"f", "b"},
                {"f", "a"},
                {"c", "a"},
                {"b", "a"},
                {"a", "e"},
                {"b", "e"},
                {"d", "g"}
        };
        printBuildOrder(projects, dependencies);
    }

    /**
     * Prints valid build orders of given projects with dependencies.
     *
     * @param projects  projects to build
     * @param dependencies  dependencies between projects
     */
    private static void printBuildOrder(String[] projects, String[][] dependencies){
        String format = "%-30s: %s\n";
        System.out.printf(format, "Projects", Arrays.toString(projects));
        System.out.printf("Dependencies: %s\n\n", dependenciesToString(dependencies));
        Solution solution = new Solution();
        System.out.printf(format + format,
                REMOVING, Arrays.toString(solution.buildOrder(projects, dependencies)),
                DFS, Arrays.toString(solution.buildOrderDFS(projects, dependencies)));
    }

    /**
     * Converts the array of dependencies strings to one string.
     *
     * @param dependencies  dependencies to convert to string
     * @return the string representing dependencies
     */
    private static String dependenciesToString(String[][] dependencies){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < dependencies.length - 1; i++){
            str.append(dependencies[i][0]);
            str.append(" -> ");
            str.append(dependencies[i][1]);
            str.append(", ");
        }
        str.append(dependencies[dependencies.length - 1][0]);
        str.append(" -> ");
        str.append(dependencies[dependencies.length - 1][1]);
        str.append("]");
        return str.toString();
    }
}
