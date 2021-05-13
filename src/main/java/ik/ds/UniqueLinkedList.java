package ik.ds;

public class UniqueLinkedList {

    Node head;
    int size;
    private class Node {
        int data;
        Node next;

        public Node(int newItem) {
            this.data = newItem;
        }
    }

    public boolean add(int newItem) {
        if (head == null) {
            head = new Node(newItem);
            size++;
            return true; // return true - to confirm - newItem is added to list
        }
        if (head.data == newItem) {
            return false;
        }

        Node newNode = new Node(newItem);
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == newItem) {
                return false;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;
        return true;
    }
}
