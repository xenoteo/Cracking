package com.xenoteo.stacksAndQueues.sortStack;

public class MergeSortTest extends SortTest {
    @Override
    protected Sort createSorting() {
        return new MergeSort();
    }
}
