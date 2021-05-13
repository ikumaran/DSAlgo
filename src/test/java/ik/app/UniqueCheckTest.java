package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCheckTest {

    @Test
    public void isUniqueTest() {
        Assert.assertTrue(UniqueCheck.isUnique("ABC"));
        Assert.assertFalse(UniqueCheck.isUnique("ABbCC"));
        Assert.assertFalse(UniqueCheck.isUnique("AaBC"));
        Assert.assertTrue(UniqueCheck.isUnique("ABCDEFGHIJKLMNOPQRSTUVWYZ2"));
        Assert.assertTrue(UniqueCheck.isUnique("ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        Assert.assertFalse(UniqueCheck.isUnique("333"));
        Assert.assertFalse(UniqueCheck.isUnique("AB bc"));
        Assert.assertFalse(UniqueCheck.isUnique(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"));
    }
    @Test
    public void isUniqueTestNoMap() {
        Assert.assertTrue(UniqueCheck.isUniqueNoMap("ABC"));
        Assert.assertFalse(UniqueCheck.isUniqueNoMap("ABbCC"));
        // no map - no lowercase taken care
        Assert.assertTrue(UniqueCheck.isUniqueNoMap("AaBC"));
        Assert.assertTrue(UniqueCheck.isUniqueNoMap("ABCDEFGHIJKLMNOPQRSTUVWYZ2"));
        Assert.assertTrue(UniqueCheck.isUniqueNoMap("ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        Assert.assertFalse(UniqueCheck.isUniqueNoMap("333"));
        // no map - no lowercase taken care
        Assert.assertTrue(UniqueCheck.isUniqueNoMap("AB bc"));
        Assert.assertTrue(UniqueCheck.isUniqueNoMap(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~"));
        Assert.assertFalse(UniqueCheck.isUniqueNoMap(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~W"));
    }
}
