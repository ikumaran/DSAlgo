package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class URLifyTest {

    @Test
    public void urlifyTest() {
        Assert.assertEquals("ABC", URLify.urlify("ABC"));
        Assert.assertEquals("ABC", URLify.urlify("ABC%20"));
        Assert.assertEquals("ABC Test", URLify.urlify("ABC%20Test"));
        Assert.assertEquals("ABC Test%2", URLify.urlify("ABC%20Test%2"));
    }
}
