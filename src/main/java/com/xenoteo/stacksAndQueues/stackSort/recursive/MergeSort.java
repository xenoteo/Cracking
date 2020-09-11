package com.xenoteo.stacksAndQueues.stackSort.recursive;

import com.xenoteo.helpers.stack.Stack;

/**
 * Implementing merge sort on a stack.
 */
public class MergeSort implements Sort {
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

    /**
     * Merging two stacks without any additional space.
     * Time complexity is O(N^2), space complexity is O(1).
     * @param stack1 is the first stack
     * @param stack2 is the second stack
     * @return merged stack
     */
    private Stack merge(Stack stack1, Stack stack2){
        if (stack2 == null || stack2.size() < 1) return stack1;
        if (stack1 == null || stack1.size() < 1) return stack2;

        while (!stack1.isEmpty()){
            int x = stack1.pop();
            while (!stack2.isEmpty() && stack2.peek() < x)
                stack1.push(stack2.pop());
            stack2.push(x);
        }
        return stack2;
    }

    /**
     * Merging two stacks with a third buffer stack.
     * Time complexity is O(N), space complexity is O(N).
     * @param stack1 is the first stack
     * @param stack2 is the second stack
     * @return merged stack
     */
    private Stack mergeWithBuff(Stack stack1, Stack stack2){
        Stack buff = new Stack();
        while (!stack1.isEmpty() && !stack2.isEmpty()){
            if (stack1.peek() < stack2.peek())
                buff.push(stack1.pop());
            else
                buff.push(stack2.pop());
        }
        while (!stack1.isEmpty())
            buff.push(stack1.pop());
        while (!stack2.isEmpty())
            buff.push(stack2.pop());

        // reversing a stack
        while (!buff.isEmpty())
            stack1.push(buff.pop());
        return stack1;
    }
}
