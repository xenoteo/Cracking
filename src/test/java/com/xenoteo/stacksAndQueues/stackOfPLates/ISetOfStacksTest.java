package com.xenoteo.stacksAndQueues.stackOfPLates;

import com.xenoteo.stacksAndQueues.stackOfPlates.ISetOfStacks;

import org.junit.Test;

public interface ISetOfStacksTest {

    ISetOfStacks createAndFillAnotherStack();

    @Test
    void pushAndPopAtTest();

    @Test
    void pushAndPopAtEmptyStackTest();

    @Test
    void pushPopAtAndPeekAtTest();

    @Test
    void pushPopAtAndPushAtTest();

    @Test
    void pushPopAtAndIsEmptyAtTest();

    @Test
    void pushPopAtPushAtEmptyTest();

    @Test
    void pushAtBadIndexTest();

    @Test
    void popAtBadIndexTest();

    @Test
    void isEmptyAtBadIndexTest();

    @Test
    void peekAtBadIndexTest();

    @Test
    void pushAtFullStackTest();
}
