package ik.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ListOfStacksTetst {

    @Test
    public void testStacksAsList() {
        ListOfStacks listOfStacks = new ListOfStacks(3);
        listOfStacks.push(1);
        listOfStacks.push(2);
        listOfStacks.push(3);
        listOfStacks.push(4);
        listOfStacks.push(5);
        listOfStacks.push(6);
        listOfStacks.push(7);
        listOfStacks.push(8);
        listOfStacks.push(9);
        listOfStacks.push(10);
        Assert.assertEquals(10, listOfStacks.size);
        Assert.assertEquals(10,listOfStacks.pop());
        Assert.assertEquals(9, listOfStacks.size);
        Assert.assertEquals(9, listOfStacks.pop());
        Assert.assertEquals(8, listOfStacks.size);

    }
}
