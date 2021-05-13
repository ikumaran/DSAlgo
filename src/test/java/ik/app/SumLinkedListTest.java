package ik.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class SumLinkedListTest {

    @Test
    public void testSum() {
        Stack<Integer> first = new Stack<Integer>();
        first.add(5);
        first.add(4);
        first.add(6);
        Stack<Integer> second = new Stack<Integer>();
        second.add(5);
        second.add(4);
        second.add(6);

        Assert.assertEquals( 1290, SumLinkedList.add(first, second));

        first = new Stack<Integer>();
        first.add(0);
        first.add(0);
        first.add(1);
        second = new Stack<Integer>();
        second.add(0);
        second.add(1);
        second.add(1);

        Assert.assertEquals( 210, SumLinkedList.add(first, second));
    }
}
