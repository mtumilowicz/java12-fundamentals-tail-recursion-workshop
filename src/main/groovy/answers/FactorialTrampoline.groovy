package answers

class FactorialTrampoline {

    static def factorial = { n, result = 1G ->
        n < 2 ? result : factorial.trampoline(n - 1, n * result)
    }.trampoline()

    static def getFactorial(int n) {
        factorial(n)
    }
}
