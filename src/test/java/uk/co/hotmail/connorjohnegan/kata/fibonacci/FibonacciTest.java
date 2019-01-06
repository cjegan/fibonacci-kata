package uk.co.hotmail.connorjohnegan.kata.fibonacci;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    // When I Call Calc With 1 Then 1 Returned
    public void test1() {
        int result = fibonacci.calc(1);

        assertThat(result).isEqualTo(1);
    }
}