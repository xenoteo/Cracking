package com.xenoteo.stacksAndQueues.sortStack;

public class InsertionSortWithBuffTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSortWithBuff();
    }
}
