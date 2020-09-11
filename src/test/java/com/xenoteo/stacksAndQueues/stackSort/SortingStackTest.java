package com.xenoteo.stacksAndQueues.stackSort;

public class SortingStackTest extends ISortingStackTest{
    @Override
    protected ISortingStack createStack() {
        return new SortingStack();
    }
}
