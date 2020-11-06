package ik.app;

public class Fibonacci {
    private static int[] cache = new int[100];

    public static int fibOld(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibOld(i - 1) + fibOld(i - 2);
        }
    }

    public static int fib(int i) {
        if (i <= 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (cache[i] == 0) {
            cache[i] = fib(i - 1) + fib(i - 2);
        }
        return cache[i];
    }
}

