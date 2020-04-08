package workshop.algos

import spock.lang.Specification

class FibonacciWorkshopTest extends Specification {
    def "WithLoop"() {
        expect:
        FibonacciWorkshop.withLoop(n) == result

        where:
        n || result
        0 || 0
        1 || 1
        2 || 1
        3 || 2
        4 || 3
        5 || 5
        6 || 8
        7 || 13
        8 || 21
    }

    def "WithStream"() {
        expect:
        FibonacciWorkshop.withStream(n) == result

        where:
        n || result
        0 || 0
        1 || 1
        2 || 1
        3 || 2
        4 || 3
        5 || 5
        6 || 8
        7 || 13
        8 || 21
    }

    def "WithRecur"() {
        expect:
        FibonacciWorkshop.withRecur(n) == result

        where:
        n || result
        0 || 0
        1 || 1
        2 || 1
        3 || 2
        4 || 3
        5 || 5
        6 || 8
        7 || 13
        8 || 21
    }

    def "WithTailRecur"() {
        expect:
        FibonacciWorkshop.withTailRecur(n) == result

        where:
        n || result
        0 || 0
        1 || 1
        2 || 1
        3 || 2
        4 || 3
        5 || 5
        6 || 8
        7 || 13
        8 || 21
    }
}
