package com.xenoteo.stacksAndQueues.stackMin;

import com.xenoteo.helpers.stack.IStackTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest extends IStackTest {

    @Override
    protected Stack createAndFillStack() {
        Stack stack = new Stack();
        fillStack(stack);
        return stack;
    }

    @Test(expected = EmptyStackException.class)
    public void pushPopAndMinTest() {
        Stack stack = createAndFillStack();
        Assert.assertEquals(2, stack.min());
        stack.pop();
        Assert.assertEquals(3, stack.min());
        stack.pop();
        Assert.assertEquals(3, stack.min());
        stack.pop();
        Assert.assertEquals(3, stack.min());
        stack.pop();
        Assert.assertEquals(4, stack.min());
        stack.pop();
        stack.min();
    }
}
