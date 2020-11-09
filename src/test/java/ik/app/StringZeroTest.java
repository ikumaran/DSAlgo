package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class StringZeroTest {

    @Test
    public void testStringZeroed() {
        Assert.assertEquals("56709", StringZero.stripAllZero("56709"));
        Assert.assertEquals("56709", StringZero.stripAllZero("056709"));
        Assert.assertEquals("56709", StringZero.stripAllZero("0056709"));
        Assert.assertEquals("56709", StringZero.stripAllZero("00056709"));
        Assert.assertEquals("56709", StringZero.stripAllZero("000056709"));
        Assert.assertEquals("ABC", StringZero.stripAllZero("ABC"));
        Assert.assertEquals("ABC0", StringZero.stripAllZero("ABC0"));
    }
}
