package com.xenoteo.chapter3_stacks_and_queues.question3_1_three_in_one;

import java.util.EmptyStackException;

/**
 * The class implementing three stacks using a single array.
 */
public class Stack {
    /**
     * The default size of the stack.
     */
    private static final int DEFAULT_SIZE = 100;
    /**
     * The current size of the stack.
     */
    private int size;
    /**
     * The array representing three stacks.
     */
    private int[] stack;
    /**
     * The first indexes of each of the stacks.
     */
    private int[] firsts;
    /**
     * The last indexes of each of the stacks.
     */
    private int[] lasts;

    /**
     * Constructor allocating array of the default constant size.
     */
    public Stack(){
        size = DEFAULT_SIZE;
        setUpData();
    }

    /**
     * Constructor allocating array of the given size.
     */
    Stack(int size){
        this.size = size;
        setUpData();
    }

    /**
     * Allocates memory for all arrays and sets up initial values.
     */
    private void setUpData(){
        stack = new int[size];
        firsts = new int[3];
        lasts = new int[3];
        firsts[1] = size / 3;
        firsts[2] = 2 * size / 3;
        lasts[0] = firsts[0] - 1;
        lasts[1] = firsts[1] - 1;
        lasts[2] = firsts[2] - 1;
    }

    /**
     * Pushes the element x to the stack of the given number.
     *
     * If there is no more free space, new larger stack allocated.
     *
     * @param x  the element to push
     * @param stackNum  the stack's number
     */
    public void push(int x, int stackNum){
        stackNum--;
        if ((stackNum < 2 && lasts[stackNum] >= firsts[stackNum + 1])
            || (stackNum == 2 && lasts[stackNum] >= size))
            resize();
        lasts[stackNum]++;
        stack[lasts[stackNum]] = x;
    }

    /**
     * Pops the element from the stack of the given number (with removing).
     *
     * @param stackNum  the stack's number
     * @return the last element of the stack of the given number
     */
    public int pop(int stackNum){
        if (!isEmpty(stackNum)){
            stackNum--;
            int x = stack[lasts[stackNum]];
            lasts[stackNum]--;
            return x;
        }
        else throw new EmptyStackException();
    }

    /**
     * Peeks an element from the stack of the given number (without removing).
     *
     * @param stackNum  the stack's number
     * @return the last element of the stack of the given number
     */
    public int peek(int stackNum){
        stackNum--;
        if (!isEmpty(stackNum + 1)) return stack[lasts[stackNum]];
        else throw new EmptyStackException();
    }

    /**
     * Checks if a stack of the given number is empty.
     *
     * @param stackNum  the stack's number
     * @return is the stack of the given number empty
     */
    public boolean isEmpty(int stackNum){
        stackNum--;
        return lasts[stackNum] < firsts[stackNum];
    }

    /**
     * Allocates memory for a new stack of doubled size
     * and copies all elements to the new array to their new indexes.
     */
    private void resize(){
        size *= 2;
        int[] newStack = new int[size];
        int[] newFirsts = new int[3];
        int[] newLasts = new int[3];

        newFirsts[1] = size / 3;
        newFirsts[2] = 2 * size / 3;

        newLasts[0] = lasts[0];
        newLasts[1] = lasts[1] - firsts[1] + newFirsts[1];
        newLasts[2] = lasts[2] - firsts[2] + newFirsts[2];

        copy(newStack, firsts[0], lasts[0], newFirsts[0]);
        copy(newStack, firsts[1], lasts[1], newFirsts[1]);
        copy(newStack, firsts[2], lasts[2], newFirsts[2]);

        stack = newStack;
        firsts = newFirsts;
        lasts = newLasts;
    }

    /**
     * Copies all elements from the old stack to the new stack.
     *
     * @param newStack  the new stack write elements to
     * @param first  the index to start copying from the old stack from
     * @param last  the index to stop copying from the old stack
     * @param newFirst  the index to start writing elements to the new stack from
     */
    private void copy(int[] newStack, int first, int last, int newFirst){
        int k = newFirst;
        for (int i = first; i <= last; i++){
            newStack[k] = stack[i];
            k++;
        }
    }

    /**
     * Converts the stacks to string.
     *
     * @return the string representing all stacks
     */
    public String toString(){
        return String.valueOf(
                stackToString(1)) +
                stackToString(2) +
                stackToString(3);
    }

    /**
     * Converts the stack of the given number to string
     * @param stackNum  the stack's number
     * @return the string representing the stack of the given number
     */
    private StringBuilder stackToString(int stackNum){
        if (isEmpty(stackNum)) return new StringBuilder("[]\n");
        stackNum--;
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = firsts[stackNum]; i < lasts[stackNum]; i++){
            str.append(stack[i]);
            str.append(", ");
        }
        str.append(stack[lasts[stackNum]]);
        str.append("]\n");
        return str;
    }

}
