package answers

import groovy.transform.TailRecursive

class FibonacciTailRecursion {

    @TailRecursive
    static def fibonacci(first = 0G, second = 1G, n) {
        n == 0 ? first : fibonacci(second, first + second, n - 1)
    }
}
