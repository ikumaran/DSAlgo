package ik.algo;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void simpleSearch() {
        int[] input = {2, 3, 5, 6, 7, 12, 14};
        Assert.assertEquals(0, BinarySearch.findIndex(input, 2));
        Assert.assertEquals(1, BinarySearch.findIndex(input, 3));
        Assert.assertEquals(2, BinarySearch.findIndex(input, 5));
        Assert.assertEquals(3, BinarySearch.findIndex(input, 6));
        Assert.assertEquals(4, BinarySearch.findIndex(input, 7));
        Assert.assertEquals(5, BinarySearch.findIndex(input, 12));
        Assert.assertEquals(6, BinarySearch.findIndex(input, 14));

    }

    @Test
    public void bitComplex() {
        int[] input = {2, 3, 5, 6, 7, 12, 14, 19};
        Assert.assertEquals(0, BinarySearch.findIndex(input, 2));
        Assert.assertEquals(1, BinarySearch.findIndex(input, 3));
        Assert.assertEquals(2, BinarySearch.findIndex(input, 5));
        Assert.assertEquals(3, BinarySearch.findIndex(input, 6));
        Assert.assertEquals(4, BinarySearch.findIndex(input, 7));
        Assert.assertEquals(5, BinarySearch.findIndex(input, 12));
        Assert.assertEquals(6, BinarySearch.findIndex(input, 14));
        Assert.assertEquals(7, BinarySearch.findIndex(input, 19));
    }

}
