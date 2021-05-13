package ik.app;

import java.util.Arrays;

public class Permutations {
    public static boolean isPermutation(String input, String permutatedInput) {

        int[] inputArrayStore = new int[128];
        int[] permutedInputArrayStore = new int[128];
        if (input.length() != permutatedInput.length()) {
            return false;
        }
        for (int i =0; i < input.length(); i++) {
            int inputCharValue = input.charAt(i);
            inputArrayStore[inputCharValue] = inputArrayStore[inputCharValue] + 1;
        }
        for (int i =0; i < permutatedInput.length(); i++) {
            int inputCharValue = permutatedInput.charAt(i);
            permutedInputArrayStore[inputCharValue] = permutedInputArrayStore[inputCharValue] + 1;
        }
        return myDeepEquals(inputArrayStore, permutedInputArrayStore);
    }

    public static boolean myDeepEquals(int[] inputArrayStore, int[] permutedInputArrayStore) {
        if (inputArrayStore.length != permutedInputArrayStore.length) {
            return false;
        }
        for (int i = 0; i < inputArrayStore.length; i++) {
            if (inputArrayStore[i] != permutedInputArrayStore[i]) {
                return false;
            }
        }
        return true;
    }

}
