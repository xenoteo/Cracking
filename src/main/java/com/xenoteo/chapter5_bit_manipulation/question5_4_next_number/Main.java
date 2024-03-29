package com.xenoteo.chapter5_bit_manipulation.question5_4_next_number;

public class Main {
    public static void main(String[] args) {
        int n = 0b01011011;
        printNextAndPrevious(n);
    }

    /**
     * Prints a given number in its binary representation and its next and previous numbers.
     *
     * @param n  the number to print
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
