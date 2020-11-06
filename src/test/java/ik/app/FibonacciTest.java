package ik.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Timer;

public class FibonacciTest {

    @Test
    public void testFib(){
        long startTime = System.nanoTime();
        Assert.assertEquals(0, Fibonacci.fib(0));
        Assert.assertEquals(1, Fibonacci.fib(1));
        Assert.assertEquals(1, Fibonacci.fib(2));
        Assert.assertEquals(2, Fibonacci.fib(3));
        Assert.assertEquals(3, Fibonacci.fib(4));
        Assert.assertEquals(5, Fibonacci.fib(5));
        Assert.assertEquals(8, Fibonacci.fib(6));
        Assert.assertEquals(13, Fibonacci.fib(7));
        Assert.assertEquals(21, Fibonacci.fib(8));
        Assert.assertEquals(34, Fibonacci.fib(9));
        Assert.assertEquals(55, Fibonacci.fib(10));
        Assert.assertEquals(9227465, Fibonacci.fib(35));
        long endTime = System.nanoTime();
        System.out.println(((endTime - startTime) / 1000000) + "msec - Improved");
    }

    @Test
    public void testFibOld(){
        long startTime = System.nanoTime();
        Assert.assertEquals(0, Fibonacci.fibOld(0));
        Assert.assertEquals(1, Fibonacci.fibOld(1));
        Assert.assertEquals(1, Fibonacci.fibOld(2));
        Assert.assertEquals(2, Fibonacci.fibOld(3));
        Assert.assertEquals(3, Fibonacci.fibOld(4));
        Assert.assertEquals(5, Fibonacci.fibOld(5));
        Assert.assertEquals(8, Fibonacci.fibOld(6));
        Assert.assertEquals(13, Fibonacci.fibOld(7));
        Assert.assertEquals(21, Fibonacci.fibOld(8));
        Assert.assertEquals(34, Fibonacci.fibOld(9));
        Assert.assertEquals(55, Fibonacci.fibOld(10));
        Assert.assertEquals(9227465, Fibonacci.fibOld(35));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime)/1000000 + "msec - Slow");
    }
}
