package com.xenoteo.stacksAndQueues.stackSort;

import com.xenoteo.helpers.stack.Stack;

/**
 * Implementing merge sort on a stack.
 */
public class MergeSort extends Merging implements Sort {
    public Stack sort(Stack stack){
        if (stack.size() < 2)
            return stack;

        // dividing a current stack into two substacks
        Stack first = new Stack();
        Stack second = new Stack();
        int n = 0;
        while (!stack.isEmpty()){
            if (n % 2 == 1)
                first.push(stack.pop());
            else
                second.push(stack.pop());
            n++;
        }

        return mergeWithBuff(
                sort(first),
                sort(second)
        );
    }
}
