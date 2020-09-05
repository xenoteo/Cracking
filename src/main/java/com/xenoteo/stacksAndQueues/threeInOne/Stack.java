package com.xenoteo.stacksAndQueues.threeInOne;

import java.util.EmptyStackException;

/**
 * Implementing three stacks using a single array.
 */
public class Stack {
    private static final int SIZE = 100;
    /**
     * Current size of the stack.
     */
    private int size;
    /**
     * Array representing three stacks.
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
     * Allocating array of default constant size.
     */
    public Stack(){
        size = SIZE;
        setData();
    }

    /**
     * Allocating array of a given size.
     */
    Stack(int size){
        this.size = size;
        setData();
    }

    /**
     * Allocating memory for all arrays and setting initial values.
     */
    private void setData(){
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
     * Pushing the element x to the stack of given number.
     * If there is no more free space, new larger stack allocated.
     * @param x is an element to push
     * @param stackNum is the stack's number
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
     * Popping an element from the stack of a given number (with removing).
     * @param stackNum is the stack's number
     * @return the last element of the stack of a given number
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
     * Peeking an element from the stack of a given number (without removing).
     * @param stackNum is the stack's number
     * @return the last element of the stack of a given number
     */
    public int peek(int stackNum){
        stackNum--;
        if (!isEmpty(stackNum + 1)) return stack[lasts[stackNum]];
        else throw new EmptyStackException();
    }

    /**
     * Checking if a stack of given number is empty.
     * @param stackNum is the stack's number
     * @return is the stack of given number empty
     */
    public boolean isEmpty(int stackNum){
        stackNum--;
        return lasts[stackNum] < firsts[stackNum];
    }

    /**
     * Allocating memory for new stack of doubled size
     * and copying all elements to the new array to their new indexes.
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
     * Copying all elements from the old stack to new stack.
     * @param newStack to write elements to
     * @param first is an index to start copying from the old stack from
     * @param last is an index to stop copying from the old stack
     * @param newFirst is an index to start writing elements to new stack from
     */
    private void copy(int[] newStack, int first, int last, int newFirst){
        int k = newFirst;
        for (int i = first; i <= last; i++){
            newStack[k] = stack[i];
            k++;
        }
    }

    /**
     * Converting the stacks to string.
     * @return a string representing all stacks
     */
    public String toString(){
        return String.valueOf(
                stackToString(1)) +
                stackToString(2) +
                stackToString(3);
    }

    /**
     * Converting the stack of given number to string
     * @param stackNum is the stack's number
     * @return stack's string
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
