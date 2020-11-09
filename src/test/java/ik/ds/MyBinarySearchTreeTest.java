package ik.ds;

import org.junit.Before;
import org.junit.Test;

public class MyBinarySearchTreeTest {
    private MyBinarySearchTree myBinarySearchTree;
    @Before
    public void init() {
        myBinarySearchTree = new MyBinarySearchTree();
    }

    @Test
    public void testAdd(){
        myBinarySearchTree.add(5);
        myBinarySearchTree.add(7);
        myBinarySearchTree.add(9);
        myBinarySearchTree.add(1);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(8);
        myBinarySearchTree.add(6);
    }
}
