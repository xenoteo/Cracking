package com.xenoteo.helpers.stack;

import com.xenoteo.helpers.linked_list.Node;

import java.util.EmptyStackException;

/**
 * A simple linked list based stack.
 */
public class Stack implements IStack{
    /**
     * The top element of the stack.
     */
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

    public int size() {
        int count = 0;
        Node node = last;
        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }
}
