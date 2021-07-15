package com.xenoteo.chapter3_stacks_and_queues.question3_2_stack_min;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

/**
 * The linked list based stack which has a function min returning the minimum element.
 * Push, pop and min operate in 0(1) time.
 * Using additional stack to keep track of minimum elements.
 */
public class Stack extends com.xenoteo.helpers.stack.Stack {
    /**
     * The stack of minimum elements.
     */
    private final Deque<Integer> mins;

    public Stack(){
        mins = new ArrayDeque<>();
    }

    @Override
    public void push(int x){
        if (last == null || x < min())
            mins.push(x);
        super.push(x);
    }

    @Override
    public int pop(){
        int x = super.pop();
        if (x == min())
            mins.pop();
        return x;
    }

    @Override
    public int peek(){
        return super.peek();
    }

    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    /**
     * Returns the minimum element of the stack.
     *
     * @return the minimum element of the stack
     */
    public int min(){
        if (mins.isEmpty())
            throw new EmptyStackException();
        return mins.peek();
    }
}
