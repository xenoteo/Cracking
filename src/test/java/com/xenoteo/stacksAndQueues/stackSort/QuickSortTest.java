package com.xenoteo.stacksAndQueues.stackSort;

public class QuickSortTest extends SortTest {
    @Override
    protected Sort createSorting() {
        return new QuickSort();
    }
}
