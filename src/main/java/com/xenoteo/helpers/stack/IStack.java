package com.xenoteo.helpers.stack;

/**
 * The interface for the stack.
 */
public interface IStack {
    void push(int x);
    int pop();
    int peek();
    boolean isEmpty();
}
