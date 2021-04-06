package com.xenoteo.stacksAndQueues.sortStack;

public class InsertionSortTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSort();
    }
}
