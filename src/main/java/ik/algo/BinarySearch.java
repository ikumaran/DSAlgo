package ik.algo;

public class BinarySearch {

    public static int findIndex(int[] all, int searchTerm) {
        return binarySearcher(all, searchTerm, 0, all.length - 1);
    }

    private static int binarySearcher(int[] searchArray, int searchTerm, int left, int right) {
        int middle = Math.round((right + left) >> 1);
        if (searchArray[middle] == searchTerm) {
            return middle;
        }
        if (searchArray[left] == searchTerm) {
            return left;
        }
        if (searchArray[right] == searchTerm) {
            return right;
        }
        if (searchArray[middle] > searchTerm) {
            return binarySearcher(searchArray, searchTerm, middle - 1, left);
        } else {
            return binarySearcher(searchArray, searchTerm, middle + 1, right);
        }
    }
}
