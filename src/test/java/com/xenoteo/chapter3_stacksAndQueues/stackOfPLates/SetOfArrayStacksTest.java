package com.xenoteo.chapter3_stacksAndQueues.stackOfPLates;

import com.xenoteo.chapter3_stacksAndQueues.question3_3_stackOfPlates.SetOfArrayStacks;

public class SetOfArrayStacksTest extends AbstractSetOfStacksTest{

    @Override
    protected SetOfArrayStacks createAndFillStack() {
        SetOfArrayStacks stack = new SetOfArrayStacks(4);
        fillStack(stack);
        return stack;
    }

    @Override
    public SetOfArrayStacks createAndFillAnotherStack() {
        SetOfArrayStacks stack = new SetOfArrayStacks(4);
        fillAnotherStack(stack);
        return stack;
    }
}
