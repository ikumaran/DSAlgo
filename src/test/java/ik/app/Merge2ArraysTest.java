package ik.app;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2ArraysTest {

    @Test
    public void testMerge() {
        List result1 = Arrays.asList(1,2,3,4,5,5,6);
        Assert.assertEquals(result1, Merge2Arrays.merge(new int[] { 4,5,6}, new int[] {1,2,3,5}));
    }
 }
