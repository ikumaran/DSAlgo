package ik.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CustomBinaryTree {

    CustomBinaryNode root;

    CustomBinaryTree(int rootData) {
        this.root = new CustomBinaryNode(rootData);
    }

    public void add(CustomBinaryNode parentNode, CustomBinaryNode childNode, String position) {
        if (position.equalsIgnoreCase("left")) {
            parentNode.left(childNode);
        }
        if (position.equalsIgnoreCase("right")) {
            parentNode.right(childNode);
        }
    }

    public List<String> calculateSum(int sum) {
        List<String> pathString = new ArrayList<String>();
        findSum(pathString, sum, root);
        return pathString;
    }

    private void findSum(List<String> pathString, int sum, CustomBinaryNode node) {
        if (node == null) return;
        calculateSum(pathString, null, sum, node, 0);
        findSum(pathString, sum, node.left);
        findSum(pathString, sum, node.right);
    }

    private void calculateSum(List<String> pathString, Stack<Integer> currentPath, int sum,
                              CustomBinaryNode node, int currentSum) {

        if (currentPath == null) {
            currentPath = new Stack<Integer>();
        }
        if (node == null) {
            return;
        }
        currentPath.add(node.data);
        currentSum += node.data;
        if (sum == currentSum) {
            pathString.add(currentPath.toString());
        }
        calculateSum(pathString, currentPath, sum, node.left, currentSum);
        calculateSum(pathString, currentPath, sum, node.right, currentSum);
    }
}
