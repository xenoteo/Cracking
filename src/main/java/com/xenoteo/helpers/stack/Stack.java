package com.xenoteo.helpers.stack;

import com.xenoteo.helpers.linkedList.Node;

import java.util.EmptyStackException;

/**
 * Simple linked list based stack.
 */
public class Stack implements IStack{
    protected Node last = null;

    public void push(int x){
        last = new Node(x, last);
    }

    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int x = last.val;
        last = last.next;
        return x;
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return last.val;
    }

    public boolean isEmpty(){
        return last == null;
    }
}
