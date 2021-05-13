package ik.app;

import java.util.ArrayList;
import java.util.Stack;

public class ListOfStacks {
    ArrayList<Stack<Integer>> stackArrayList = new ArrayList<Stack<Integer>>();
    int threshold;
    int size;

    ListOfStacks(int threshold) {
        stackArrayList.add(new Stack<Integer>());
        this.threshold = threshold;
    }

    public void push(int data) {
        Stack<Integer> lastStack = stackArrayList.get(stackArrayList.size() - 1);
        if (lastStack.size() >= threshold) {
            lastStack = new Stack<Integer>();
            stackArrayList.add(lastStack);
        }
        lastStack.push(data);
        size++;
    }

    public int pop() {
        Stack<Integer> lastStack = stackArrayList.get(stackArrayList.size() - 1);
        int poppedValue = lastStack.pop();
        if (lastStack.isEmpty()) {
            stackArrayList.remove(stackArrayList.size() - 1);
        }
        size--;
        return poppedValue;
    }
}
