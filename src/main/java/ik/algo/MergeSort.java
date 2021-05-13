package ik.algo;

import java.util.Arrays;

public class MergeSort {

    public static int[] asc(int[] input) {
        return asc(input, 0, input.length - 1);
    }

    private static int[] asc(int[] input, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            asc(input, l, m);
            asc(input, m + 1, r);
            merge(input, l, m, r);
        }
        return input;
    }

    private static void merge(int[] input, int l, int m, int r) {
        int newArrayLengthL = m - l + 1;
        int newArrayLengthR = r - m;

        int[] newArrayL = new int[newArrayLengthL];
        int[] newArrayR = new int[newArrayLengthR];

        for (int i = 0; i < newArrayLengthL; i++) {
            newArrayL[i] = input[l+i];
        }
        for (int i = 0; i < newArrayLengthR; i++) {
            newArrayR[i] = input[m+i+1];
        }

        int i=0;
        int j=0;
        int k = l;
        while (i < newArrayLengthL && j < newArrayLengthR) {
            if (newArrayL[i] <= newArrayR[j]) {
                input[k] = newArrayL[i];
                i++;
            } else {
                input[k] = newArrayR[j];
                j++;
            }
            k++;
        }
        while (i < newArrayLengthL) {
            input[k++] = newArrayL[i];
            i++;
        }
        while (j < newArrayLengthR) {
            input[k++] = newArrayR[j];
            j++;
        }
    }

}
