package ik.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryHeapTest {
    private MyBinaryHeap myBinaryHeap;

    @Before
    public void init() {
        myBinaryHeap = new MyBinaryHeap();
    }

    @Test
    public void testInsert() {
        myBinaryHeap.insert(14);
        myBinaryHeap.insert(5);
        myBinaryHeap.insert(6);
        myBinaryHeap.insert(7);
        myBinaryHeap.insert(8);
        myBinaryHeap.insert(1);
        myBinaryHeap.insert(12);
        myBinaryHeap.insert(12);
        myBinaryHeap.insert(2);
        myBinaryHeap.insert(2);
        myBinaryHeap.insert(5);
        myBinaryHeap.insert(13);

        Assert.assertEquals(14, myBinaryHeap.max());
        Assert.assertEquals(14, myBinaryHeap.extractMax());
        Assert.assertEquals(13, myBinaryHeap.extractMax());
        Assert.assertEquals(12, myBinaryHeap.extractMax());
        Assert.assertEquals(12, myBinaryHeap.extractMax());
        Assert.assertEquals(8, myBinaryHeap.extractMax());
    }
}
