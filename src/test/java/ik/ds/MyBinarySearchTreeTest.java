package ik.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinarySearchTreeTest {
    private MyBinarySearchTree myBinarySearchTree;
    @Before
    public void init() {
        myBinarySearchTree = new MyBinarySearchTree();
    }


    @Test
    public void testAddAndDelete(){
        myBinarySearchTree.add(5);
        myBinarySearchTree.add(7);
        myBinarySearchTree.add(9);
        myBinarySearchTree.add(1);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(8);
        myBinarySearchTree.add(6);
        myBinarySearchTree.add(3);

        Assert.assertNotNull(myBinarySearchTree.find(6));
        myBinarySearchTree.delete(6);
        Assert.assertNull(myBinarySearchTree.find(6));

        Assert.assertNotNull(myBinarySearchTree.find(5));
        myBinarySearchTree.delete(5);
        Assert.assertNull(myBinarySearchTree.find(5));

        Assert.assertNotNull(myBinarySearchTree.find(1));
        myBinarySearchTree.delete(1);
        Assert.assertNull(myBinarySearchTree.find(1));

        myBinarySearchTree.add(5);
        Assert.assertNotNull(myBinarySearchTree.find(5));
        myBinarySearchTree.delete(5);
        Assert.assertNull(myBinarySearchTree.find(5));
    }


}
