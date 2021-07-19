package com.xenoteo.chapter6_math_and_logic_puzzles.question6_8_the_egg_drop_problem;

public class Main {

    public static void main(String[] args) {
        setBreakingPointAndFindIt(58);
        setBreakingPointAndFindIt(99);
        setBreakingPointAndFindIt(100);
        setBreakingPointAndFindIt(1);
        setBreakingPointAndFindIt(14);
        setBreakingPointAndFindIt(18);
        setBreakingPointAndFindIt(28);
        setBreakingPointAndFindIt(34);
        setBreakingPointAndFindIt(66);
        setBreakingPointAndFindIt(79);
    }

    private static void setBreakingPointAndFindIt(int breakingPoint) {
        Building building = new Building();
        building.setBreakingPoint(breakingPoint);
        int[] result = building.findBreakingPoint();
        System.out.printf("Floor %-3d found in %-2d steps\n", result[0], result[1]);
    }
}
