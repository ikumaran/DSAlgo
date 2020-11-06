package ik.ds;

import ik.ds.MyQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
    private MyQueue myQueue;
    @Before
    public void setup() {
        myQueue = new MyQueue();
    }

    @Test
    public void test_add() {
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        Assert.assertEquals(1, myQueue.getByIndex(0));
        Assert.assertEquals(2, myQueue.getByIndex(1));
        Assert.assertEquals(3, myQueue.getByIndex(2));
        Assert.assertEquals(4, myQueue.getByIndex(3));
    }

    @Test
    public void test_pop() {
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.pop();
        myQueue.add(5);
        myQueue.pop();
        Assert.assertEquals(3, myQueue.getByIndex(0));
        Assert.assertEquals(4, myQueue.getByIndex(1));
        Assert.assertEquals(5, myQueue.getByIndex(2));
    }
}
