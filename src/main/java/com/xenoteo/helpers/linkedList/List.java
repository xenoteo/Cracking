package com.xenoteo.helpers.linkedList;

/**
 * Simple linked list implementation.
 */
public class List {
    public Node head;

    public List(Node node){
        head = node;
    }

    public boolean equals(Node other){
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

}
