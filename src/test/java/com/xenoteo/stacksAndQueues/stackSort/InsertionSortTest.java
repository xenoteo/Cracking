package com.xenoteo.stacksAndQueues.stackSort;

public class InsertionSortTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSort();
    }
}
