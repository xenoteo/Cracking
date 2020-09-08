package com.xenoteo.helpers.queue;

import com.xenoteo.helpers.emptyQueueException.EmptyQueueException;
import org.junit.Assert;
import org.junit.Test;

public abstract class IQueueTest {

    abstract protected IQueue createAndFillQueue();

    protected void fillQueue(IQueue queue){
        queue.add(6);
        queue.add(7);
        queue.add(5);
        queue.add(4);
        queue.add(2);
    }

    @Test(expected = EmptyQueueException.class)
    public void addAndRemoveTest(){
        IQueue queue = createAndFillQueue();
        Assert.assertEquals(6, queue.remove());
        Assert.assertEquals(7, queue.remove());
        Assert.assertEquals(5, queue.remove());
        Assert.assertEquals(4, queue.remove());
        Assert.assertEquals(2, queue.remove());
        queue.remove();
    }

    @Test(expected = EmptyQueueException.class)
    public void addRemoveAndPeekTest(){
        IQueue queue = createAndFillQueue();
        Assert.assertEquals(6, queue.peek());
        queue.remove();
        Assert.assertEquals(7, queue.peek());
        queue.remove();
        Assert.assertEquals(5, queue.peek());
        queue.remove();
        Assert.assertEquals(4, queue.peek());
        queue.remove();
        Assert.assertEquals(2, queue.peek());
        queue.remove();
        queue.peek();
    }

    @Test
    public void addRemoveAndIsEmptyTest(){
        IQueue queue = createAndFillQueue();
        Assert.assertFalse(queue.isEmpty());
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        Assert.assertTrue(queue.isEmpty());
    }
}
