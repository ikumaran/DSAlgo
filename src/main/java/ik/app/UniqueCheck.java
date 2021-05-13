package ik.app;

import java.util.HashMap;
import java.util.Map;

public class UniqueCheck {

    public static boolean isUnique(String input) {
        if (input == null) {
            return false;
        }
        char[] inputAsArray = input.toLowerCase().toCharArray();
        Map<Character, Integer> occurrences = new HashMap<Character, Integer>();
        for (char letter: inputAsArray) {
            if (occurrences.containsKey(letter)) {
                return false;
            } else {
                occurrences.put(letter, 1);
            }
        }
        return true;
    }

    public static boolean isUniqueNoMap(String input) {
        if (input == null) {
            return false;
        }
        boolean[] charValues = new boolean[128];
        for (int i=0; i < input.length(); i++) {
            int value = input.charAt(i);
            if (charValues[value]) {
                return false;
            } else {
                charValues[value] = true;
            }

        }
        return true;
    }
}
