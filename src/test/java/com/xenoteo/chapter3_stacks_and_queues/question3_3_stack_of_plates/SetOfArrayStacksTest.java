package com.xenoteo.chapter3_stacks_and_queues.question3_3_stack_of_plates;

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
