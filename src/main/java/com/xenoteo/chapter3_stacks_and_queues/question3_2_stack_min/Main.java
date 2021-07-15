package com.xenoteo.chapter3_stacks_and_queues.question3_2_stack_min;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(1);
        System.out.println("stack.push(3);\n" +
                "stack.push(1);");
        System.out.printf("stack.min() = %d\n", stack.min());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.min() = %d\n", stack.min());
    }
}
