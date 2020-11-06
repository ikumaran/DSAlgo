package ik.ds;

import ik.ds.MyHashTable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyHashTableTest {
    private MyHashTable myHashTable;

    @Before
    public void setup() {
        myHashTable = new MyHashTable();
    }

    @Test
    public void StringSequencedKey() {
        myHashTable.put("AAA", "Welcome1");
        myHashTable.put("BBB", "Welcome2");
        myHashTable.put("CCC", "Welcome3");
        myHashTable.put("DDD", "Welcome4");
        myHashTable.put("EEE", "Welcome5");
        myHashTable.put("FFF", "Welcome6");

        Assert.assertEquals("Welcome1", myHashTable.get("AAA"));
        Assert.assertEquals("Welcome2", myHashTable.get("BBB"));
        Assert.assertEquals("Welcome3", myHashTable.get("CCC"));
        Assert.assertEquals("Welcome4", myHashTable.get("DDD"));
        Assert.assertEquals("Welcome5", myHashTable.get("EEE"));
        Assert.assertEquals("Welcome6", myHashTable.get("FFF"));
        Assert.assertEquals("NOTHING_HERE", myHashTable.get("GGG"));
    }

    @Test
    public void RandomTextHashTable() {
        myHashTable.put("India", "Welcome1");
        myHashTable.put("United States", "Welcome2");
        myHashTable.put("China", "Welcome3"); // collides with India - same id :)
        myHashTable.put("Turkey", "Welcome4");

        Assert.assertEquals("Welcome1", myHashTable.get("India"));
        Assert.assertEquals("Welcome2", myHashTable.get("United States"));
        Assert.assertEquals("Welcome3", myHashTable.get("China"));
        Assert.assertEquals("Welcome4", myHashTable.get("Turkey"));
    }

}
