package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The class implementing merge sort on a stack.
 */
public class MergeSort extends Merging implements Sort {

    @Override
    public Stack sort(Stack stack){
        if (stack.size() < 2)
            return stack;

        // dividing a current stack into two sub-stacks
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
