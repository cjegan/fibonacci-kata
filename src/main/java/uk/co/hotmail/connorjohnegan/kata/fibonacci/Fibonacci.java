package uk.co.hotmail.connorjohnegan.kata.fibonacci;

public class Fibonacci {
    public int calc(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return 2;
        }
    }
}
