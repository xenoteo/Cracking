package com.xenoteo.stacksAndQueues.stackMin;

import com.xenoteo.helpers.linkedList.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

/**
 * Linked list based stack which has a function min returning the minimum element.
 * Push, pop and min operate in 0(1) time.
 * Using additional stack to keep track of minimum elements.
 */
public class Stack {
    private Node last = null;
    private final Deque<Integer> mins;

    public Stack(){
        mins = new ArrayDeque<>();
    }

    public void push(int x){
        Node node = new Node(x, last);
        if (last == null || x < min())
            mins.push(x);
        last = node;
    }

    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int x = last.val;
        if (x == min())
            mins.pop();
        last = last.next;
        return x;
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return last.val;
    }

    public int min(){
        if (mins.isEmpty())
            throw new EmptyStackException();
        return mins.peek();
    }

    public boolean isEmpty(){
        return last == null;
    }
}
