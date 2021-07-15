package com.xenoteo.chapter3_stacks_and_queues.question3_4_queue_via_stacks;

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
