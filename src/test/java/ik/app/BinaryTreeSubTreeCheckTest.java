package ik.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeSubTreeCheckTest {

    BinaryTreeSubTreeCheck binaryTreeSubTreeCheck1;
    BinaryTreeSubTreeCheck binaryTreeSubTreeCheck2;
    BinaryTreeSubTreeCheck binaryTreeSubTreeCheck3;
    @Before
    public void init() {
        binaryTreeSubTreeCheck1 = new BinaryTreeSubTreeCheck();
        binaryTreeSubTreeCheck2 = new BinaryTreeSubTreeCheck();
        binaryTreeSubTreeCheck3 = new BinaryTreeSubTreeCheck();
    }

    @Test
    public void testAdd() {
        binaryTreeSubTreeCheck1.add(5);
        binaryTreeSubTreeCheck1.add(3);
        binaryTreeSubTreeCheck1.add(2);
        binaryTreeSubTreeCheck1.add(4);
        binaryTreeSubTreeCheck1.add(7);
        binaryTreeSubTreeCheck1.add(6);
        binaryTreeSubTreeCheck1.add(8);
    }

    @Test
    public void testSubTree() {
        // tree1
        binaryTreeSubTreeCheck1.add(5);
        binaryTreeSubTreeCheck1.add(3);
        binaryTreeSubTreeCheck1.add(2);
        binaryTreeSubTreeCheck1.add(4);
        binaryTreeSubTreeCheck1.add(7);
        binaryTreeSubTreeCheck1.add(6);
        binaryTreeSubTreeCheck1.add(8);

        // tree2
        binaryTreeSubTreeCheck2.add(7);
        binaryTreeSubTreeCheck2.add(6);
        binaryTreeSubTreeCheck2.add(8);

        // tree2
        binaryTreeSubTreeCheck3.add(7);
        binaryTreeSubTreeCheck3.add(1);
        binaryTreeSubTreeCheck3.add(8);

        Assert.assertTrue(binaryTreeSubTreeCheck1.isSubTree(binaryTreeSubTreeCheck2));
        Assert.assertFalse(binaryTreeSubTreeCheck1.isSubTree(binaryTreeSubTreeCheck3));
        Assert.assertTrue(binaryTreeSubTreeCheck1.isSubTree(binaryTreeSubTreeCheck1));

        Assert.assertEquals("5324768", binaryTreeSubTreeCheck1.preOrderTraverse());
        Assert.assertEquals("768", binaryTreeSubTreeCheck2.preOrderTraverse());
        Assert.assertEquals("718", binaryTreeSubTreeCheck3.preOrderTraverse());

        Assert.assertEquals("235", binaryTreeSubTreeCheck1.inOrderTraverse());
    }
}
