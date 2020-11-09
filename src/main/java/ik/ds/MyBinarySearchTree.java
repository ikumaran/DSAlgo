package ik.ds;

public class MyBinarySearchTree {

    private Node root;

    private static class Node {
        private int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public MyBinarySearchTree() {
        root = null;
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insert(data, root);
        }
    }

    public Node insert(int data, Node currentNode) {
        if (currentNode == null) {
            currentNode = new Node(data);
        } else {
            if (data < currentNode.data) {
                currentNode.left = insert(data, currentNode.left);
            } else {
                currentNode.right = insert(data, currentNode.right);
            }
        }
        return currentNode;
    }
}
