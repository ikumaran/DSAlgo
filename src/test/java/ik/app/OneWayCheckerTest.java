package ik.app;

import org.junit.Assert;
import org.junit.Test;

public class OneWayCheckerTest {

    @Test
    public void isOneWayTest() {
        Assert.assertTrue(OneWayChecker.isOneWay("ABC", "ABCD"));
        Assert.assertTrue(OneWayChecker.isOneWay("ABCD", "ABCD"));
        Assert.assertTrue(OneWayChecker.isOneWay("ABCD", "ABC"));
        Assert.assertTrue(OneWayChecker.isOneWay("ABD", "ABC"));
        Assert.assertTrue(OneWayChecker.isOneWay("ABCD", "ACD"));
        Assert.assertTrue(OneWayChecker.isOneWay("ABC", "AC"));
        Assert.assertTrue(OneWayChecker.isOneWay("VBC", "ABC"));
        Assert.assertTrue(OneWayChecker.isOneWay("AVC", "ABC"));

        Assert.assertFalse(OneWayChecker.isOneWay("AVVC", "ABC"));
        Assert.assertFalse(OneWayChecker.isOneWay("AC", "ABCC"));
        Assert.assertFalse(OneWayChecker.isOneWay("ACS", "ABCC"));
        Assert.assertFalse(OneWayChecker.isOneWay("ABC", "BCA"));

        Assert.assertFalse(OneWayChecker.isOneWay("pale", "paleXXXX"));

        Assert.assertTrue(OneWayChecker.isOneWay("pale", "ple"));
        Assert.assertTrue(OneWayChecker.isOneWay("pales", "pale"));
        Assert.assertTrue(OneWayChecker.isOneWay("pale", "bale"));
        Assert.assertFalse(OneWayChecker.isOneWay("pale", "bake"));

        Assert.assertTrue(OneWayChecker.isOneWay("pale", "aale"));
        Assert.assertTrue(OneWayChecker.isOneWay("pale", "pble"));
        Assert.assertTrue(OneWayChecker.isOneWay("pale", "palk"));

        Assert.assertFalse(OneWayChecker.isOneWay("pale", "bakeerer"));


    }
}
