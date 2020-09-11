package com.xenoteo.stacksAndQueues.stackSort;

public class InsertionSortWithBuffTest extends SortTest{
    @Override
    protected Sort createSorting() {
        return new InsertionSortWithBuff();
    }
}
