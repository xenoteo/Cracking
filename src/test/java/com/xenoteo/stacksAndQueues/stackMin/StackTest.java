package com.xenoteo.stacksAndQueues.stackMin;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {

    private Stack createAndFillStack() {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        return stack;
    }

    @Test
    public void pushAndPopTest() {
        Stack stack = createAndFillStack();
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(7, stack.pop());
        Assert.assertEquals(5, stack.pop());
        Assert.assertEquals(3, stack.pop());
    }

    @Test
    public void pushAndPeekTest() {
        Stack stack = createAndFillStack();
        Assert.assertEquals(2, stack.peek());
        stack.pop();
        Assert.assertEquals(7, stack.peek());
        stack.pop();
        Assert.assertEquals(5, stack.peek());
        stack.pop();
        Assert.assertEquals(3, stack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmptyStackTest() {
        Stack stack = createAndFillStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyStackTest() {
        Stack stack = createAndFillStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void minEmptyStackTest() {
        Stack stack = createAndFillStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.min();
    }

    @Test
    public void pushAndIsEmptyTest() {
        Stack stack = createAndFillStack();
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
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
    }
}
