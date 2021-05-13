package ik.algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortTest {

    @Test
    public void testAsc() {
        Assert.assertTrue(Arrays.equals(new int[]{1,2,4,5,6,7,9}, BubbleSort.asc(new int[]{4,1,2,9,7,6, 5})));
        Assert.assertTrue(Arrays.equals(new int[]{-100,-13,-5,8,41,55,3332}, BubbleSort.asc(new int[]{8,41,55,3332, -100,-13,-5})));
    }
}
