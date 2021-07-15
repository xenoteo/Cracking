package com.xenoteo.helpers.linked_list;

/**
 * The class generating a linked list having an array of numbers.
 */
public class ListGenerator {

    /**
     * Generates a linked list.
     *
     * @param nums  the array of numbers to make list from
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
