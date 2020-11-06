package ik.ds;

public class MyLinkedList {
    int size;
    Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);
        size++;
        // when no head - set a head
        if (head == null) {
            head = newNode;
            return;
        }

        // when there is a head - add new node's next item as the head
        newNode.next = head;

        // now newNode is head
        head = newNode;
    }

    public void addBack(int data) {
        Node newNode = new Node(data);
        size++;
        // when no head - set a head
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = getLastNode();
        // when there is a head - add new node's next item as the head
        lastNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        Node lastNode = getNodeByIndex(size-1);
        lastNode.next = null;
        size--;
    }

    public void removeByIndex(int index) {
        if (index > size) {
            // exception
            return;
        }
        Node previousNode = getNodeByIndex(index-1);

        previousNode.next = previousNode.next.next;
        size--;
    }

    public void print() {
        StringBuilder output = new StringBuilder("{" + head.data + ", ");
        Node currentNode = head;
        while (currentNode.next != null) {
            output.append(", ").append(currentNode.data);
        }
        output.append("}");
        System.out.println(output);
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int getByIndex(int index) {
        Node currentNode = head;
        while(index > 0) {
            currentNode = currentNode.next;
            index--;
        }
        return currentNode.data;
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = head;
        while(index > 0) {
            currentNode = currentNode.next;
            index--;
        }
        return currentNode;
    }

    private Node getLastNode() {
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    private static class Node  {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
}
