package ik.app;

public class URLify {
    public static String urlify(String input) {
        char[] output = new char[input.length()];
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            String value;
            if (input.charAt(i) == '%' && i + 3 <= input.length()) {
                value = input.substring(i, i + 3);
                if (value.equals("%20")) {
                    output[index] = ' ';
                    // skip 2 indexes
                    i = i + 2;
                }
            } else {
                output[index] = input.charAt(i);
            }
            index++;
        }
        return new String(output).trim();
    }
}
