package com.xenoteo.stacksAndQueues.threeInOne;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1, 1);
        stack.push(2, 1);
        stack.push(3, 1);
        stack.push(2, 2);
        stack.push(4, 2);
        stack.push(6, 3);
        stack.push(7, 3);
        stack.push(8, 3);
        stack.push(9, 3);
        System.out.println("stack.push(1, 1);\n" +
                "stack.push(2, 1);\n" +
                "stack.push(3, 1);\n\n" +
                "stack.push(2, 2);\n" +
                "stack.push(4, 2);\n\n" +
                "stack.push(6, 3);\n" +
                "stack.push(7, 3);\n" +
                "stack.push(8, 3);\n" +
                "stack.push(9, 3);\n");
        System.out.printf("stack.pop(1) = %d\n", stack.pop(1));
        System.out.printf("stack.peek(1) = %d\n\n", stack.peek(1));
        System.out.printf("stack.pop(3) = %d\n", stack.pop(3));
        System.out.printf("stack.peek(3) = %d\n", stack.peek(3));
        System.out.printf("stack.isEmpty(3) = %b\n\n", stack.isEmpty(3));
        System.out.printf("stack.pop(2) = %d\n", stack.pop(2));
        System.out.printf("stack.pop(2) = %d\n", stack.pop(2));
        System.out.printf("stack.isEmpty(2) = %b\n\n", stack.isEmpty(2));

        System.out.printf("stacks:\n%s", stack);
    }
}
