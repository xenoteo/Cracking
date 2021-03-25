package com.xenoteo.stacksAndQueues.queueViaStacks;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(9);
        queue.add(8);
        queue.add(5);
        System.out.println("""
                queue.add(1);
                queue.add(9);
                queue.add(8);
                queue.add(5);
                """);
        System.out.printf("queue.isEmpty() = %b\n\n", queue.isEmpty());
        System.out.printf("queue.peek() = %d\n", queue.peek());
        System.out.printf("queue.remove() = %d\n", queue.remove());
        System.out.printf("queue.peek() = %d\n", queue.peek());
        System.out.printf("queue.remove() = %d\n", queue.remove());
        System.out.printf("queue.peek() = %d\n", queue.peek());
        System.out.printf("queue.remove() = %d\n", queue.remove());
        System.out.printf("queue.peek() = %d\n", queue.peek());
        System.out.printf("queue.remove() = %d\n\n", queue.remove());
        System.out.printf("queue.isEmpty() = %b\n", queue.isEmpty());
    }
}
