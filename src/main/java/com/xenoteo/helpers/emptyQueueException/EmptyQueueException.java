package com.xenoteo.helpers.emptyQueueException;

/**
 * Exception thrown while the queue is empty.
 */
public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(){
        super();
    }

    public EmptyQueueException(String msg){
        super(msg);
    }
}
