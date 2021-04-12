package com.xenoteo.chapter3_stacksAndQueues.stackOfPLates;

import com.xenoteo.chapter3_stacksAndQueues.question3_3_stackOfPlates.SetOfStacks;

public class SetOfStacksTest extends AbstractSetOfStacksTest{

    @Override
    protected SetOfStacks createAndFillStack() {
        SetOfStacks stack = new SetOfStacks(4);
        fillStack(stack);
        return stack;
    }

    @Override
    public SetOfStacks createAndFillAnotherStack() {
        SetOfStacks stack = new SetOfStacks(4);
        fillAnotherStack(stack);
        return stack;
    }
}
