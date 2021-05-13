package ik.app;

public class ReverseInt {

    public static int reverseInt (int input) {
        String str = String.valueOf(input);
        char[] charInput = str.toCharArray();
        int left = charInput[0] == '-' ? 1 : 0;
        int right = charInput.length-1;
        for (; left< right; left++, right--) {
            char temp = charInput[left];
            charInput[left] = charInput[right];
            charInput[right] = temp;
        }
        return Integer.parseInt(new String(charInput));
    }
}
