package com.xenoteo.helpers.stack;

import com.xenoteo.helpers.stack.exceptions.FullStackException;

/**
 * A simple linked list based limited stack.
 * When the stack is full the exception is thrown.
 * The current size of stack is always kept.
 */
public class StackLimited extends Stack{
    /**
     * The max capacity of the stack.
     */
    private final int capacity;
    /**
     * The current size of the stack.
     */
    private int size;

    public StackLimited(int capacity){
        this.capacity = capacity;
        size = 0;
    }

    @Override
    public void push(int x){
        if (size == capacity)
            throw new FullStackException();
        size++;
        super.push(x);
    }

    @Override
    public int pop(){
        size--;
        return super.pop();
    }

    /**
     * Checks whether the stack is full.
     *
     * @return whether the stack is full
     */
    public boolean isFull(){
        return size == capacity;
    }
}
