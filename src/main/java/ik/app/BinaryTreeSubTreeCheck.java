package ik.app;

public class BinaryTreeSubTreeCheck {
    Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newItem = new Node(data);
        if (root == null) {
            root = newItem;
            return;
        }
        Node currentNode = root;

        while (currentNode != null) {
            int currentNodeData = currentNode.data;
            if (currentNodeData <= data) {
                if (currentNode.right == null) {
                    currentNode.right = newItem;
                    return;
                }
                currentNode = currentNode.right;
            } else {
                if (currentNode.left == null) {
                    currentNode.left = newItem;
                    return;
                }
                currentNode = currentNode.left;
            }
        }
    }

    public boolean isSubTree(BinaryTreeSubTreeCheck subTree) {
        Node currentNode = root;
        while (currentNode != null) {
            if (subTree.root.data == currentNode.data) {
                return deepEquals(currentNode, subTree.root);
            } else if (currentNode.data < subTree.root.data) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        return false;
    }

    private boolean deepEquals(Node node1, Node node2) {
        if (node1 == node2) {
            return true;
        }
        if (node1 != null && node2 != null && node1.data == node2.data) {
            return deepEquals(node1.left, node2.left) && deepEquals(node1.right, node2.right);
        }
        return false;
    }

    // left, root, right
    public String inOrderTraverse() {
        StringBuilder sb = new StringBuilder();
        inOrderTraverse(root, sb);
        return sb.toString();
    }

    private void inOrderTraverse(Node node, StringBuilder sb) {
        if (node != null) {
            inOrderTraverse(node.left, sb);
            sb.append(node.data);
            inOrderTraverse(node.right, sb);
        }
    }

    // root, left, right
    public String preOrderTraverse() {
        StringBuilder sb = new StringBuilder();
        preOrderTraverse(root, sb);
        return sb.toString();
    }

    private void preOrderTraverse(Node root, StringBuilder sb) {
        if (root != null) {
            sb.append(root.data);
            preOrderTraverse(root.left, sb);
            preOrderTraverse(root.right, sb);
        }
    }
}
