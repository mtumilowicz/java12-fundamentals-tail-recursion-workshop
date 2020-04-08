package workshop.algos;

public class FibonacciWorkshop {

    static long withLoop(int n) {
        // hint: save n term before switching it into n+1
        return 0;
    }

    static long withRecur(int n) {
        // hint: sum of two invocations

        return 0;
    }

    static long withTailRecur(int n) {
        return withTailRecur(n, 0, 1);
    }

    private static long withTailRecur(int n, long first, long second) {
        // hint: accumulate in second
        return 0;
    }

    static Long withStream(int n) {
        // hint: Stream.iterate, FibonacciTerm, limit
        return 0L;
    }
}
