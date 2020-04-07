package tail

import groovy.transform.TailRecursive

class FactorialTailRecursion {

    @TailRecursive
    static def factorial(n, accu = 1G) {
        n < 2 ? accu : factorial(n - 1, n * accu)
    }
}
