package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The class implementing stack sort such that the smallest items are on the top,
 * without copying the elements into any other data structure.
 *
 * Two additional stacks used.
 *
 * Complexity of sort is O(N^2).
 */
public class InsertionSortWithBuff implements Sort {

    @Override
    public Stack sort(Stack stack) {
        Stack sorted = new Stack();
        Stack buff = new Stack();

        while (!stack.isEmpty()){
            int x = stack.pop();
            while (!sorted.isEmpty() && sorted.peek() > x)
                buff.push(sorted.pop());
            sorted.push(x);
            while (!buff.isEmpty())
                sorted.push(buff.pop());
        }
        while (!sorted.isEmpty())
            stack.push(sorted.pop());

        return stack;
    }
}
