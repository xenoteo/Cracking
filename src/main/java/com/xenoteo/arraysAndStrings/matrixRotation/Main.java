package com.xenoteo.arraysAndStrings.matrixRotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 2}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 3}};
        printMatrices(matrix);
    }

    /**
     * Prints the given matrix and the matrix rotated by 90 degrees.
     *
     * @param matrix  the matrix to rotate
     */
    private static void printMatrices(int[][] matrix){
        int[][] rotated = new Solution().rotateMatrix(matrix);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++){
            builder.append(Arrays.toString(matrix[i]));
            builder.append("\t");
            builder.append(Arrays.toString(rotated[i]));
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
