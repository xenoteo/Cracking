package com.xenoteo.chapter3_stacks_and_queues.question3_1_three_in_one;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class StackTest {

    private Stack createAndFillStack(){
        Stack stack = new Stack();

        stack.push(1, 1);
        stack.push(2, 1);
        stack.push(3, 1);

        stack.push(2, 2);
        stack.push(4, 2);

        stack.push(6, 3);
        stack.push(7, 3);
        stack.push(8, 3);
        stack.push(9, 3);

        return stack;
    }

    @Test
    public void pushAndPopTest(){
        Stack stack = createAndFillStack();
        Assert.assertEquals(3, stack.pop(1));
        Assert.assertEquals(2, stack.pop(1));
        Assert.assertEquals(1, stack.pop(1));
        Assert.assertEquals(4, stack.pop(2));
        Assert.assertEquals(2, stack.pop(2));
        Assert.assertEquals(9, stack.pop(3));
        Assert.assertEquals(8, stack.pop(3));
    }

    @Test
    public void pushAndPeekTest(){
        Stack stack = createAndFillStack();
        Assert.assertEquals(3, stack.peek(1));
        Assert.assertEquals(4, stack.peek(2));
        Assert.assertEquals(9, stack.peek(3));
    }

    @Test
    public void pushPopAndIsEmptyTest(){
        Stack stack = createAndFillStack();
        stack.pop(2);
        stack.pop(2);
        Assert.assertTrue(stack.isEmpty(2));
        Assert.assertFalse(stack.isEmpty(1));
        Assert.assertFalse(stack.isEmpty(3));
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyStackTest(){
        Stack stack = createAndFillStack();
        stack.pop(2);
        stack.pop(2);
        stack.pop(2);
    }

    @Test(expected = EmptyStackException.class)
    public void peekEmptyStackTest(){
        Stack stack = createAndFillStack();
        stack.pop(2);
        stack.pop(2);
        stack.peek(2);
    }

    private Stack getSmallStackWithData(){
        Stack stack = new Stack(10);

        stack.push(1, 1);
        stack.push(2, 1);

        stack.push(3, 2);
        stack.push(4, 2);

        stack.push(5, 3);
        stack.push(6, 3);

        return stack;
    }

    private void pushData(Stack stack){
        stack.push(3, 1);
        stack.push(4, 1);

        stack.push(5, 2);
        stack.push(6, 2);

        stack.push(7, 3);
        stack.push(8, 3);
    }

    @Test
    public void pushAndPopWithResizingTest(){
        Stack stack = getSmallStackWithData();
        pushData(stack);
        Assert.assertEquals(4, stack.pop(1));
        Assert.assertEquals(6, stack.pop(2));
        Assert.assertEquals(8, stack.pop(3));
    }

    @Test
    public void pushAndPeekWithResizingTest(){
        Stack stack = getSmallStackWithData();
        pushData(stack);
        Assert.assertEquals(4, stack.peek(1));
        Assert.assertEquals(6, stack.peek(2));
        Assert.assertEquals(8, stack.peek(3));
    }
}
