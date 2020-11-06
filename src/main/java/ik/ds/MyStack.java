package ik.ds;

public class MyStack {
    private Node head;
    private int size;

    private static class Node {
        private int data;
        private Node next;
        Node (int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        size ++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            // left intentionally
            return -1;
        }
        int removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public int getByIndex(int index) {
        Node currentNode = head;
        int indexCounter = 0;
        while (currentNode != null) {
            if (index == indexCounter) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            indexCounter++;
        }
        return -1;
    }
}
