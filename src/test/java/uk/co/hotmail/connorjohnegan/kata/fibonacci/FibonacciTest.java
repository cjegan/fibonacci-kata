package uk.co.hotmail.connorjohnegan.kata.fibonacci;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    // When I call calc(0) then 0 is returned
    public void test0() {
        int result = fibonacci.calc(0);

        assertThat(result).isEqualTo(0);
    }

    @Test
    // When I call calc(1) then 1 is returned
    public void test1() {
        int result = fibonacci.calc(1);

        assertThat(result).isEqualTo(1);
    }

    @Test
    // When I call calc(2) then 1 is returned
    public void test2() {
        int result = fibonacci.calc(2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    // When I call calc(3) then 1 is returned
    public void test3() {
        int result = fibonacci.calc(3);

        assertThat(result).isEqualTo(2);
    }

}