package com.xenoteo.arraysAndStrings.matrixRotation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        printMatrices(matrix);
    }

    /**
     * Prints the given matrix and the matrix rotated by 90 degrees using different methods.
     *
     * @param matrix  the matrix to rotate
     */
    private static void printMatrices(int[][] matrix){
        System.out.printf("%s:\n%s\n", "The original matrix",
                matrixToString(matrix));
        System.out.printf("%s:\n%s\n", "Rotated creating the copy",
                matrixToString(new Solution().rotateMatrix(matrix)));
        System.out.printf("%s:\n%s\n", "Rotated in place",
                matrixToString(new Solution().rotateMatrixInPlace(matrix)));
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
