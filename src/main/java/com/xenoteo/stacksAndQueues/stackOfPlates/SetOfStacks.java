package com.xenoteo.stacksAndQueues.stackOfPlates;

import com.xenoteo.helpers.stack.exceptions.FullStackException;
import com.xenoteo.helpers.stack.StackLimited;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Linked list based set of limited stacks.
 * Set of stacks is composed of several stacks and creates a new stack once the previous one exceeds capacity.
 *
 * push() and pop() behave identically to a single stack.
 *
 * The stack implements a function popAt(int i) which performs a pop operation on a specific sub-stack.
 * There are also implemented functions pushAt(int i, int x), peekAt(int i) and isEmptyAt(int i).
 *
 * Once created stack exists forever at ihe same index.
 */
public class SetOfStacks implements ISetOfStacks {

    /**
     * The default capacity of one stack.
     */
    private static final int DEFAULT_SIZE = 50;

    /**
     * The capacity of one stack.
     */
    private final int size;

    /**
     * The list of all stacks.
     */
    private ArrayList<StackLimited> set;

    /**
     * The current stack.
     */
    private StackLimited currentStack;

    /**
     * Constructor setting default constant value of the size of one stack.
     */
    public SetOfStacks(){
        size = DEFAULT_SIZE;
        initialize();
    }

    /**
     * Constructor setting the provided size of one stack.
     *
     * @param size  the capacity of one stack
     */
    public SetOfStacks(int size){
        this.size = size;
        initialize();
    }

    /**
     * Initializes starting values.
     */
    private void initialize(){
        set = new ArrayList<>();
        currentStack = new StackLimited(size);
        set.add(currentStack);
    }

    @Override
    public void push(int x) {
        if (currentStack.isFull()){
            currentStack = new StackLimited(size);
            set.add(currentStack);
        }
        currentStack.push(x);
    }

    @Override
    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();
        if (currentStack.isEmpty() && set.size() > 1)
            currentStack = set.get(set.indexOf(currentStack) - 1);
        return currentStack.pop();
    }

    @Override
    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return currentStack.peek();
    }

    @Override
    public boolean isEmpty() {
        return set.size() == 1 && currentStack.isEmpty();
    }

    @Override
    public int popAt(int i) {
        int setSize = set.size();
        if (i < 0 || i >= setSize)
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.pop();
    }

    @Override
    public int peekAt(int i) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isEmpty())
            throw new EmptyStackException();
        return stack.peek();
    }

    @Override
    public void pushAt(int i, int x) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        StackLimited stack = set.get(i);
        if (stack.isFull())
            throw new FullStackException();
        stack.push(x);
    }

    @Override
    public boolean isEmptyAt(int i) {
        if (i < 0 || i >= set.size())
            throw new IndexOutOfBoundsException();
        return set.get(i).isEmpty();
    }
}
