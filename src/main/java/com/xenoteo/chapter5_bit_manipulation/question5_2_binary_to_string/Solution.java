package com.xenoteo.chapter5_bit_manipulation.question5_2_binary_to_string;

/**
 * Given a real number between O and 1 (e.g., 0.72) that is passed in as a double, finding its binary representation.
 * If the number cannot be represented accurately in binary with at most 32 characters, printing "ERROR".
 */
public class Solution {

    /**
     * Given a real number between O and 1 (e.g., 0.72) that is passed in as a double,
     * finds its binary representation.
     *
     * @param n  the number
     * @return the string representing number's binary representation
     */
    public String binaryToString(double n){
        if (n >= 1 || n <= 0)
            return "ERROR";

        StringBuilder str = new StringBuilder("0.");
        int count = 0;
        while (n > 0 && count < 32) {
            n *= 2;
            if (n >= 1) {
                str.append(1);
                n--;
            } else
                str.append(0);
            count++;
        }

        if (n > 0)
            return "ERROR";
        return str.toString();
    }
}
