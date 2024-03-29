package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The class implementing stack sort such that the smallest items are on the top,
 * without copying the elements into any other data structure.
 *
 * One additional stack used, using of the second additional stack (like {@link InsertionSortWithBuff})
 * is replaced with using of the main stack.
 *
 * Complexity of sort is O(N^2).
 */
public class InsertionSort implements Sort {

    @Override
    public Stack sort(Stack stack) {
        Stack sorted = new Stack();
        while (!stack.isEmpty()){
            int x = stack.pop();
            while (!sorted.isEmpty() && sorted.peek() > x)
                stack.push(sorted.pop());
            sorted.push(x);
        }
        while (!sorted.isEmpty())
            stack.push(sorted.pop());
        return stack;
    }
}
