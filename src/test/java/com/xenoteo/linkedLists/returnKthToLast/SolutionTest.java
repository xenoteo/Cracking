package com.xenoteo.linkedLists.returnKthToLast;

import com.xenoteo.helpers.linkedList.ListGenerator;
import com.xenoteo.helpers.linkedList.Node;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Node head1;
    private Node head2;
    private Node head3;

    public SolutionTest(){
        setLists();
    }

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        head2 = generator.generateList(new int[]{3, 4, 7, 9, 2, 1, 6, 7, 9, 4});
        head3 = generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6, 2});
    }

    @Test
    public void kthToLastTest(){
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.kthToLast(head1, 4).val);
        Assert.assertEquals(1, solution.kthToLast(head1, 9).val);
        Assert.assertEquals(1, solution.kthToLast(head2, 5).val);
        Assert.assertEquals(9, solution.kthToLast(head2, 7).val);
        Assert.assertEquals(6, solution.kthToLast(head3, 2).val);
        Assert.assertEquals(7, solution.kthToLast(head3, 13).val);
    }
}
