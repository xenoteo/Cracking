package com.xenoteo.linkedLists.duplicatesRemoving;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private List list1;
    private List list1WithoutDups;
    private List list2;
    private List list2WithoutDups;
    private List list3;
    private List list3WithoutDups;

    private final ListGenerator generator;
    private final Solution solution;

    public SolutionTest(){
        generator = new ListGenerator();
        solution = new Solution();
        setLists();
    }

    private void setLists(){
        list1 = new List(generator.generateList(new int[]{1, 2, 3, 3, 4, 4, 5, 5}));
        list1WithoutDups = new List(generator.generateList(new int[]{1, 2, 3, 4, 5}));
        list2 = new List(generator.generateList(new int[]{9, 5, 8, 3, 2, 5, 6, 8, 2, 1, 8}));
        list2WithoutDups = new List(generator.generateList(new int[]{9, 5, 8, 3, 2, 6, 1}));
        list3 = new List(generator.generateList(new int[]{3, 3, 5, 6, 7, 7, 9, 3, 2, 2, 1}));
        list3WithoutDups = new List(generator.generateList(new int[]{3, 5, 6, 7, 9, 2, 1}));
    }

    @Test
    public void removeDuplicatesWithSetTest(){
        Assert.assertTrue(list1WithoutDups.equals(solution.removeDuplicatesWithSet(list1.head)));
        Assert.assertTrue(list2WithoutDups.equals(solution.removeDuplicatesWithSet(list2.head)));
        Assert.assertTrue(list3WithoutDups.equals(solution.removeDuplicatesWithSet(list3.head)));
    }

    @Test
    public void removeDuplicatesInPlaceTest(){
        Assert.assertTrue(list1WithoutDups.equals(solution.removeDuplicatesInPlace(list1.head)));
        Assert.assertTrue(list2WithoutDups.equals(solution.removeDuplicatesInPlace(list2.head)));
        Assert.assertTrue(list3WithoutDups.equals(solution.removeDuplicatesInPlace(list3.head)));
    }

}
