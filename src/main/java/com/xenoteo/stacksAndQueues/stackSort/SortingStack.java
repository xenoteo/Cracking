package com.xenoteo.stacksAndQueues.stackSort;

import com.xenoteo.helpers.stack.Stack;

/**
 * Stack implementing stack sort such that the smallest items are on the top,
 * without copying the elements into any other data structure.
 * One additional stack used,
 * using of the second additional stack is replaced with using of the main stack.
 * Complexity of sort is O(N^2).
 */
public class SortingStack extends Stack implements ISortingStack{
    private final Stack sorted;

    public SortingStack(){
        sorted = new Stack();
    }

    public void sort(){
        while (!isEmpty()){
            int x = pop();
            while (!sorted.isEmpty() && sorted.peek() > x)
                push(sorted.pop());
            sorted.push(x);
        }
        while (!sorted.isEmpty())
            push(sorted.pop());
    }
}
