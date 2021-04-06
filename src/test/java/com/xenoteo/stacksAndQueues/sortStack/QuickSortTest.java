package com.xenoteo.stacksAndQueues.sortStack;

public class QuickSortTest extends SortTest {
    @Override
    protected Sort createSorting() {
        return new QuickSort();
    }
}
