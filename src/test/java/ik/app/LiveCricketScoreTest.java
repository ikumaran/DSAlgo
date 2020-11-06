package ik.app;

import ik.app.LiveCricketScore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LiveCricketScoreTest {
    private LiveCricketScore liveCricketScore;
    @Before
    public void setup() {

    }

    @Test
    public void test_add() {
        liveCricketScore = new LiveCricketScore(3);
        liveCricketScore.addScore(4);
        liveCricketScore.addScore(2);
        liveCricketScore.addScore(1);
        // scores be like 4,2,1
        Assert.assertEquals(4, liveCricketScore.getRunsByIndex(0));
        Assert.assertEquals(2, liveCricketScore.getRunsByIndex(1));
        Assert.assertEquals(1, liveCricketScore.getRunsByIndex(2));
        // now scores be like 2,1,6
        liveCricketScore.addScore(6);
        Assert.assertEquals(2, liveCricketScore.getRunsByIndex(0));
        Assert.assertEquals(1, liveCricketScore.getRunsByIndex(1));
        Assert.assertEquals(6, liveCricketScore.getRunsByIndex(2));
        // now scores be like 6,2,1
        liveCricketScore.addScore(2);
        liveCricketScore.addScore(1);
        Assert.assertEquals(6, liveCricketScore.getRunsByIndex(0));
        Assert.assertEquals(2, liveCricketScore.getRunsByIndex(1));
        Assert.assertEquals(1, liveCricketScore.getRunsByIndex(2));
    }

}
