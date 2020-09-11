package com.xenoteo.stacksAndQueues.stackSort;

import org.junit.Assert;
import org.junit.Test;

public abstract class ISortingStackTest {
    protected abstract ISortingStack createStack();

    @Test
    public void sameNumbersTest(){
        ISortingStack stack = createStack();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        stack.sort();

        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
    }

    @Test
    public void almostSameNumbersTest(){
        ISortingStack stack = createStack();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(7);
        stack.push(1);

        stack.sort();

        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(1, stack.pop());
        Assert.assertEquals(7, stack.pop());
    }

    @Test
    public void oneElementTest(){
        ISortingStack stack = createStack();

        stack.push(10);

        stack.sort();

        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void regularTest(){
        ISortingStack stack = createStack();

        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        stack.push(3);

        stack.sort();

        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(4, stack.pop());
        Assert.assertEquals(7, stack.pop());
        Assert.assertEquals(9, stack.pop());
    }

    @Test
    public void emptyStackTest(){
        ISortingStack stack = createStack();
        stack.sort();   // should not throw any exceptions
    }
}
