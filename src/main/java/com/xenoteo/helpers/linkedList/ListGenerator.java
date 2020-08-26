package com.xenoteo.helpers.linkedList;

/**
 * Generating a linked list having an array of numbers.
 */
public class ListGenerator {

    /**
     * Generating a linked list.
     * @param nums is an array of numbers to make list from
     * @return the head of the generated list
     */
    public Node generateList(int[] nums){
        Node last = new Node(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--){
            last = new Node(nums[i], last);
        }
        return last;
    }
}
