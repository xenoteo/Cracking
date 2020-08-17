package com.xenoteo.uniqueCharsInString;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final String str1 = "abracadabra";
    private final String str2 = "hippopotamus";
    private final String str3 = "dermatoglyphics";
    private final String str4 = "uncopyrightable";

    private final Solution ex = new Solution();
    @Test
    public void isUniqueInPlaceTest(){
        Assert.assertFalse(ex.isUniqueInPlace(str1));
        Assert.assertFalse(ex.isUniqueInPlace(str2));
        Assert.assertTrue(ex.isUniqueInPlace(str3));
        Assert.assertTrue(ex.isUniqueInPlace(str4));
    }

    @Test
    public void isUniqueWithSortingTest(){
        Assert.assertFalse(ex.isUniqueWithSorting(str1));
        Assert.assertFalse(ex.isUniqueWithSorting(str2));
        Assert.assertTrue(ex.isUniqueWithSorting(str3));
        Assert.assertTrue(ex.isUniqueWithSorting(str4));
    }

    @Test
    public void isUniqueWithSetTest(){
        Assert.assertFalse(ex.isUniqueWithSet(str1));
        Assert.assertFalse(ex.isUniqueWithSet(str2));
        Assert.assertTrue(ex.isUniqueWithSet(str3));
        Assert.assertTrue(ex.isUniqueWithSet(str4));
    }
}
