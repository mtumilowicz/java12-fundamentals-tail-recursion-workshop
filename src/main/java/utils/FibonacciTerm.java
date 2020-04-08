package utils;

public class FibonacciTerm {
    private final int first;
    private final int second;

    public FibonacciTerm() {
        first = 0;
        second = 1;
    }

    private FibonacciTerm(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public FibonacciTerm next() {
        return new FibonacciTerm(second, first + second);
    }

    public long get() {
        return second;
    }
}