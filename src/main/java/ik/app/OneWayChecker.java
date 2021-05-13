package ik.app;

public class OneWayChecker {
    public static boolean isOneWay(String from, String to) {
        int fromLength = from.length();
        int toLength = to.length();
        if (fromLength == toLength) {
            // ABC, DBC - same length - can be update
            return isUpdate(from, to);
        } else if (toLength == fromLength + 1) {
            // ABC, ABCD - added
            return isAddedOrRemoved(to, from);
        } else if (toLength == fromLength - 1) {
            // ABC, AB - removed
            return isAddedOrRemoved(from, to);
        }
        return false;
    }

    private static boolean isAddedOrRemoved(String from, String to) {
        int countOfMismatch = 0;
        for (int i = 0, j = 0; i < from.length() && j < to.length(); i++) {
            if (from.charAt(i) != to.charAt(j)) {
                countOfMismatch++;
                if (countOfMismatch > 1) {
                    // 2+ mismatch - then false them.
                    return false;
                }
            } else {
                j++;
            }
        }
        return true;
    }

    private static boolean isUpdate(String from, String to) {
        int countOfMismatch = 0;
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) != to.charAt(i)) {
                countOfMismatch++;
                if (countOfMismatch > 1) {
                    // 2+ mismatch - then false them.
                    return false;
                }
            }
        }
        return true;
    }
}
