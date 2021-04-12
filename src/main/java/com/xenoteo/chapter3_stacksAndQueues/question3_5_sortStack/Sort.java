package com.xenoteo.chapter3_stacksAndQueues.question3_5_sortStack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The interface for implementing stack sort.
 */
public interface Sort {
    /**
     * Sorts the stack.
     *
     * @param stack  the stack to sort
     * @return the sorted stack
     */
    Stack sort(Stack stack);
}
