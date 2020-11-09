package ik.app;

public class StringZeroStr {

    public static String stripAllZero(String input) {
        if (input.startsWith("0")) {
            return stripAllZero(input.substring(1));
        }
        return input;
    }

}
