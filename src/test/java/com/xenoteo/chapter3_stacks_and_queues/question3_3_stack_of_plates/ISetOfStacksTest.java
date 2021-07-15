package com.xenoteo.chapter3_stacks_and_queues.question3_3_stack_of_plates;

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
