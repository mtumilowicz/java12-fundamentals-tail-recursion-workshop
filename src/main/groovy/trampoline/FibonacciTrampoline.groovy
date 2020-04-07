package trampoline

class FibonacciTrampoline {
    private static final def fibonacci = { first = 0G, second = 1G, n ->
        n == 0 ? first : fibonacci.trampoline(second, first + second, n - 1)
    }

    static def fibo(int n) {
        fibonacci(n)()
    }
}
