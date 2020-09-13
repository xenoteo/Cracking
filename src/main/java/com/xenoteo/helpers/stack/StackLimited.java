package com.xenoteo.helpers.stack;

import com.xenoteo.helpers.stack.exceptions.FullStackException;

/**
 * Simple linked list based limited stack.
 * When the stack is full the exception is thrown.
 * The current size of stack is always kept.
 */
public class StackLimited extends Stack{
    private final int capacity;
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

    public boolean isFull(){
        return size == capacity;
    }
}
