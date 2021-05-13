package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class PermutationsTest {

    @Test
    public void isPermutated() {
        Assert.assertTrue(Permutations.isPermutation("ABC", "BCA"));
        Assert.assertTrue(Permutations.isPermutation("ABC", "CAB"));
        Assert.assertTrue(Permutations.isPermutation("ABC", "CBA"));
        Assert.assertFalse(Permutations.isPermutation("ABC", "BA"));
        Assert.assertFalse(Permutations.isPermutation("ABC", "A"));
        Assert.assertFalse(Permutations.isPermutation("AABC", "ABC"));
        Assert.assertTrue(Permutations.isPermutation("AABBCC", "ABBACC"));
        Assert.assertTrue(Permutations.isPermutation("AABBCC", "ABABCC"));
        Assert.assertTrue(Permutations.isPermutation("AABBCC", "ABBCAC"));
        Assert.assertTrue(Permutations.isPermutation("AABBCC", "ABBCCA"));
        Assert.assertTrue(Permutations.isPermutation("AABBCC", "ABABCC"));
        Assert.assertFalse(Permutations.isPermutation("AABBCC", "ABABCCA"));

    }
}
