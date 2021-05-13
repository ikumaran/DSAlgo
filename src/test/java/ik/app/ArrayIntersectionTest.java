package ik.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayIntersectionTest {
    @Test
    public void isIntersectTest() {

        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(1);
        output.add(3);
        output.add(6);
        Assert.assertEquals(output, ArrayIntersection.intersect(new int[]{1, 3, 4, 5, 6}, new int[]{1, 3, 6, 7}));
    }
}
