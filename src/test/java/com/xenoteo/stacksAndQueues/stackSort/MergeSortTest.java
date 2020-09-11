package com.xenoteo.stacksAndQueues.stackSort;

public class MergeSortTest extends SortTest {
    @Override
    protected Sort createSorting() {
        return new MergeSort();
    }
}
