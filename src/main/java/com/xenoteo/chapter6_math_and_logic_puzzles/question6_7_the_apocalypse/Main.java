package com.xenoteo.chapter6_math_and_logic_puzzles.question6_7_the_apocalypse;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int n = 100; n <= 10_000_000; n *= 10) {
            double girlsRatio = solution.girlsRatioForNFamilies(n);
            double boysRatio = 1 - girlsRatio;
            System.out.printf("%-10d families: %f girls vs %f boys\n", n, girlsRatio, boysRatio);
        }
    }
}
