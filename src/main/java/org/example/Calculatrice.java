package org.example;

public class Calculatrice {
    private static int result;

    public int additionner(int a, int b) {
        result = a + b;
        return result;
    }
    public int getResult() {
        return result;
    }
}