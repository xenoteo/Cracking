package com.xenoteo.stacksAndQueues.stackSort;

import com.xenoteo.helpers.stack.Stack;

/**
 * Implementing stack sort such that the smallest items are on the top,
 * without copying the elements into any other data structure.
 * Two additional stacks used.
 * Complexity of sort is O(N^2).
 */
public class InsertionSortWithBuff implements Sort {

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
