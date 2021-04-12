package com.xenoteo.chapter1_arraysAndStrings.question1_7_rotateMatrix;

/**
 * Given an image represented by an NxN matrix rotating the image by 90 degrees.
 */
public class Solution {

    /**
     * Rotates given N*N matrix by 90 degrees creating a copy of the matrix.
     * Time complexity is O(N^2), space complexity is O(N^2).
     *
     * @param matrix  the matrix to rotate
     * @return the rotated matrix
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

    /**
     * Rotates given N*N matrix by 90 degrees in place.
     * Time complexity is O(N^2), space complexity is O(1).
     *
     * @param matrix  the matrix to rotate
     * @return the rotated matrix
     */
    public int[][] rotateMatrixInPlace(int[][] matrix){
        flip(matrix);
        transpose(matrix);
        return matrix;
    }

    /**
     * Transposes the matrix.
     * Time complexity is O(N^2), space complexity is O(N).
     *
     * @param matrix  the matrix
     */
    private void transpose(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /**
     * Flips the matrix.
     * TIme complexity is O(N), space complexity is O(1).
     *
     * @param matrix  the matrix
     */
    private void flip(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n - 1 - i] = temp;
        }
    }

}
