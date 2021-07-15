package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

public class InsertionSortTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSort();
    }
}
