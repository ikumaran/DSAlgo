package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class CaeserCipherTest {

    @Test
    public void testEncrypt() {
        Assert.assertEquals("XYZ", CaeserCipher.encrypt("ABC"));
        Assert.assertEquals("UVW", CaeserCipher.encrypt("XYZ"));
        Assert.assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", CaeserCipher.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }
}
