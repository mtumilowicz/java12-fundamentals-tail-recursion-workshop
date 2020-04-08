package workshop

import answers.FibonacciTailRecursion
import spock.lang.Specification

class FibonacciTailRecursionTest extends Specification {

    def "fibo 10 = 55"() {
        expect:
        FibonacciTailRecursionWorkshop.fibonacci(10) == 55
    }

    def "fibo 27 = 196_418"() {
        expect:
        FibonacciTailRecursionWorkshop.fibonacci(27) == 196_418
    }

    def "fibo 50 = 12_586_269_025"() {
        expect:
        FibonacciTailRecursionWorkshop.fibonacci(50) == 12_586_269_025
    }
}
