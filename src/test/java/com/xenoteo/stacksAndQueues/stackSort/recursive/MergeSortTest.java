package com.xenoteo.stacksAndQueues.stackSort.recursive;

public class MergeSortTest extends IRecursiveSortTest {

    @Override
    protected Sort createSorting() {
        return new MergeSort();
    }
}
