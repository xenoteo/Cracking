package com.xenoteo.chapter5_bit_manipulation.question5_8_draw_line;

/**
 * Class for drawing the screen represented by bits.
 */
public class Screen {

    /**
     * Drawing a screen.
     * @param screen to draw
     * @param width of the screen
     * @return string representing the screen
     */
    public String draw(byte[] screen, int width){
        int widthInBytes = width / 8;
        int height = screen.length / widthInBytes;
        StringBuilder str = new StringBuilder();
        for (int h = height - 1; h >= 0; h--){
            for (int x = 0; x < widthInBytes; x++){
                str.append(byteToString(screen[h * widthInBytes + x]));
            }
            str.append("\n");
        }
        return str.toString();
    }

    /**
     * Converting a byte to a binary string of the length 8.
     * @param n to convert
     * @return binary string representing the given number
     */
    private String byteToString(byte n){
        return String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
    }
}
