package com.xenoteo.chapter5_bit_manipulation.question5_6_conversion;

public class Main {
    public static void main(String[] args) {
        printConversionNumber(0b1011, 0b0011);
        printConversionNumber(0b0010101011, 0b011101001);
    }

    /**
     * Printing two given integers in their binary representation
     * and the number of bits needed to flip to convert a to b.
     * @param a is the first number
     * @param b is the second number
     */
    private static void printConversionNumber(int a, int b){
        System.out.printf("a: %s\nb: %s\nresult: %d\n\n",
                Integer.toBinaryString(a),
                Integer.toBinaryString(b),
                new Solution().conversionNumber(a, b));
    }
}
