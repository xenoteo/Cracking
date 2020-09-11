package com.xenoteo.stacksAndQueues.stackSort;

public class Main {
    public static void main(String[] args) {
        ISortingStack stack1 = new SortingStack();
        System.out.println("ISortingStack stack = new SortingStack();");
        printSorting(stack1);

        ISortingStack stack2 = new SortingStackWithBuff();
        System.out.println("ISortingStack stack = new SortingStackWithBuff();");
        printSorting(stack2);
    }

    /**
     * Printing all operations made on given stack
     * to demonstrate the sorting of the stack.
     * @param stack to sort
     */
    private static void printSorting(ISortingStack stack){
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

        stack.sort();
        System.out.println("stack.sort();\n");

        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n\n\n", stack.pop());
    }
}
