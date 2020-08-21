package com.xenoteo.arraysAndStrings.matrixRotation;

/**
 * Given an image represented by an NxN matrix rotating the image by 90 degrees.
 */
public class Solution {

    /**
     * Rotating given N*N matrix by 90 degrees.
     * Complexity is O(N^2).
     * @param matrix to rotate
     * @return rotated matrix
     */
    public int[][] rotateMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                rotated[j][i] = matrix[n - 1 - i][j];
            }
        }
        return rotated;
    }
}
