package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class CompresserTest {

    @Test
    public void compressTest() {
        Assert.assertEquals( "C2", Compresser.compress("CC"));
        Assert.assertEquals( "ABC", Compresser.compress("ABC"));
        Assert.assertEquals( "ABC3", Compresser.compress("ABCCC"));
        Assert.assertEquals( "A2BC", Compresser.compress("AABC"));
        Assert.assertEquals( "A3", Compresser.compress("AAA"));
        Assert.assertEquals( "A3D", Compresser.compress("AAAD"));
        Assert.assertEquals( "A", Compresser.compress("A"));
        Assert.assertEquals( "A5C5", Compresser.compress("AAAAACCCCC"));
    }
}
