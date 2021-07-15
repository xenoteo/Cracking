package com.xenoteo.chapter5_bit_manipulation.question5_8_draw_line;

public class Main {
    public static void main(String[] args) {
        byte[] screen = new byte[4];
        drawLineOnScreen(screen, 16, 4, 13, 0);
    }

    /**
     * Draws the screen with a new line on it.
     *
     * @param screen  the screen to draw line on
     * @param width  the width of the screen in bits
     * @param x1  the position to start from
     * @param x2  the position to end with
     * @param y  the height-coordinate of the line
     */
    private static void drawLineOnScreen(byte[] screen, int width, int x1, int x2, int y){
        byte[] newScreen = new Solution().drawLine(screen, width, x1, x2, y);
        System.out.println(new Screen().draw(newScreen, width));
    }
}
