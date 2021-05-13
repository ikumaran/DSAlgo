package ik.app;

public class CaeserCipher {

    public static String encrypt(String input) {
        StringBuilder encryppted = new StringBuilder();
        for (char inputChar: input.toCharArray()) {
            int newChar = inputChar;
            if (inputChar != ' ') { // if space - do nothing, else encrypt
                newChar = inputChar - 3; // offset by 3
                if (newChar < 65) { // ensure offset is not less than 65 (i.e.) A
                    newChar = newChar + 26;
                }
            }
            encryppted.append((char)(newChar));
        }
        return encryppted.toString();
    }
}
