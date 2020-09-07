package com.xenoteo.stacksAndQueues.stackOfPlates;

import com.xenoteo.helpers.fullStackException.FullStackException;
import com.xenoteo.helpers.stack.StackLimited;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Linked list based set of limited stacks.
 * Set of stacks is composed of several stacks
 * and creates a new stack once the previous one exceeds capacity.
 * push() and pop() behave identically to a single stack.
 * Implementing a function popAt(int i) which performs a pop operation on a specific sub-stack.
 * There are also implemented functions pushAt(int i, int x), peekAt(int i) and isEmptyAt(int i).
 * Once created stack exists forever at ihe same index.
 */
public class SetOfStacks implements ISetOfStacks {
    private static final int SIZE = 50;
    private final int size;

    private ArrayList<StackLimited> set;
    private StackLimited currentStack;

    /**
     * Setting default constant value of the size.
     */
    public SetOfStacks(){
        size = SIZE;
        initialize();
    }

    /**
     * Setting provided size.
     * @param size to set.
     */
    public SetOfStacks(int size){
        this.size = size;
        initialize();
    }

    /**
     * Initializing starting values.
     */
    private void initialize(){
        set = new ArrayList<>();
        currentStack = new StackLimited(size);
        set.add(currentStack);
    }

    public void push(int x) {
        if (currentStack.isFull()){
            currentStack = new StackLimited(size);
            set.add(currentStack);
        }
        currentStack.push(x);
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();
        if (currentStack.isEmpty() && set.size() > 1)
            currentStack = set.get(set.indexOf(currentStack) - 1);
        return currentStack.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return currentStack.peek();
    }

    public boolean isEmpty() {
        return set.size() == 1 && currentStack.isEmpty();
    }

    public int popAt(int i) {
        int setSize = set.size();
        if (i < 0 || i >= setSize)
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.pop();
    }

    public int peekAt(int i) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.peek();
    }

    public void pushAt(int i, int x) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isFull())
            throw new FullStackException();
        stack.push(x);
    }

    public boolean isEmptyAt(int i) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        return set.get(i).isEmpty();
    }
}
