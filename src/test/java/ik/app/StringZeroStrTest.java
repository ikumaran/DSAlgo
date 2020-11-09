package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class StringZeroStrTest {

    @Test
    public void testStringZeroStred() {
        Assert.assertEquals("56709", StringZeroStr.stripAllZero("56709"));
        Assert.assertEquals("56709", StringZeroStr.stripAllZero("056709"));
        Assert.assertEquals("56709", StringZeroStr.stripAllZero("0056709"));
        Assert.assertEquals("56709", StringZeroStr.stripAllZero("00056709"));
        Assert.assertEquals("56709", StringZeroStr.stripAllZero("000056709"));
        Assert.assertEquals("ABC", StringZeroStr.stripAllZero("ABC"));
        Assert.assertEquals("ABC0", StringZeroStr.stripAllZero("ABC0"));
    }
}
