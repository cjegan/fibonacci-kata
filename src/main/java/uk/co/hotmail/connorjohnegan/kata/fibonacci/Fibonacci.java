package uk.co.hotmail.connorjohnegan.kata.fibonacci;

public class Fibonacci {
    public int calc(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else {
            int fib = 0;
            int first = 0;
            int second = 1;
            for (int i = 1; i < n; i++) {
                fib = first + second;
                first = second;
                second = fib;
            }
            return fib;
        }
    }
}
