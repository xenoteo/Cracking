package com.xenoteo.arraysAndStrings.zeroMatrix;

import java.util.Arrays;

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
     * Printing given matrix and reviewed matrix using different approaches.
     * @param matrix to rotate
     */
    private static void printMatrices(int[][] matrix){
        Solution solution = new Solution();
        int[][] copy1 = copyMatrix(matrix);
        int[][] copy2 = copyMatrix(matrix);
        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n",
                ORIGINAL, getMatrixString(matrix),
                WITH_COPYING, getMatrixString(solution.reviewMatrixWithCopying(matrix)),
                WITH_SETS, getMatrixString(solution.reviewMatrixWithSets(matrix)),
                WITH_SET, getMatrixString(solution.reviewMatrixWithSet(copy1)),
                IN_PLACE, getMatrixString(solution.reviewMatrixInPlace(copy2)));
    }

    /**
     * Creating a string representing given matrix.
     * @param matrix to make string from
     * @return a string representing the matrix
     */
    private static String getMatrixString(int[][] matrix){
        StringBuilder builder = new StringBuilder();
        for (int[] ints : matrix) {
            builder.append(Arrays.toString(ints));
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * Copying given matrix.
     * @param matrix to copy
     * @return a copy of the matrix
     */
    private static int[][] copyMatrix(int[][] matrix){
        int length = matrix.length;
        int width = matrix[0].length;
        int[][] copy = new int[length][width];
        for (int i = 0; i < length; i++){
            System.arraycopy(matrix[i], 0, copy[i], 0, width);
        }
        return copy;
    }
}
