package com.xenoteo.chapter1_arrays_and_strings.question1_9_string_rotation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void isRotationTest(){
        Solution solution = new Solution();
        Assert.assertTrue(solution.isRotation("hippopotamus", "potamushippo"));
        Assert.assertTrue(solution.isRotation("hippopotamus", "tamushippopo"));
        Assert.assertFalse(solution.isRotation("hippopotamus", "hippo"));
        Assert.assertFalse(solution.isRotation("hippopotamus", "potamuchippo"));
        Assert.assertTrue(solution.isRotation("submarine", "marinesub"));
        Assert.assertFalse(solution.isRotation("submarine", "marinesup"));
    }

}
