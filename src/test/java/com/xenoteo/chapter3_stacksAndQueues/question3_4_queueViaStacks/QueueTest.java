package com.xenoteo.chapter3_stacksAndQueues.question3_4_queueViaStacks;

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
