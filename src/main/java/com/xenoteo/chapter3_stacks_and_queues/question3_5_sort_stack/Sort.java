package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

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
