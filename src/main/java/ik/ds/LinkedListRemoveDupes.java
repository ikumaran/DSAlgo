package ik.ds;

import java.util.HashSet;

public class LinkedListRemoveDupes {

    Node head;
    int size;
    private class Node {
        int data;
        Node next;

        public Node(int newItem) {
            this.data = newItem;
        }
    }

    public void add(int newItem) {
        size++;
        if (head == null) {
            head = new Node(newItem);
        }

        Node newNode = new Node(newItem);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void removeDuplicates() {
        Node currentNode = head;
        Node previousNode = null;
        HashSet<Integer> uniques = new HashSet<Integer>();
        while (currentNode != null) {
            if (uniques.add(currentNode.data)) {
                previousNode = currentNode;
            } else {
                if (currentNode.next != null) {
                    size--; // reduce size - only when item is removed. Last node - there will be no item.
                }
                previousNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }
    }
}
