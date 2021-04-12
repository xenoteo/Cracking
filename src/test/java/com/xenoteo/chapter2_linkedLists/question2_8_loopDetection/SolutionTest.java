package com.xenoteo.chapter2_linkedLists.question2_8_loopDetection;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Node head1;
    Node loop1;
    Node head2;
    Node loop2;
    Node head3;
    Node loop3;
    Node head4;

    private final Solution solution;

    public SolutionTest(){
        solution = new Solution();
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        List list1 = new List(head1);
        loop1 = list1.find(5);
        list1.last().next = loop1;

        head2 = generator.generateList(new int[]{4, 8, 7, 2, 1, 9, 8, 6});
        List list2 = new List(head2);
        loop2 = head2;
        list2.last().next = loop2;

        head3 = generator.generateList(new int[]{5, 6, 1, 9, 8, 4, 2, 7});
        List list3 = new List(head3);
        loop3 = list3.last();
        list3.last().next = loop3;

        head4 = generator.generateList(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    @Test
    public void detectLoopWithSetTest(){
        Assert.assertEquals(loop1, solution.detectLoopWithSet(head1));
        Assert.assertEquals(loop2, solution.detectLoopWithSet(head2));
        Assert.assertEquals(loop3, solution.detectLoopWithSet(head3));
        Assert.assertNull(solution.detectLoopWithSet(head4));
    }

    @Test
    public void detectLoopInPlaceTest(){
        Assert.assertEquals(loop1, solution.detectLoopInPlace(head1));
        Assert.assertEquals(loop2, solution.detectLoopInPlace(head2));
        Assert.assertEquals(loop3, solution.detectLoopInPlace(head3));
        Assert.assertNull(solution.detectLoopInPlace(head4));
    }
}
