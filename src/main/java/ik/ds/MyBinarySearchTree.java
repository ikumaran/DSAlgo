package ik.ds;

public class MyBinarySearchTree {

    private Node root;

    class Node {
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
        root = insert(data, root);
    }

    public void delete(int data) {
        delete(data, root);
    }

    public Node delete(int data, Node node) {

        if (node == null) {
            return node;
        }

        if (data < node.data) {
            node.left = delete(data, node.left);
        } else if (data > node.data) {
            node.right = delete(data, node.right);
        } else {
            // no child
            if (node.left == null && node.right == null) {
                node = null;
            }
            // 1 child
            else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            }
            // 2 child
            else {

                Node minNodeInRight = findMin(node.right);
                // make the least data in right tree as replacement.
                node.data = minNodeInRight.data;
                // delete the duplicated one.
                node.right = delete(node.data, node.right);
            }
        }
        return node;
    }

    public Node find(int data) {
        return find(data, root);
    }

    private Node find(int data, Node node) {
        if (node == null) {
            return null;
        }
        if (node.data == data) {
            return node;
        }
        if (data < node.data) {
            node = find(data, node.left);
        } else {
            node = find(data, node.right);
        }
        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            findMin(node.left);
        }
        return node;
    }

    private Node insert(int data, Node currentNode) {
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
