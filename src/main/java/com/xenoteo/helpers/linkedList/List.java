package com.xenoteo.helpers.linkedList;

/**
 * Simple linked list implementation.
 */
public class List {
    public Node head;

    public List(Node node){
        head = node;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof List || obj instanceof Node)) return false;
        Node other;
        if (obj instanceof Node) other = (Node) obj;
        else other = ((List) obj).head;
        Node that = head;
        while (that != null && other != null){
            if (that.val != other.val) return false;
            that = that.next;
            other = other.next;
        }
        return (other == null && that == null);
    }

    public String toString(){
        Node node = head;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (node.next != null){
            stringBuilder.append(node.val);
            stringBuilder.append(", ");
            node = node.next;
        }
        stringBuilder.append(node.val);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /**
     * Finding the first node of given value.
     * Complexity is O(N).
     * @param val to find
     * @return node of given value
     */
    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.val == val) return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Counting the length of the list.
     * Complexity is O(N).
     * @return the length of the list
     */
    public int length(){
        Node node = head;
        int n = 0;
        while (node != null){
            n++;
            node = node.next;
        }
        return n;
    }

    /**
     * Reversing the list.
     * Time complexity is O(N), space complexity is O(N).
     * @return the head of reversed list
     */
    public Node reversed(){
        int[] nums = new int[length()];

        Node node = head;
        for (int i = 0; i < nums.length; i++){
            nums[i] = node.val;
            node = node.next;
        }

        Node tail = null;
        for (int num : nums) {
            Node newNode = new Node(num);
            newNode.next = tail;
            tail = newNode;
        }
        return tail;
    }
}
