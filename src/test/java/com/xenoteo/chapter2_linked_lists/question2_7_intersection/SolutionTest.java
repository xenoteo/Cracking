package com.xenoteo.chapter2_linked_lists.question2_7_intersection;

import com.xenoteo.helpers.linked_list.List;
import com.xenoteo.helpers.linked_list.ListGenerator;
import com.xenoteo.helpers.linked_list.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Node head1;
    Node head2;
    Node head3;
    Node head4;

    private final Solution solution;

    public SolutionTest(){
        solution = new Solution();
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        head2 = new List(head1).find(5);
        head3 = new List(head1).find(2);
        head4 = generator.generateList(new int[]{2, 6, 7, 9, 4, 3, 2, 1});
    }

    @Test
    public void intersectionNodeInPlaceTest(){
        Assert.assertEquals(head2, solution.intersectionNodeInPlace(head1, head2));
        Assert.assertEquals(head3, solution.intersectionNodeInPlace(head3, head1));
        Assert.assertNull(solution.intersectionNodeInPlace(head3, head4));
        Assert.assertNull(solution.intersectionNodeInPlace(head1, head4));
    }

    @Test
    public void intersectionNodeWithSetTest(){
        Assert.assertEquals(head2, solution.intersectionNodeWithSet(head1, head2));
        Assert.assertEquals(head3, solution.intersectionNodeWithSet(head3, head1));
        Assert.assertNull(solution.intersectionNodeWithSet(head3, head4));
        Assert.assertNull(solution.intersectionNodeWithSet(head1, head4));
    }

    @Test
    public void intersectionNodeOptimalTest(){
        Assert.assertEquals(head2, solution.intersectionNodeOptimal(head1, head2));
        Assert.assertEquals(head3, solution.intersectionNodeOptimal(head3, head1));
        Assert.assertNull(solution.intersectionNodeOptimal(head3, head4));
        Assert.assertNull(solution.intersectionNodeOptimal(head1, head4));
    }
}
