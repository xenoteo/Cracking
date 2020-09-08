package com.xenoteo.helpers.queue;

public interface IQueue {
    void add(int x);
    int remove();
    int peek();
    boolean isEmpty();
}
