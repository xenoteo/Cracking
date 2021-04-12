package com.xenoteo.chapter3_stacksAndQueues.stackOfPLates;

import com.xenoteo.helpers.stack.exceptions.FullStackException;
import com.xenoteo.helpers.stack.IStackTest;
import com.xenoteo.chapter3_stacksAndQueues.question3_3_stackOfPlates.ISetOfStacks;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public abstract class AbstractSetOfStacksTest extends IStackTest implements ISetOfStacksTest {

    protected void fillAnotherStack(ISetOfStacks stack){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.push(9);
    }

    @Test
    public void pushAndPopAtTest() {
        ISetOfStacks stack = createAndFillAnotherStack();
        Assert.assertEquals(8, stack.popAt(1));
        Assert.assertEquals(7, stack.popAt(1));
        Assert.assertEquals(6, stack.popAt(1));

        Assert.assertEquals(4, stack.popAt(0));
        Assert.assertEquals(3, stack.popAt(0));

        Assert.assertEquals(9, stack.popAt(2));
    }

    @Test(expected = EmptyStackException.class)
    public void pushAndPopAtEmptyStackTest(){
        ISetOfStacks stack = createAndFillAnotherStack();
        stack.popAt(1);
        stack.popAt(1);
        stack.popAt(1);
        stack.popAt(1);
        stack.popAt(1);
    }

    @Test(expected = EmptyStackException.class)
    public void pushPopAtAndPeekAtTest() {
        ISetOfStacks stack = createAndFillAnotherStack();

        Assert.assertEquals(8, stack.peekAt(1));
        stack.popAt(1);
        Assert.assertEquals(7, stack.peekAt(1));
        stack.popAt(1);
        Assert.assertEquals(6, stack.peekAt(1));

        Assert.assertEquals(4, stack.peekAt(0));
        stack.popAt(0);
        Assert.assertEquals(3, stack.peekAt(0));

        Assert.assertEquals(9, stack.peekAt(2));

        stack.popAt(1);
        stack.popAt(1);
        stack.peekAt(1);
    }

    @Test
    public void pushPopAtAndPushAtTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        Assert.assertEquals(8, stack.popAt(1));
        stack.pushAt(1, 9);
        Assert.assertEquals(9, stack.popAt(1));

        Assert.assertEquals(4, stack.popAt(0));
        stack.pushAt(0, 8);
        Assert.assertEquals(8, stack.popAt(0));
    }

    @Test
    public void pushPopAtAndIsEmptyAtTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        Assert.assertFalse(stack.isEmptyAt(0));
        Assert.assertFalse(stack.isEmptyAt(1));
        Assert.assertFalse(stack.isEmptyAt(2));

        stack.popAt(0);
        stack.popAt(0);
        stack.popAt(0);
        stack.popAt(0);

        Assert.assertTrue(stack.isEmptyAt(0));
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void pushAtBadIndexTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.popAt(-3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void popAtBadIndexTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.popAt(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void isEmptyAtBadIndexTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.popAt(-7);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void peekAtBadIndexTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.popAt(3);
    }

    @Test(expected = FullStackException.class)
    public void pushAtFullStackTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.pushAt(1, 5);
    }

    @Test
    public void pushPopAtPushAtEmptyTest(){
        ISetOfStacks stack = createAndFillAnotherStack();

        stack.popAt(2);
        stack.pushAt(2, 6);
    }
}
