package com.xenoteo.bitManipulation.insertion;

public class Main {
    public static void main(String[] args) {
        int n = 0b11010101001;
        int m = 0b00111;
        int i = 3;
        int j = 7;
        System.out.printf("n = %s, m = %s; i = %d, j = %d\nk = %s\n",
                Integer.toBinaryString(n), Integer.toBinaryString(m), i, j,
                Integer.toBinaryString(new Solution().insert(n, m, i, j)));
    }
}