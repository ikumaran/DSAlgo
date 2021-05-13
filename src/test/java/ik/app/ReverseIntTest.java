package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntTest {

    @Test
    public void reverseTest() {
        Assert.assertEquals( -32, ReverseInt.reverseInt(-23));
        Assert.assertEquals( 32, ReverseInt.reverseInt(23));
        Assert.assertEquals( 3762, ReverseInt.reverseInt(2673));
        Assert.assertEquals( -3762, ReverseInt.reverseInt(-2673));
    }
}
