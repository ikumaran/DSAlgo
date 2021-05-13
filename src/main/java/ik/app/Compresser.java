package ik.app;

public class Compresser {
    public static String compress(String input) {
        StringBuilder output = new StringBuilder();

        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                output.append(input.charAt(i));
                if (counter > 1) {
                    output.append(counter);
                }
                counter = 1;
            }
        }
        return output.toString();
    }

}
