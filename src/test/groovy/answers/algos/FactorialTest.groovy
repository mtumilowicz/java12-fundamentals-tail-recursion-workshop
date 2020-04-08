package answers.algos

import answers.algos.Factorial
import spock.lang.Specification

class FactorialTest extends Specification {
    def "WithLoop"() {
        expect:
        Factorial.withLoop(n) == result

        where:
        n || result
        1 || 1
        2 || 2
        3 || 6
        4 || 24
        5 || 120
    }

    def "WithStream"() {
        expect:
        Factorial.withStream(n) == result

        where:
        n || result
        1 || 1
        2 || 2
        3 || 6
        4 || 24
        5 || 120
    }

    def "WithRecur"() {
        expect:
        Factorial.withRecur(n) == result

        where:
        n || result
        1 || 1
        2 || 2
        3 || 6
        4 || 24
        5 || 120
    }

    def "WithTailRecur"() {
        expect:
        Factorial.withTailRecur(n) == result

        where:
        n || result
        1 || 1
        2 || 2
        3 || 6
        4 || 24
        5 || 120
    }
}
