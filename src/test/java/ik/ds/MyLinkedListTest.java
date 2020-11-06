package ik.ds;

import ik.ds.MyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {
    private MyLinkedList myLinkedList;

    @Before
    public void setup() {
        myLinkedList = new MyLinkedList();
    }

    @Test
    public void addFirstItem() {
        myLinkedList.addFront(1);
        myLinkedList.addFront(2);
        myLinkedList.addFront(2);
        myLinkedList.addFront(2);
        myLinkedList.addFront(3);
        myLinkedList.addBack(5);
        myLinkedList.addFront(4);

        Assert.assertEquals(4, myLinkedList.getFirst());
        Assert.assertEquals(5, myLinkedList.getLast());
        Assert.assertEquals(7, myLinkedList.size);

    }

    @Test
    public void getSize() {
        Assert.assertEquals(0, myLinkedList.size);

    }
    @Test
    public void getByIndex() {
        myLinkedList.addFront(3);
        myLinkedList.addBack(5);
        myLinkedList.addFront(4);
        Assert.assertEquals(5, myLinkedList.getByIndex(2));
        myLinkedList.addBack(6);
        Assert.assertEquals(6, myLinkedList.getByIndex(3));
        myLinkedList.addFront(4);
        Assert.assertEquals(5, myLinkedList.getByIndex(3));
    }
    @Test
    public void removeFirst() {
        myLinkedList.addFront(3);
        myLinkedList.addFront(4);
        myLinkedList.addFront(5);
        myLinkedList.removeFirst();
        Assert.assertEquals(4, myLinkedList.getByIndex(0));
        Assert.assertEquals(3, myLinkedList.getByIndex(1));
    }

    @Test
    public void removeLast() {
        myLinkedList.addFront(3);
        myLinkedList.addFront(4);
        myLinkedList.addFront(5);
        myLinkedList.removeLast();
        Assert.assertEquals(5, myLinkedList.getByIndex(0));
        Assert.assertEquals(4, myLinkedList.getByIndex(1));
    }

    @Test
    public void removeByIndex() {
        myLinkedList.addBack(3);
        myLinkedList.addBack(4);
        myLinkedList.addBack(5);
        myLinkedList.removeByIndex(1);
        Assert.assertEquals(3, myLinkedList.getByIndex(0));
        Assert.assertEquals(5, myLinkedList.getByIndex(1));
    }

    @Test (expected = Exception.class)
    public void removeByIndexEmpty() {
        myLinkedList.removeByIndex(1);
        myLinkedList.getByIndex(0);
    }
}
