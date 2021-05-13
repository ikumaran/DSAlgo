package ik.app;

import java.util.Arrays;
import java.util.HashSet;

public class SubSpecial {
    public static void main(String sar[]) {
        String s = "abcbaba";
        char[] c = s.toCharArray();

        long count = c.length;
        for (int i=1; i < c.length-1; i++) {
            int x = 1;
            while ((i + x) < c.length && (i - x) >= 0) {
                if (c[i+x] == c[i-x]) {
                    count++;
                } else {
                    break;
                }
                x++;
            }
        }
        System.out.println(count);
    }
}
