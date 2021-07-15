package com.xenoteo.chapter3_stacks_and_queues.question3_3_stack_of_plates;

import com.xenoteo.helpers.stack.exceptions.FullStackException;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * The array based set of stacks.
 * Set of stacks is composed of several stacks and creates a new stack once the previous one exceeds capacity.
 *
 * push() and pop() behave identically to a single stack.
 *
 * The stack implements a function popAt(int i) which performs a pop operation on a specific sub-stack.
 * There are also implemented functions pushAt(int i, int x), peekAt(int i) and isEmptyAt(int i).
 *
 * Once created stack exists forever at the same index.
 */
public class SetOfArrayStacks implements ISetOfStacks {

    /**
     * The default capacity of one stack.
     */
    private static final int DEFAULT_SIZE = 50;

    /**
     * The capacity of one stack.
     */
    private final int size;

    /**
     * The set of all stacks except the current.
     */
    private ArrayList<int[]> set;

    /**
     * The list of last indexes of all the stacks except the current.
     */
    private ArrayList<Integer> lasts;

    /**
     * The current stack index.
     */
    private int currentStackIndex;

    /**
     * The current stack.
     */
    private int[] currentStack;

    /**
     * The index of the last element in the current stack.
     */
    private int lastInCurrentStack;

    /**
     * The max index of ever existed stack.
     */
    private int maxExisted;

    /**
     * Constructor setting default constant value of the size of one stack.
     */
    public SetOfArrayStacks(){
        size = DEFAULT_SIZE;
        initialize();
    }

    /**
     * Constructor setting the provided size of one stack.
     *
     * @param size  the capacity of one stack
     */
    public SetOfArrayStacks(int size){
        this.size = size;
        initialize();
    }

    /**
     * Initializes starting values.
     */
    private void initialize(){
        lasts = new ArrayList<>();
        set = new ArrayList<>();
        currentStackIndex = -1;
        maxExisted = -1;
        createNewStack();
    }

    /**
     * Creates the new stack.
     */
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

    @Override
    public void push(int x){
        if (lastInCurrentStack == size - 1)
            createNewStack();
        lastInCurrentStack++;
        currentStack[lastInCurrentStack] = x;
    }

    @Override
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

    @Override
    public int peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return currentStack[lastInCurrentStack];
    }

    @Override
    public boolean isEmpty(){
        return currentStackIndex == -1 || lastInCurrentStack == -1;
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
    public boolean isEmptyAt(int i) {
        if (i == currentStackIndex)
            return isEmpty();
        if (i < 0 || i > maxExisted)
            throw new IndexOutOfBoundsException();
        return lasts.get(i) == -1;
    }
}
