package ik.ds;

import org.junit.Assert;
import org.junit.Test;

public class UniqueLinkedListTest {

    @Test
    public void testAdd() {
        UniqueLinkedList linkedList = new UniqueLinkedList();
        Assert.assertTrue(linkedList.add(1));
        Assert.assertFalse(linkedList.add(1));
        Assert.assertFalse(linkedList.add(1));
        Assert.assertTrue(linkedList.add(2));
        Assert.assertFalse(linkedList.add(2));
        Assert.assertTrue(linkedList.add(3));
        Assert.assertTrue(linkedList.add(4));
        Assert.assertTrue(linkedList.add(5));
        Assert.assertFalse(linkedList.add(3));
        Assert.assertFalse(linkedList.add(5));
        Assert.assertFalse(linkedList.add(4));
        Assert.assertEquals(5, linkedList.size);

    }
    @Test
    public void testAddRemoveDupes() {
        LinkedListRemoveDupes linkedList = new LinkedListRemoveDupes();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.removeDuplicates();
        Assert.assertEquals(5, linkedList.size);

    }
}
