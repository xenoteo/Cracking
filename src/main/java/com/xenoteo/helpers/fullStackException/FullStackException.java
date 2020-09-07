package com.xenoteo.helpers.fullStackException;

/**
 * Exception thrown while the stack of limited capacity is full.
 */
public class FullStackException extends RuntimeException {
    public FullStackException(){
        super();
    }

    public FullStackException(String msg){
        super(msg);
    }
}
