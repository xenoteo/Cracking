package com.xenoteo.chapter5_bitManipulation.question5_4_nextNumber;

public class Main {
    public static void main(String[] args) {
        int n = 0b01011011;
        printNextAndPrevious(n);
    }

    /**
     * Printing a given number in its binary representation
     * and its next and previous numbers.
     * @param n to print
     */
    private static void printNextAndPrevious(int n){
        String format = "%-9s: %s\n";
        Solution solution = new Solution();
        System.out.printf(format + format + format,
                "n", Integer.toBinaryString(n),
                "next", Integer.toBinaryString(solution.nextWithTheSameNumberOfOnes(n)),
                "previous", Integer.toBinaryString(solution.previousWithTheSameNumberOfOnes(n)));
    }
}
