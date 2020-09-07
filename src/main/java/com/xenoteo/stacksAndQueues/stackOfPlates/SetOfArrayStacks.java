package com.xenoteo.stacksAndQueues.stackOfPlates;

import com.xenoteo.helpers.fullStackException.FullStackException;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Array based set of stacks.
 * Set of stacks is composed of several stacks
 * and creates a new stack once the previous one exceeds capacity.
 * push() and pop() behave identically to a single stack.
 * Implementing a function popAt(int i) which performs a pop operation on a specific sub-stack.
 * There are also implemented functions pushAt(int i, int x), peekAt(int i) and isEmptyAt(int i).
 * Once created stack exists forever at ihe same index.
 */
public class SetOfArrayStacks implements ISetOfStacks {
    private static final int SIZE = 50;
    private final int size;

    /**
     * Set of all stacks except for the current.
     */
    private ArrayList<int[]> set;
    /**
     * List of last indexes of all the stacks except for current.
     */
    private ArrayList<Integer> lasts;

    private int currentStackIndex;
    private int[] currentStack;
    private int lastInCurrentStack;

    /**
     * Max index of ever existed stack.
     */
    private int maxExisted;

    /**
     * Setting default constant value of the size.
     */
    public SetOfArrayStacks(){
        size = SIZE;
        initialize();
    }

    /**
     * Setting provided size.
     * @param size to set.
     */
    public SetOfArrayStacks(int size){
        this.size = size;
        initialize();
    }

    /**
     * Initializing starting values.
     */
    private void initialize(){
        lasts = new ArrayList<>();
        set = new ArrayList<>();
        currentStackIndex = -1;
        maxExisted = -1;
        createNewStack();
    }

    private void createNewStack(){
        if (currentStackIndex >= 0){
            set.add(currentStackIndex, currentStack);
            lasts.add(currentStackIndex, lastInCurrentStack);
        }
        currentStackIndex++;
        if (currentStackIndex > maxExisted)
            maxExisted = currentStackIndex;
        currentStack = new int[size];
        lastInCurrentStack = -1;

        set.add(currentStackIndex, currentStack);
    }

    public void push(int x){
        if (lastInCurrentStack == size - 1)
            createNewStack();
        lastInCurrentStack++;
        currentStack[lastInCurrentStack] = x;
    }

    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        int x = currentStack[lastInCurrentStack];
        lastInCurrentStack--;
        if (lastInCurrentStack == -1) {
            currentStackIndex--;
            if (currentStackIndex != -1){
                currentStack = set.get(currentStackIndex);
                lastInCurrentStack = lasts.get(currentStackIndex);
                lasts.add(currentStackIndex + 1, -1);
            }
        }
        return x;
    }

    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return currentStack[lastInCurrentStack];
    }

    public boolean isEmpty(){
        return currentStackIndex == -1 || lastInCurrentStack == -1;
    }

    public int popAt(int i){
        if (i == currentStackIndex)
            return pop();
        if (i < 0 || i > maxExisted)
            throw new IndexOutOfBoundsException();
        int last = lasts.get(i);
        if (last == -1)
            throw new EmptyStackException();
        lasts.set(i, last - 1);
        return set.get(i)[last];
    }

    public int peekAt(int i) {
        if (i == currentStackIndex)
            return peek();
        if (i < 0 || i > maxExisted)
            throw new IndexOutOfBoundsException();
        int last = lasts.get(i);
        if (last == -1)
            throw new EmptyStackException();
        return set.get(i)[last];
    }

    public void pushAt(int i, int x) {
        if (i == currentStackIndex)
            push(x);
        if (i < 0 || i > maxExisted)
            throw new IndexOutOfBoundsException();
        int last = lasts.get(i);
        if (last == size - 1)
            throw new FullStackException();
        last++;
        set.get(i)[last] = x;
        lasts.set(i, last);
    }

    public boolean isEmptyAt(int i) {
        if (i == currentStackIndex)
            return isEmpty();
        if (i < 0 || i > maxExisted)
            throw new IndexOutOfBoundsException();
        return lasts.get(i) == -1;
    }
}
