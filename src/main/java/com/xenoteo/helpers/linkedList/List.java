package com.xenoteo.helpers.linkedList;

/**
 * Simple linked list implementation.
 */
public class List {
    /**
     * The head of the list.
     */
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
     * Finds the first node of the given value.
     * Complexity is O(N).
     *
     * @param val  the value to find
     * @return the node of the given value
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
     * Counts the length of the list.
     * Complexity is O(N).
     *
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
     * Reverses the list.
     * Time complexity is O(N), space complexity is O(N).
     *
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

    /**
     * Checks whether list contains a node with the provided reference.
     * Complexity is O(N).
     *
     * @param node  the node to check
     * @return if list contains the node
     */
    public boolean contains(Node node){
        Node cur = head;
        while (cur != null){
            if (cur == node) return true;
            cur = cur.next;
        }
        return false;
    }

    /**
     * Finds the last node of the list.
     * Complexity is O(N).
     *
     * @return the last node of the list
     */
    public Node last(){
        if (head == null) return null;
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        return node;
    }

    /**
     * Finds the kth node of the list.
     * Complexity is O(N).
     *
     * @param k  the index of element to find
     * @return the kth element of the list
     */
    public Node get(int k){
        Node node = head;
        for (int i = 0; i < k; i++){
            if (node == null) return null;
            node = node.next;
        }
        return node;
    }

    /**
     * Generates the string of the list representing each node's reference.
     * Complexity id O(N).
     *
     * @return the string representing nodes references.
     */
    public String referencesToString(){
        Node node = head;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while (node.next != null){
            str.append(node);
            str.append(", ");
            node = node.next;
        }
        str.append(node);
        str.append("]");
        return str.toString();
    }
}
