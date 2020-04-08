package answers

import answers.FibonacciTailRecursion
import spock.lang.Specification

class FibonacciTailRecursionTest extends Specification {

    def "fibo 10 = 55"() {
        expect:
        FibonacciTailRecursion.fibonacci(10) == 55
    }

    def "fibo 27 = 196_418"() {
        expect:
        FibonacciTailRecursion.fibonacci(27) == 196_418
    }

    def "fibo 50 = 12_586_269_025"() {
        expect:
        FibonacciTailRecursion.fibonacci(50) == 12_586_269_025
    }
}
