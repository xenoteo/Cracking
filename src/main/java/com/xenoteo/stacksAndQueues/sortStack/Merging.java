package com.xenoteo.stacksAndQueues.sortStack;

import com.xenoteo.helpers.stack.Stack;

/**
 * The abstract class implementing merging operations on stacks.
 */
public abstract class Merging {
    /**
     * Merges two stacks without use of any additional space.
     *
     * Time complexity is O(N^2), space complexity is O(1).
     *
     * @param stack1  the first stack
     * @param stack2 the second stack
     * @return the merged stack
     */
    protected Stack merge(Stack stack1, Stack stack2){
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
     * Merges two stacks with a third buffer stack.
     *
     * Time complexity is O(N), space complexity is O(N).
     *
     * @param stack1  the first stack
     * @param stack2  the second stack
     * @return the merged stack
     */
    protected Stack mergeWithBuff(Stack stack1, Stack stack2){
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
