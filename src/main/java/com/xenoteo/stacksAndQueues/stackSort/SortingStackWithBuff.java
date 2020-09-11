package com.xenoteo.stacksAndQueues.stackSort;

import com.xenoteo.helpers.stack.Stack;

/**
 * Stack implementing stack sort such that the smallest items are on the top,
 * without copying the elements into any other data structure.
 * Two additional stacks used.
 * Complexity of sort is O(N^2).
 */
public class SortingStackWithBuff extends Stack implements ISortingStack{
    private final Stack sorted;
    private final Stack buff;

    public SortingStackWithBuff(){
        sorted = new Stack();
        buff = new Stack();
    }

    public void sort(){
        while (!isEmpty()){
            int x = pop();
            while (!sorted.isEmpty() && sorted.peek() > x)
                buff.push(sorted.pop());
            sorted.push(x);
            while (!buff.isEmpty())
                sorted.push(buff.pop());
        }
        while (!sorted.isEmpty())
            push(sorted.pop());
    }
}
