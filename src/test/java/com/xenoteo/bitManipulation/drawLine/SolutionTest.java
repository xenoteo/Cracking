package com.xenoteo.bitManipulation.drawLine;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void drawLineAdjacentBytesWithoutFullBytesTest(){
        byte[] screen = new byte[4];
        byte[] expectedScreen = {0b00001111, (byte) 0b11000000, 0, 0};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 16, 4, 9, 0));
    }

    @Test
    public void drawLineTheSameByteTest(){
        byte[] screen = new byte[4];
        byte[] expectedScreen = {0b00001110, 0, 0, 0};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 16, 4, 6, 0));
    }

    @Test
    public void drawLineStartingFromXDivisibleBy8Test(){
        byte[] screen = new byte[6];
        byte[] expectedScreen = {0, (byte) 0xFF, (byte) 0b11100000,  0, 0, 0};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 24, 8, 18, 0));
    }

    @Test
    public void drawLineWithFullBytesTest(){
        byte[] screen = new byte[6];
        byte[] expectedScreen = {0, 0, 0, 0b00111111, (byte) 0xFF, (byte) 0b11000000};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 24, 2, 17, 1));
    }

    @Test
    public void drawLineStartingFromXDivisibleBy8AndEndingByXHavingReminder7Test(){
        byte[] screen = new byte[6];
        byte[] expectedScreen = {0, 0, 0, 0, (byte) 0xFF, (byte) 0xFF};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 24, 8, 23, 1));
    }

    @Test
    public void drawLineStartingFromXHavingReminder7AndEndingByXHavingReminder7Test(){
        byte[] screen = new byte[4];
        byte[] expectedScreen = {0, 0, 1, (byte) 0xFF};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 16, 7, 15, 1));
    }

    @Test
    public void drawLineStartingFromXHavingReminder7AndEndingByXDivisibleBy8Test(){
        byte[] screen = new byte[4];
        byte[] expectedScreen = {0, 0, 1, (byte) 0b10000000};
        Assert.assertArrayEquals(expectedScreen, new Solution().drawLine(screen, 16, 7, 8, 1));
    }
}