package ik;

public class SpecialLinkedList {

    Node head;

    class Node {
        int content;
        Node next;
        Node random;
    }


    public SpecialLinkedList deepCopy() {
        // new copy object
        SpecialLinkedList newCopy = new SpecialLinkedList();
        // add head details
        newCopy.head = new Node();
        newCopy.head.content = this.head.content;

        // copy linked list - next var
        Node newCopyCurrent = newCopy.head;
        Node current = this.head.next;

        while (current != null) {
            // deep copy node
            Node newNode = new Node();
            newNode.content = current.content;

            // add all new obects
            newCopyCurrent.next = newNode;
            current = current.next;
            newCopyCurrent = newCopyCurrent.next;
        }

        return newCopy;

    }
}
