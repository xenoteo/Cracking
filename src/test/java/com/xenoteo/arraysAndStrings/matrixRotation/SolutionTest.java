package com.xenoteo.arraysAndStrings.matrixRotation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    private final int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    private final int[][] rotated1 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
    private final int[][] matrix2 = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
    private final int[][] rotated2 = {{4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}};

    @Test
    public void rotateMatrixTest(){
        Solution solution = new Solution();
        Assert.assertEquals(rotated1, solution.rotateMatrix(matrix1));
        Assert.assertEquals(rotated2, solution.rotateMatrix(matrix2));
    }

    @Test
    public void rotateMatrixInPlaceTest(){
        int[][] copy1 = Arrays.stream(matrix1).map(int[]::clone).toArray(int[][]::new);;
        int[][] copy2 = Arrays.stream(matrix2).map(int[]::clone).toArray(int[][]::new);;
        Solution solution = new Solution();
        Assert.assertEquals(rotated1, solution.rotateMatrixInPlace(copy1));
        Assert.assertEquals(rotated2, solution.rotateMatrixInPlace(copy2));
    }
}
