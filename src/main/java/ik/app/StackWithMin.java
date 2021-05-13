package ik.app;

public class StackWithMin {
    Node head;

    class Node {
        int data;
        int max;
        int min;

        Node next;
        Node (int data, int min, int max) {
            this.data = data;
            this.min = min;
            this.max = max;
        }
    }

    public void push(int data) {
        if (head == null) {
            head = new Node(data, data, data);
            return;
        }

        Node temp = head;
        head = new Node(data, Math.min(temp.min, data), Math.max(temp.max, data));
        head.next = temp;
    }

    public int pop() {
        head = head.next;
        return head.data;
    }

}
