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

    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.val == val) return node;
            node = node.next;
        }
        return null;
    }

}
