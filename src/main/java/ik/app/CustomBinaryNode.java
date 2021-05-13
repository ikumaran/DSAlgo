package ik.app;

class CustomBinaryNode {
    int data;
    CustomBinaryNode left;
    CustomBinaryNode right;

    CustomBinaryNode(int data) {
        this.data = data;
    }

    public void left(CustomBinaryNode childNode) {
        this.left = childNode;
    }

    public void right(CustomBinaryNode childNode) {
        this.right = childNode;
    }

}
