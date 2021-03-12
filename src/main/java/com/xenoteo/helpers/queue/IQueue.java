package com.xenoteo.helpers.queue;

/**
 * The interface for the queue.
 */
public interface IQueue {
    void add(int x);
    int remove();
    int peek();
    boolean isEmpty();
}
