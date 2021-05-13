package ik.app;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

    public static List<Integer> intersect(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<Integer>();
        for (int arr1Item: array1) {
            for (int arr2Item: array2) {
                if (arr1Item == arr2Item) {
                    result.add(arr1Item);
                }
            }
        }
        return result;
    }
}
