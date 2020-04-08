package workshop.algos

import spock.lang.Specification

class FactorialWorkshopTest extends Specification {
    def "WithLoop"() {
        expect:
        FactorialWorkshop.withLoop(n) == result

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
        FactorialWorkshop.withStream(n) == result

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
        FactorialWorkshop.withRecur(n) == result

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
        FactorialWorkshop.withTailRecur(n) == result

        where:
        n || result
        1 || 1
        2 || 2
        3 || 6
        4 || 24
        5 || 120
    }
}
