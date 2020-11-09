package ik.app;

public class StringZero {

    public static String stripAllZero(String input) {
        char[] inputArray = input.toCharArray();
        if (inputArray[0] == '0') {
            inputArray = stripZero(inputArray);
        }
        return String.copyValueOf(inputArray);
    }

    private static char[] stripZero(char[] inputArray) {
        while (inputArray[0] == '0') {
            inputArray = copyArray(inputArray, 1, inputArray.length - 1);
            stripZero(inputArray);
        }
        return inputArray;
    }

    private static char[] copyArray(char[] inputArray, int from, int to) {
        char[] copiedArray = new char[to - from + 1];
        int copiedArrayIndex = 0;
        for (int i = from; copiedArrayIndex < copiedArray.length; i++) {
            copiedArray[copiedArrayIndex++] = inputArray[i];
        }
        return copiedArray;
    }
}
