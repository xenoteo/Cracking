package com.xenoteo.helpers.stack;


public class StackTest extends IStackTest {

    @Override
    protected Stack createAndFillStack() {
        Stack stack = new Stack();
        fillStack(stack);
        return stack;
    }
}
