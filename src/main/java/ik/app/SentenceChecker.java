package ik.app;

import java.util.HashMap;
import java.util.Set;

public class SentenceChecker {

    public static boolean isExist(String input, String sentence) {
        HashMap<Character, Integer> inputMap = map(input);
        HashMap<Character, Integer> sentenceMap = map(sentence);
        return isExist(inputMap, sentenceMap);
    }

    private static boolean isExist(HashMap<Character, Integer> inputMap, HashMap<Character, Integer> sentenceMap) {
        Set<Character> inputChars = inputMap.keySet();
        for (Character inputChar : inputChars) {
            if (inputChar == ' ') {
                continue;
            }
            if (!inputMap.get(inputChar).equals(sentenceMap.get(inputChar))) {
                return false;
            }
        }
        return true;
    }

    private static HashMap<Character, Integer> map(String input) {
        char[] inputChar = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char each : inputChar) {
            int currentCount = map.containsKey(each) ? map.get(each) : 0;
            map.put(each, currentCount + 1);
        }
        return map;
    }
}
