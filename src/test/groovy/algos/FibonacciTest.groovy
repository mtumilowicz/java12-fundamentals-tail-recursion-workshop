package algos

import spock.lang.Specification

class FibonacciTest extends Specification {
    def "WithLoop"() {
        expect:
        Fibonacci.withLoop(n) == result

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
        Fibonacci.withStream(n) == result

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
        Fibonacci.withRecur(n) == result

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
        Fibonacci.withTailRecur(n) == result

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
