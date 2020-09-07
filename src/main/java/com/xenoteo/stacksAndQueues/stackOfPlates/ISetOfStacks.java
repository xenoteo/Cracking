package com.xenoteo.stacksAndQueues.stackOfPlates;

import com.xenoteo.helpers.stack.IStack;

/**
 * Interface for implementing set of stacks,
 * having methods performing basic stack operations on a specific sub-stack.
 */
public interface ISetOfStacks extends IStack {

    int popAt(int i);

    int peekAt(int i);

    void pushAt(int i, int x);

    boolean isEmptyAt(int i);

}
