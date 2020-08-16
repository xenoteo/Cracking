package com.xenoteo.uniqueCharsInString;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final String str1 = "abracadabra";
    private final String str2 = "hippopotamus";
    private final String str3 = "dermatoglyphics";
    private final String str4 = "uncopyrightable";

    private final Solution ex1 = new Solution(str1);
    private final Solution ex2 = new Solution(str2);
    private final Solution ex3 = new Solution(str3);
    private final Solution ex4 = new Solution(str4);

    @Test
    public void isUniqueInPlaceTest(){
        Assert.assertFalse(ex1.isUniqueInPlace());
        Assert.assertFalse(ex2.isUniqueInPlace());
        Assert.assertTrue(ex3.isUniqueInPlace());
        Assert.assertTrue(ex4.isUniqueInPlace());
    }

    @Test
    public void isUniqueWithSortingTest(){
        Assert.assertFalse(ex1.isUniqueWithSorting());
        Assert.assertFalse(ex2.isUniqueWithSorting());
        Assert.assertTrue(ex3.isUniqueWithSorting());
        Assert.assertTrue(ex4.isUniqueWithSorting());
    }

    @Test
    public void isUniqueWithSetTest(){
        Assert.assertFalse(ex1.isUniqueWithSet());
        Assert.assertFalse(ex2.isUniqueWithSet());
        Assert.assertTrue(ex3.isUniqueWithSet());
        Assert.assertTrue(ex4.isUniqueWithSet());
    }
}
