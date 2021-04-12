package com.xenoteo.chapter3_stacksAndQueues.question3_3_stackOfPlates;

import com.xenoteo.helpers.stack.IStack;

/**
 * The interface for implementing set of stacks,
 * having methods performing basic stack operations on a specific sub-stack.
 */
public interface ISetOfStacks extends IStack {

    /**
     * Performs a pop operation on a specific sub-stack.
     *
     * @param i  the sub-stack index
     * @return the element popped from the ith sub-stack
     */
    int popAt(int i);

    /**
     * Performs a peek operation on a specific sub-stack.
     *
     * @param i  the sub-stack index
     * @return the element peeked from the ith sub-stack
     */
    int peekAt(int i);

    /**
     * Performs a push operation on a specific sub-stack.
     *
     * @param i  the sub-stack index
     */
    void pushAt(int i, int x);

    /**
     * Performs an isEmpty operation on a specific sub-stack.
     *
     * @param i  the sub-stack index
     * @return whether the ith sub-stack is empty
     */
    boolean isEmptyAt(int i);

}
