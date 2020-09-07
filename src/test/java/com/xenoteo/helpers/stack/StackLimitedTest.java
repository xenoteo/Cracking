package com.xenoteo.helpers.stack;

import com.xenoteo.helpers.fullStackException.FullStackException;
import org.junit.Test;

public class StackLimitedTest extends IStackTest{

    @Override
    protected StackLimited createAndFillStack() {
        StackLimited stack = new StackLimited(10);
        fillStack(stack);
        return stack;
    }

    @Test(expected = FullStackException.class)
    public void pushFullStackTest(){
        StackLimited stack = createAndFillStack();
        fillStack(stack);
        stack.push(1);
    }
}
