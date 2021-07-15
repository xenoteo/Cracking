package com.xenoteo.chapter3_stacks_and_queues.question3_3_stack_of_plates;

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
