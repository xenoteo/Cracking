package com.xenoteo.chapter5_bitManipulation.question5_2_binaryToString;

public class Main {

    public static void main(String[] args) {
        printDecimalAndBinaryRepresentation(0.75);
        printDecimalAndBinaryRepresentation(0.625);
        printDecimalAndBinaryRepresentation(0.14);
        printDecimalAndBinaryRepresentation(0.859375);
    }

    /**
     * Printing given number using decimal and binary representation.
     * @param n is a number to print
     */
    private static void printDecimalAndBinaryRepresentation(double n){
        System.out.printf("%f\u2081\u2080 = %s\u2082 \n", n, new Solution().binaryToString(n));
    }
}
