package trampoline

class FactorialTrampoline {
    private static final def factorial = { n, accu = 1G ->
        n < 2 ? accu : factorial.trampoline(n - 1, n * accu)
    }

    static def getFactorial(int n) {
        factorial(n)()
    }
}
