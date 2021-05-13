package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class StackWithMinTest {

    @Test
    public void testStack() {
        StackWithMin stackWithMin = new StackWithMin();
        stackWithMin.push(6);
        stackWithMin.push(7);
        stackWithMin.push(5);
        stackWithMin.push(2);
        stackWithMin.push(9);
        Assert.assertEquals(2, stackWithMin.head.min);
        Assert.assertEquals(9, stackWithMin.head.max);
        stackWithMin.pop();
        Assert.assertEquals(2, stackWithMin.head.min);
        Assert.assertEquals(7, stackWithMin.head.max);
    }
}
