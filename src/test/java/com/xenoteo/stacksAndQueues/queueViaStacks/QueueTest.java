package com.xenoteo.stacksAndQueues.queueViaStacks;

import com.xenoteo.helpers.queue.IQueue;
import com.xenoteo.helpers.queue.IQueueTest;

public class QueueTest extends IQueueTest {

    @Override
    protected IQueue createAndFillQueue() {
        Queue queue = new Queue();
        fillQueue(queue);
        return queue;
    }
}
