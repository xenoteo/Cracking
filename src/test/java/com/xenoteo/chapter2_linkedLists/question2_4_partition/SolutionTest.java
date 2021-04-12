package com.xenoteo.chapter2_linkedLists.question2_4_partition;

import com.xenoteo.helpers.linkedList.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Node head1;
    private Node head2;
    private Node head3;
    private Node head3Copy1;
    private Node head3Copy2;
    private int len1;
    private int len2;
    private int len3;

    private final Solution solution = new Solution();

    private void setLists(){
        ListGenerator generator = new ListGenerator();
        head1 = generator.generateList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        head2 = generator.generateList(new int[]{3, 4, 7, 9, 2, 1, 6, 7, 9, 4});
        head3 = generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6, 2});
        head3Copy1 = generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6, 2});
        head3Copy2 = generator.generateList(new int[]{7, 7, 7, 4, 3, 2, 1, 9, 6, 5, 7, 9, 3, 6, 2});
        len1 = new List(head1).length();
        len2 = new List(head2).length();
        len3 = new List(head3).length();
    }

    private boolean correctPartition(Node head, int val){
        Node node = head;
        while (node != null && node.val <  val)
            node = node.next;
        while (node != null) {
            if (node.val < val) return false;
            node = node.next;
        }
        return true;
    }

    @Test
    public void partitionTest(){
        setLists();

        Node newHead1 = solution.partition(head1, 6);
        Node newHead2 = solution.partition(head2, 6);
        Node newHead3_1 = solution.partition(head3, 7);
        Node newHead3_2 = solution.partition(head3Copy1, 0);
        Node newHead3_3 = solution.partition(head3Copy2, 20);

        Assert.assertTrue(correctPartition(newHead1, 6));
        Assert.assertEquals(len1, new List(newHead1).length());

        Assert.assertTrue(correctPartition(newHead2, 6));
        Assert.assertEquals(len2, new List(newHead2).length());

        Assert.assertTrue(correctPartition(newHead3_1, 7));
        Assert.assertEquals(len3, new List(newHead3_1).length());

        Assert.assertTrue(correctPartition(newHead3_2, 0));
        Assert.assertEquals(len3, new List(newHead3_2).length());

        Assert.assertTrue(correctPartition(newHead3_3, 20));
        Assert.assertEquals(len3, new List(newHead3_3).length());
    }

    @Test
    public void stablePartitionTest(){
        setLists();

        Node newHead1 = solution.stablePartition(head1, 6);
        Node newHead2 = solution.stablePartition(head2, 6);
        Node newHead3_1 = solution.stablePartition(head3, 7);
        Node newHead3_2 = solution.stablePartition(head3Copy1, 0);
        Node newHead3_3 = solution.stablePartition(head3Copy2, 20);

        Assert.assertTrue(correctPartition(newHead1, 6));
        Assert.assertEquals(len1, new List(newHead1).length());

        Assert.assertTrue(correctPartition(newHead2, 6));
        Assert.assertEquals(len2, new List(newHead2).length());

        Assert.assertTrue(correctPartition(newHead3_1, 7));
        Assert.assertEquals(len3, new List(newHead3_1).length());

        Assert.assertTrue(correctPartition(newHead3_2, 0));
        Assert.assertEquals(len3, new List(newHead3_2).length());

        Assert.assertTrue(correctPartition(newHead3_3, 20));
        Assert.assertEquals(len3, new List(newHead3_3).length());
    }
}
