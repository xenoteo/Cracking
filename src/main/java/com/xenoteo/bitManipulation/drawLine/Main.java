package com.xenoteo.bitManipulation.drawLine;

public class Main {
    public static void main(String[] args) {
        byte[] screen = new byte[4];
        drawLineOnScreen(screen, 16, 4, 13, 0);
    }

    /**
     * Drawing the screen with a new line on it.
     * @param screen to draw line on
     * @param width of the screen in bits
     * @param x1 is a position to start from
     * @param x2 is a position to end with
     * @param y is a height-coordinate of the line
     */
    private static void drawLineOnScreen(byte[] screen, int width, int x1, int x2, int y){
        byte[] newScreen = new Solution().drawLine(screen, width, x1, x2, y);
        System.out.println(new Screen().draw(newScreen, width));
    }
}
