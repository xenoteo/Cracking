package com.xenoteo.stacksAndQueues.stackMin;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

/**
 * Linked list based stack which has a function min returning the minimum element.
 * Push, pop and min operate in 0(1) time.
 * Using additional stack to keep track of minimum elements.
 */
public class Stack extends com.xenoteo.helpers.stack.Stack {
    private final Deque<Integer> mins;

    public Stack(){
        mins = new ArrayDeque<>();
    }

    public void push(int x){
        if (last == null || x < min())
            mins.push(x);
        super.push(x);
    }

    public int pop(){
        int x = super.pop();
        if (x == min())
            mins.pop();
        return x;
    }

    public int peek(){
        return super.peek();
    }

    public int min(){
        if (mins.isEmpty())
            throw new EmptyStackException();
        return mins.peek();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }
}
