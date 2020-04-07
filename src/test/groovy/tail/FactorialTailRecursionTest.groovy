package tail

import spock.lang.Specification 

class FactorialTailRecursionTest extends Specification {
    def "5! -> 120"() {
        expect:
        FactorialTailRecursion.factorial(5) == 120
    }

    def "11! -> 39_916_800"() {
        expect:
        FactorialTailRecursion.factorial(11) == 39_916_800

    }

    def "13! -> 6_227_020_800"() {
        expect:
        FactorialTailRecursion.factorial(13) == 6_227_020_800
    }

    def "14! -> 87_178_291_200"() {
        expect:
        FactorialTailRecursion.factorial(14) == 87_178_291_200
    }
}
