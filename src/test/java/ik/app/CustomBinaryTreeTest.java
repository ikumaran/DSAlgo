package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class CustomBinaryTreeTest {


    @Test
    public void findSumPath() {

        CustomBinaryTree customBinaryTree = new CustomBinaryTree(5);

        CustomBinaryNode node1 = new CustomBinaryNode(3);
        CustomBinaryNode node2 = new CustomBinaryNode(1);
        CustomBinaryNode node3 = new CustomBinaryNode(-1);
        CustomBinaryNode node4 = new CustomBinaryNode(-5);
        CustomBinaryNode node5 = new CustomBinaryNode(3);
        CustomBinaryNode node6 = new CustomBinaryNode(2);

        customBinaryTree.add(customBinaryTree.root, node1, "left");
        customBinaryTree.add(customBinaryTree.root, node2, "right");
        customBinaryTree.add(node1, node3, "left");
        customBinaryTree.add(node1, node4, "right");
        customBinaryTree.add(node2, node5, "left");
        customBinaryTree.add(node2, node6, "right");


        Assert.assertEquals(2, customBinaryTree.calculateSum(8).size());
        Assert.assertEquals(4, customBinaryTree.calculateSum(3).size());
        Assert.assertEquals(1, customBinaryTree.calculateSum(6).size());
    }
}
