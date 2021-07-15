package com.xenoteo.chapter3_stacks_and_queues.question3_4_queue_via_stacks;

import com.xenoteo.helpers.queue.exceptions.EmptyQueueException;
import com.xenoteo.helpers.queue.IQueue;
import com.xenoteo.helpers.stack.Stack;

/**
 * The class implementing a queue using two stacks.
 * isEmpty() and add() operations take O(1) time, remove() and peek() take O(N) time.
 */
public class Queue implements IQueue {
    /**
     * The main stack.
     */
    private final Stack main;
    /**
     * The buffer stack.
     */
    private final Stack buffer;

    public Queue(){
        main = new Stack();
        buffer = new Stack();
    }

    @Override
    public void add(int x) {
        main.push(x);
    }

    @Override
    public int remove() {
        if (main.isEmpty())
            throw new EmptyQueueException();
        while (!main.isEmpty())
            buffer.push(main.pop());
        int x = buffer.pop();
        while (!buffer.isEmpty())
            main.push(buffer.pop());
        return x;
    }

    @Override
    public int peek() {
        if (main.isEmpty())
            throw new EmptyQueueException();
        while (!main.isEmpty())
            buffer.push(main.pop());
        int x = buffer.peek();
        while (!buffer.isEmpty())
            main.push(buffer.pop());
        return x;
    }

    @Override
    public boolean isEmpty() {
        return main.isEmpty();
    }
}
