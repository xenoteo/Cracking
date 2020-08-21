package com.xenoteo.arraysAndStrings.zeroMatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    private final int[][] reviewed1 = {{0, 0, 0}, {4, 0, 6}, {7, 0, 9}};
    private final int[][] reviewed2 = {{0, 0, 0, 0}, {0, 2, 0, 2}, {0, 3, 0, 3}, {0, 4, 0, 4}};

    private final Solution solution = new Solution();

    @Test
    public void reviewMatrixWithCopyingTest(){
        int[][] matrix1 = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{0, 1, 0, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        Assert.assertEquals(reviewed1, solution.reviewMatrixWithCopying(matrix1));
        Assert.assertEquals(reviewed2, solution.reviewMatrixWithCopying(matrix2));
    }

    @Test
    public void reviewMatrixWithSetsTest(){
        int[][] matrix1 = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{0, 1, 0, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        Assert.assertEquals(reviewed1, solution.reviewMatrixWithSets(matrix1));
        Assert.assertEquals(reviewed2, solution.reviewMatrixWithSets(matrix2));
    }

    @Test
    public void reviewMatrixWithSetTest(){
        int[][] matrix1 = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{0, 1, 0, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        Assert.assertEquals(reviewed1, solution.reviewMatrixWithSet(matrix1));
        Assert.assertEquals(reviewed2, solution.reviewMatrixWithSet(matrix2));
    }

    @Test
    public void reviewMatrixInPlaceTest(){
        int[][] matrix1 = {{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{0, 1, 0, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        Assert.assertEquals(reviewed1, solution.reviewMatrixInPlace(matrix1));
        Assert.assertEquals(reviewed2, solution.reviewMatrixInPlace(matrix2));
    }
}
