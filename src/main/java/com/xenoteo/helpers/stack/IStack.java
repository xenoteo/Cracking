package com.xenoteo.helpers.stack;

/**
 * Interface for implementing a basic stack.
 */
public interface IStack {
    void push(int x);
    int pop();
    int peek();
    boolean isEmpty();
}
