package com.xenoteo.linkedLists.palindrome;

import com.xenoteo.helpers.linkedList.List;
import com.xenoteo.helpers.linkedList.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Checking if a linked list is a palindrome.
 */
public class Solution {
    /**
     * Boolean variable for recursive approach.
     */
    private boolean isPalindrome = true;

    /**
     * Checking if a linked list is a palindrome
     * using comparison of original and reversed linked list.
     * Time complexity is O(N), space complexity is O(N).
     * @param head of the list
     * @return if the list is a palindrome
     */
    public boolean isPalindromeReversed(Node head){
        List list = new List(head);
        return list.equals(list.reversed());
    }

    /**
     * Checking if a linked list is a palindrome using stack.
     * The first half of the list is pushed to the stack (in reversed order,
     * and then it is compared to the second half if the list using popped elements.
     * Time complexity is O(N), space complexity is O(N).
     * @param head of the list
     * @return if the list is a palindrome
     */
    public boolean isPalindromeWithStack(Node head){
        Node slow = head;
        Node fast = head;
        Deque<Integer> stack = new ArrayDeque<>();
        // pushing the first half to the stack
        while (fast.next != null && fast.next.next != null){
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next != null) // if the length is even
            stack.push(slow.val);

        // checking whether the first reversed half is equal to the second half
        slow = slow.next;
        while (slow != null){
            if (slow.val != stack.pop()) return false;
            slow = slow.next;
        }

        return true;
    }

    /**
     * Checking if a linked list is a palindrome using recursion.
     * Complexity is O(N).
     * @param head of the list
     * @return if the list is a palindrome
     */
    public boolean isPalindromeRecursive(Node head){
        isPalindrome = true;
        int len = new List(head).length();
        compare(head, len);
        return isPalindrome;
    }

    /**
     * Recursive comparison of ith and (length - i)th element of the list.
     * The length of the list is used to find the middle of the list.
     * Using global variable to store current information about palindrome.
     * @param node to be compared to its "mirror"
     * @param length of the list ("at the moment")
     * @return "mirror" to the next node
     */
    private Node compare(Node node, int length) {
        // leaving isPalindrome true
        if (node == null || length == 0)    // if length is even
            return node;
        if (length == 1 )                   // if length is odd
            return node.next;

        Node mirror = compare(node.next, length - 2);
        if (mirror == null)
            return null;
        if (isPalindrome)
            isPalindrome = (node.val == mirror.val);
        return mirror.next;
    }

    /**
     * Checking if a linked list is a palindrome
     * using comparison of the first half and reversed second half of the list,
     * without using of helper methods.
     * Time complexity is O(N), space complexity is O(N).
     * @param head of the list
     * @return if the list is a palindrome
     */
    public boolean isPalindromeHalfReversed(Node head){
        // finding the middle node
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) // if length is even, move to the second middle node
            slow = slow.next;

        Node breakPoint = slow; // where stop comparison of two halves

        // reversing the second half
        Node last = null;
        while (slow != null){
            Node next = slow.next;
            slow.next = last;
            last = slow;
            slow = next;
        }

        // comparing two halves
        while (last != null && head != breakPoint) {
            if (last.val != head.val) return false;
            last = last.next;
            head = head.next;
        }
        return true;
    }
}
