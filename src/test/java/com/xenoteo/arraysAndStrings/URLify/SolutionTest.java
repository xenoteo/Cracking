package com.xenoteo.arraysAndStrings.URLify;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final String str1Old = "hello darkness my old friend";
    private final String str1New = "hello%20darkness%20my%20old%20friend";
    private final String str2Old = "Eternal Sunshine of the Spotless Mind";
    private final String str2New = "Eternal%20Sunshine%20of%20the%20Spotless%20Mind";
    private final String str3Old = "She goes running for the shelter of a mother's little helper";
    private final String str3New = "She%20goes%20running%20for%20the%20shelter%20of%20a%20mother's%20little%20helper";

    private final Solution solution = new Solution();

    @Test
    public void getStringWithReplacedSpacesTest(){
        Assert.assertEquals(str1New, solution.getStringWithReplacedSpaces(str1Old));
        Assert.assertEquals(str2New, solution.getStringWithReplacedSpaces(str2Old));
        Assert.assertEquals(str3New, solution.getStringWithReplacedSpaces(str3Old));
    }

}
