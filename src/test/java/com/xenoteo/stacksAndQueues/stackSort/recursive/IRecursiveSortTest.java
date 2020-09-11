package com.xenoteo.stacksAndQueues.stackSort.recursive;

import com.xenoteo.helpers.stack.Stack;
import org.junit.Assert;
import org.junit.Test;

public abstract class IRecursiveSortTest {
    protected abstract Sort createSorting();

    @Test
    public void sameNumbersTest(){
        Sort sorting = createSorting();

        Stack stack = new Stack();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        Stack sorted = sorting.sort(stack);

        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());

    }

    @Test
    public void almostSameNumbersTest(){
        Sort sorting = createSorting();

        Stack stack = new Stack();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(7);
        stack.push(1);

        Stack sorted = sorting.sort(stack);

        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(1, sorted.pop());
        Assert.assertEquals(7, sorted.pop());
    }

    @Test
    public void oneElementTest(){
        Sort sorting = createSorting();

        Stack stack = new Stack();

        stack.push(10);

        Stack sorted = sorting.sort(stack);

        Assert.assertEquals(10, sorted.pop());
    }

    @Test
    public void regularTest(){
        Sort sorting = createSorting();

        Stack stack = new Stack();

        stack.push(3);
        stack.push(7);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        stack.push(3);

        Stack sorted = sorting.sort(stack);

        Assert.assertEquals(2, sorted.pop());
        Assert.assertEquals(3, sorted.pop());
        Assert.assertEquals(3, sorted.pop());
        Assert.assertEquals(4, sorted.pop());
        Assert.assertEquals(7, sorted.pop());
        Assert.assertEquals(9, sorted.pop());
    }

    @Test
    public void emptyStackTest(){
        Sort sorting = createSorting();
        Stack stack = new Stack();
        sorting.sort(stack);   // should not throw any exceptions
    }
}
