package com.xenoteo.stacksAndQueues.stackOfPlates;

public class Main {
    public static void main(String[] args) {
        SetOfArrayStacks stack1 = new SetOfArrayStacks(3);
        System.out.println("SetOfArrayStacks stack = new SetOfArrayStacks(3);\n");
        showAction(stack1);

        SetOfStacks stack2 = new SetOfStacks(3);
        System.out.println("SetOfStacks stack = new SetOfStacks(3);\n");
        showAction(stack2);
    }

    /**
     * Performing different tasks using provided tests and showing results in the output.
     * @param stack to test
     */
    private static void showAction(ISetOfStacks stack){
        System.out.printf("stack.isEmpty() = %b\n\n", stack.isEmpty());

        stack.push(5);
        stack.push(4);
        stack.push(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.push(7);
        stack.push(8);

        System.out.println("stack.push(5);\n" +
                "stack.push(4);\n" +
                "stack.push(3);\n" +
                "\n" +
                "stack.push(1);\n" +
                "stack.push(2);\n" +
                "stack.push(3);\n" +
                "\n" +
                "stack.push(7);\n" +
                "stack.push(8);\n");

        System.out.printf("stack.isEmpty() = %b\n\n", stack.isEmpty());

        System.out.printf("stack.peekAt(0) = %d\n", stack.peekAt(0));
        System.out.printf("stack.peekAt(1) = %d\n", stack.peekAt(1));
        System.out.printf("stack.peekAt(2) = %d\n\n", stack.peekAt(2));

        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n", stack.pop());
        System.out.printf("stack.pop() = %d\n\n", stack.pop());

        System.out.printf("stack.popAt(0) = %d\n\n", stack.popAt(0));

        stack.pushAt(2, 10);
        System.out.println("stack.pushAt(2, 10);");
        System.out.printf("stack.isEmptyAt(2) = %b\n", stack.isEmptyAt(2));
        System.out.printf("stack.popAt(2) = %d\n", stack.popAt(2));
        System.out.printf("stack.isEmptyAt(2) = %b\n\n", stack.isEmptyAt(2));
    }
}
