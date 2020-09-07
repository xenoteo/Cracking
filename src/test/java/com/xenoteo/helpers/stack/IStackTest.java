package com.xenoteo.helpers.stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Class for testing basic methods of a stack, created to extend.
 */
public abstract class IStackTest {

    abstract protected IStack createAndFillStack();

    protected void fillStack(IStack stack){
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(2);
    }

    @Test(expected = EmptyStackException.class)
    public void pushAndPopTest(){
        IStack stack = createAndFillStack();
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(7, stack.pop());
        Assert.assertEquals(5, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(4, stack.pop());
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void pushPopAndPeekTest(){
        IStack stack = createAndFillStack();
        Assert.assertEquals(2, stack.peek());
        stack.pop();
        Assert.assertEquals(7, stack.peek());
        stack.pop();
        Assert.assertEquals(5, stack.peek());
        stack.pop();
        Assert.assertEquals(3, stack.peek());
        stack.pop();
        Assert.assertEquals(4, stack.peek());
        stack.pop();
        stack.peek();
    }

    @Test
    public void pushAndIsEmptyTest(){
        IStack stack = createAndFillStack();
        Assert.assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }
}
