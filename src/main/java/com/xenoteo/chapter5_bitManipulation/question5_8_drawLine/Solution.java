package com.xenoteo.chapter5_bitManipulation.question5_8_drawLine;


/**
 * A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels to be stored in one byte.
 * The screen has width w, where w is divisible by 8 (that is, no byte will be split across rows).
 * The height of the screen, of course, can be derived from the length of the array and the width.
 *
 * Drawing a horizontal line from (x1, y) to (x2, y).
 *
 * Assuming that bytes are counted from the left to the right and from the bottom to the top,
 * that is the byte with coordinates (x,y) has the index y * (width / 8) + x in the array.
 * So e.g. in the screen of width 24 the byte with coordinates (1, 1) has the index 4.
 */
public class Solution {

    /**
     * Drawing a horizontal line from (x1, y) to (x2, y).
     * @param screen to draw line on
     * @param width of the screen (in bits)
     * @param x1 is a position to start from
     * @param x2 is a position to end with
     * @param y is a height-coordinate of the line
     * @return changed screen with drawn line
     */
    public byte[] drawLine(byte[] screen, int width, int x1, int x2, int y){
        int widthInBytes = width / 8;
        int firstFullByte = y * widthInBytes + x1 / 8 + 1;
        int lastFullByte = y * widthInBytes+ x2 / 8 - 1;
        for (int i = firstFullByte; i <= lastFullByte; i++){
            screen[i] = (byte) 0xFF;
        }
        if (firstFullByte - lastFullByte < 2){  // if x1 and x2 belong to different bytes
            screen[firstFullByte - 1] = (byte) (0xFF >>> (x1 % 8));
            screen[lastFullByte + 1] = (byte) ~(0xFF >>> (x2 % 8 + 1));
        }
        else {
            screen[firstFullByte - 1] = (byte) ((0xFF >>> (x1 % 8)) & ~(0xFF >>> (x2 % 8 + 1)));
        }
        return screen;
    }
}
