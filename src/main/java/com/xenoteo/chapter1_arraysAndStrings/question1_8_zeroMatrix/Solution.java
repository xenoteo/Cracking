package com.xenoteo.chapter1_arraysAndStrings.question1_8_zeroMatrix;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Reviewing a matrix such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public class Solution {

    /**
     * Reviews the matrix such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     * Using a copy of the matrix.
     * Time complexity is O(M * N), space complexity is O(M * N).
     *
     * @param matrix  the matrix to review
     * @return the reviewed matrix
     */
    public int[][] reviewMatrixWithCopying(int[][] matrix){
        int[][] reviewed = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0) {
                    resetColumn(reviewed, j);
                    resetRow(reviewed, i);
                }
            }
        }
        return reviewed;
    }

    /**
     * Reviews the matrix such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     * Using a set of rows and columns to reset.
     * Time complexity is O(M * N), space complexity is O(M + N).
     *
     * @param matrix  the matrix to review
     * @return the reviewed matrix
     */
    public int[][] reviewMatrixWithSets(int[][] matrix){
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> columns = new HashSet<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for (int c : columns)
            resetColumn(matrix, c);
        for (int r : rows)
            resetRow(matrix, r);
        return matrix;
    }

    /**
     * Reviews matrix such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     * Using a set of columns to reset and boolean variable to check if row has 0.
     * Time complexity is O(M * N), space complexity is O(N).
     *
     * @param matrix  the matrix to review
     * @return the reviewed matrix
     */
    public int[][] reviewMatrixWithSet(int[][] matrix){
        HashSet<Integer> columns = new HashSet<>();
        boolean hasZero;
        for (int i = 0; i < matrix.length; i++){
            hasZero = false;
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    hasZero = true;
                    columns.add(j);
                }
            }
            if (hasZero) resetRow(matrix, i);
        }
        for (int c : columns)
            resetColumn(matrix, c);
        return matrix;
    }

    /**
     * Reviews matrix such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
     * Using the first row and column to track information about rows and columns to reset.
     * Time complexity is O(M * N), space complexity is O(1).
     *
     * @param matrix  the matrix to review
     * @return the reviewed matrix
     */
    public int[][] reviewMatrixInPlace(int[][] matrix){
        boolean zeroRowHasZero = false;
        boolean zeroColumnHasZero = false;

        for (int j = 0; j < matrix[0].length; j++)
            if (matrix[0][j] == 0){
                zeroRowHasZero = true;
                break;
            }
        for (int[] ints : matrix)
            if (ints[0] == 0) {
                zeroColumnHasZero = true;
                break;
            }

        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int j = 1; j < matrix[0].length; j++)
            if (matrix[0][j] == 0) resetColumn(matrix, j);

        for (int i = 1; i < matrix.length; i++)
            if (matrix[i][0] == 0) resetRow(matrix, i);

        if (zeroColumnHasZero) resetColumn(matrix, 0);
        if (zeroRowHasZero) resetRow(matrix, 0);

        return matrix;
    }

    /**
     * Sets the entire column to 0.
     *
     * @param matrix  the matrix to reset column
     * @param c  the index of column to reset
     */
    private void resetColumn(int[][] matrix, int c){
        for (int i = 0; i < matrix.length; i++)
            matrix[i][c] = 0;
    }

    /**
     * Sets the entire row to 0.
     *
     * @param matrix  the matrix to reset row
     * @param r  the index of row to reset
     */
    private void resetRow(int[][] matrix, int r){
        for (int j = 0; j < matrix[0].length; j++)
            matrix[r][j] = 0;
    }
}
