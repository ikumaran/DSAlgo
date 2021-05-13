package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class SentenceCheckerTest {
    @Test
    public void isExist() {
        Assert.assertTrue(SentenceChecker.isExist("my name is Kumaran", "isrannameKmyuma"));
        Assert.assertFalse(SentenceChecker.isExist("my name is Kumaran", "isrannamemyuma"));
        Assert.assertFalse(SentenceChecker.isExist("my name is Kumaran", "isrannaeKmyuma"));
        Assert.assertTrue(SentenceChecker.isExist("my name is Kumaran is", "isrannameKmyuisma"));
        Assert.assertFalse(SentenceChecker.isExist("my name is Kumaran is", "isrannameKmyuma"));
    }
}
