package com.xenoteo.chapter6_math_and_logic_puzzles.question6_10_poison;

public class Main {
    private static final String BINARY = "binary representation";
    private static final String GROUPING = "grouping";

    public static void main(String[] args) {
        setPoisonedBottleAndFindIt(555);
        setPoisonedBottleAndFindIt(1);
        setPoisonedBottleAndFindIt(1000);
        setPoisonedBottleAndFindIt(928);
        setPoisonedBottleAndFindIt(334);
    }

    /**
     * Sets the poisoned bottle, finds it and the number of day needed to find it using different solutions.
     *
     * @param poisonedBottle  the number pf the poisoned bottle.
     */
    private static void setPoisonedBottleAndFindIt(int poisonedBottle) {
        SolutionGroups solutionGroups = new SolutionGroups(poisonedBottle);
        int[] result = solutionGroups.findPoisonedBottle();
        System.out.printf("Poisoned bottle number is %4d, found in %2d days using %s\n", result[0], result[1], GROUPING);

        SolutionBinary solutionBinary = new SolutionBinary(poisonedBottle);
        result = solutionBinary.findPoisonedBottle();
        System.out.printf("Poisoned bottle number is %4d, found in %2d days using %s\n", result[0], result[1], BINARY);

        System.out.println();
    }
}
