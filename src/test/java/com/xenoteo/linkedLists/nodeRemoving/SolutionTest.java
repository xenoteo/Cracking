package com.xenoteo.linkedLists.nodeRemoving;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private List list1;
    private List list1Reviewed;
    private List list2;
    private List list2Reviewed;
    private List list3;
    private List list3Reviewed;

    public SolutionTest(){
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        list1 = new List(generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        list1Reviewed = new List(generator.generateList(new int[]{1, 2, 3, 4, 6, 7, 8, 9}));
        list2 = new List(generator.generateList(new int[]{3, 4, 7, 9, 2, 1, 6, 7, 9, 4}));
        list2Reviewed = new List(generator.generateList(new int[]{3, 4, 7, 9, 2, 6, 7, 9, 4}));
        list3 = new List(generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6}));
        list3Reviewed = new List(generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 7, 9, 3, 6}));
    }

    @Test
    public void removeNodeTest(){
        Solution solution = new Solution();

        solution.removeNode(list1.find(5));
        Assert.assertEquals(list1Reviewed, list1);

        solution.removeNode(list2.find(1));
        Assert.assertEquals(list2Reviewed, list2);

        solution.removeNode(list3.find(5));
        Assert.assertEquals(list3Reviewed, list3);
    }
}
