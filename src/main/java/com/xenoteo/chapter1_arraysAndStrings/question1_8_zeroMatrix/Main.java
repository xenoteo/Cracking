package com.xenoteo.chapter1_arraysAndStrings.question1_8_zeroMatrix;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    private static final String ORIGINAL = "original matrix";
    private static final String WITH_COPYING = "with copying";
    private static final String WITH_SET = "with set";
    private static final String WITH_SETS = "with sets";
    private static final String IN_PLACE = "in place";

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        printMatrices(matrix);
    }

    /**
     * Prints the given matrix and reviewed matrix using different approaches.
     *
     * @param matrix  the matrix to rotate
     */
    private static void printMatrices(int[][] matrix){
        Solution solution = new Solution();
        int[][] copy1 = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        int[][] copy2 = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n",
                ORIGINAL, matrixToString(matrix),
                WITH_COPYING, matrixToString(solution.reviewMatrixWithCopying(matrix)),
                WITH_SETS, matrixToString(solution.reviewMatrixWithSets(matrix)),
                WITH_SET, matrixToString(solution.reviewMatrixWithSet(copy1)),
                IN_PLACE, matrixToString(solution.reviewMatrixInPlace(copy2)));
    }

    /**
     * Converts a matrix to a string.
     *
     * @param matrix  the matrix
     * @return the string representing the matrix
     */
    private static String matrixToString(int[][] matrix){
        return Arrays.stream(matrix).map(Arrays::toString).collect(Collectors.joining("\n"));
    }
}
