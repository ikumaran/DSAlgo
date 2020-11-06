package ik.ds;

import ik.ds.MyStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
    private MyStack myStack;
    @Before
    public void setup() {
        myStack = new MyStack();
    }

    @Test
    public void test_add() {
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        Assert.assertEquals(4, myStack.getByIndex(0));
        Assert.assertEquals(3, myStack.getByIndex(1));
        Assert.assertEquals(2, myStack.getByIndex(2));
        Assert.assertEquals(1, myStack.getByIndex(3));
    }

    @Test
    public void test_pop() {
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.pop();
        myStack.add(5);
        myStack.pop();
        Assert.assertEquals(3, myStack.getByIndex(0));
        Assert.assertEquals(2, myStack.getByIndex(1));
        Assert.assertEquals(1, myStack.getByIndex(2));
    }
}
