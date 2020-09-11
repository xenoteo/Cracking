package com.xenoteo.stacksAndQueues.stackSort;

import com.xenoteo.helpers.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Sort sort1 = new InsertionSort();
        System.out.println("Sort sort = new InsertionSort();");
        printSorting(sort1);

        Sort sort2 = new InsertionSortWithBuff();
        System.out.println("Sort sort = new InsertionSortWithBuff();");
        printSorting(sort2);

        Sort sort3 = new InsertionSort();
        System.out.println("Sort sort = new MergeSort();");
        printSorting(sort3);

        Sort sort4 = new InsertionSort();
        System.out.println("Sort sort = new QuickSort();");
        printSorting(sort4);
    }

    /**
     * Printing all operations made on stack
     * to demonstrate the sorting of the stack.
     * @param sorting to use
     */
    private static void printSorting(Sort sorting){
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.push(1);
        stack.push(1);
        System.out.println("stack.push(3);\n" +
                "stack.push(5);\n" +
                "stack.push(4);\n" +
                "stack.push(1);\n" +
                "stack.push(1);\n");

        stack = sorting.sort(stack);
        System.out.println("stack = sort.sort(stack);\n");

        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n\n\n", stack.pop());
    }
}
