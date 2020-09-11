package com.xenoteo.stacksAndQueues.stackSort;

public class SortingStackWithBuffTest extends ISortingStackTest{
    @Override
    protected ISortingStack createStack() {
        return new SortingStackWithBuff();
    }
}
