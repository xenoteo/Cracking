package com.xenoteo.chapter3_stacksAndQueues.question3_5_sortStack;

public class MergeSortTest extends SortTest {
    @Override
    protected Sort createSorting() {
        return new MergeSort();
    }
}
