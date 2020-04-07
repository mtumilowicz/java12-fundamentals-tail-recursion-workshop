package algos;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    static long withLoop(int n) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            int oldFirst = first;
            first = second;
            second = oldFirst + second;
        }

        return first;
    }

    static long withRecur(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return withRecur(n - 2) + withRecur(n - 1);
    }

    static long withTailRecur(int n) {
        return withTailRecur(n, 0, 1);
    }

    private static long withTailRecur(int n, long first, long second) {
        if (n == 0) {
            return first;
        }
        return withTailRecur(n - 1, second, first + second);
    }

    static Long withStream(int n) {
        return n == 0
                ? 0L
                : Stream.iterate(new Fibo(), Fibo::next)
                .limit(n)
                .map(Fibo::get)
                .collect(Collectors.toCollection(LinkedList::new))
                .getLast();
    }

    static class Fibo {
        private final int first;
        private final int second;

        public Fibo() {
            first = 0;
            second = 1;
        }

        private Fibo(int first, int second) {
            this.first = first;
            this.second = second;
        }

        Fibo next() {
            return new Fibo(second, first + second);
        }

        long get() {
            return second;
        }
    }
}
