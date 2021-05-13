package ik.app;

public class FunctionalApp {

    public static void main(String[] args) {
        FunctInt f = (a, b) -> "a + b";

        f.add(1, 3);
    }

}
