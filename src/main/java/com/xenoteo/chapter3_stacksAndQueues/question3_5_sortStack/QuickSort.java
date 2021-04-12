package com.xenoteo.chapter3_stacksAndQueues.question3_5_sortStack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The class implementing quick sort on a stack.
 *
 * Complexity is O(N^2).
 */
public class QuickSort extends Merging implements Sort {

    @Override
    public Stack sort(Stack stack) {
        if (stack == null || stack.size() < 2)
            return stack;

        // partition of a stack by its first element (pivot)
        Stack lesser = new Stack();
        Stack greater = new Stack();
        int pivot = stack.pop();
        greater.push(pivot);
        while (!stack.isEmpty()){
            int x = stack.pop();
            if (x < pivot)
                lesser.push(x);
            else
                greater.push(x);
        }

        // need to check if the pivot will not be the same on the next call, as it may cause stack overflow.
        // if pivot is the same we try to change it.
        // if we cannot change a pivot then the stack is already sorted
        boolean toSort = true;
        if (greater.peek() == pivot)
            toSort = changePivot(pivot, greater);
        if (toSort)
            return merge(
                    sort(lesser),
                    sort(greater)
            );
        return merge(
                sort(lesser),
                greater
        );
    }

    /**
     * Changes the first element of a stack to not to cause a stack overflow error.
     *
     * @param pivot  the pivot to change
     * @param stack  the stack to change a pivot
     * @return if the pivot changing was successful
     */
    private boolean changePivot(int pivot, Stack stack){
        Stack buff = new Stack();
        while (!stack.isEmpty() && stack.peek() == pivot)
            buff.push(stack.pop());
        if (stack.isEmpty()){
            while (!buff.isEmpty())
                stack.push(buff.pop());
            return false;
        }
        int newPivot = stack.pop();
        while (!buff.isEmpty())
            stack.push(buff.pop());
        stack.push(newPivot);
        return true;
    }
}
