package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class PaliandromeTest {

    @Test
    public void isPaliandrome() {
        Assert.assertTrue(PaliandromeOn.isPaliandrome("madam"));
        Assert.assertTrue(PaliandromeOn.isPaliandrome("mam"));
        Assert.assertTrue(PaliandromeOn.isPaliandrome("maam"));
        Assert.assertFalse(PaliandromeOn.isPaliandrome("am"));
        Assert.assertFalse(PaliandromeOn.isPaliandrome("mtr"));
    }
}
