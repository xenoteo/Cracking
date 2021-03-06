package com.xenoteo.stacksAndQueues.queueViaStacks;

import com.xenoteo.helpers.queue.exceptions.EmptyQueueException;
import com.xenoteo.helpers.queue.IQueue;
import com.xenoteo.helpers.stack.Stack;

/**
 * Implementing a queue using two stacks.
 * isEmpty() and add() operations take O(1) time,
 * remove() and peek() take O(N) time.
 */
public class Queue implements IQueue {
    private final Stack main;
    private final Stack buffer;

    public Queue(){
        main = new Stack();
        buffer = new Stack();
    }

    public void add(int x) {
        main.push(x);
    }

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

    public boolean isEmpty() {
        return main.isEmpty();
    }
}
