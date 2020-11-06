package ik.ds;

public class MyQueue {
    private Node head;
    private Node tail;
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
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public void pop() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
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
