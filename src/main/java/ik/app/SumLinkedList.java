package ik.app;

import java.util.Stack;

public class SumLinkedList {

    public static int add(Stack<Integer> first, Stack<Integer> second) {
        int firstNumber = buildNumber(first);
        int secondNumber = buildNumber(second);
        return firstNumber + secondNumber;
    }

    private static int buildNumber(Stack<Integer> first) {
        int number = 0;
        int index = first.size() - 1;
        while (first.size() != 0) {
            number = number + (first.pop() * (int) Math.pow(10, index--));
        }
        return number;
    }
}
