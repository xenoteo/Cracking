package com.xenoteo.chapter3_stacks_and_queues.question3_5_sort_stack;

public class InsertionSortWithBuffTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSortWithBuff();
    }
}
