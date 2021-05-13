package ik.app;

import java.util.ArrayList;

public class Merge2Arrays {

    public static ArrayList<Integer> merge(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int array1Pointer = 0;
        int array2Pointer = 0;

        while (array1Pointer < array1.length || array2Pointer < array2.length) {
            if (array1Pointer < array1.length && array2Pointer < array2.length) {
                if (array1[array1Pointer] < array2[array2Pointer]) {
                    result.add(array1[array1Pointer]);
                    array1Pointer++;
                } else if (array2[array2Pointer] < array1[array1Pointer]) {
                    result.add(array2[array2Pointer]);
                    array2Pointer++;
                } else {
                    result.add(array1[array1Pointer]);
                    result.add(array2[array2Pointer]);
                    array1Pointer++;
                    array2Pointer++;
                }
            } else if (array1Pointer < array1.length) {
                result.add(array1[array1Pointer]);
                array1Pointer++;
            } else {
                result.add(array2[array2Pointer]);
                array2Pointer++;
            }
        }
        return result;
    }
}
