package answers


import spock.lang.Specification

class FactorialGroovyTrampolineTest extends Specification {

    def "5! -> 120"() {
        expect:
        FactorialGroovyTrampoline.getFactorial(5) == 120
    }

    def "11! -> 39_916_800"() {
        expect:
        FactorialGroovyTrampoline.getFactorial(11) == 39_916_800

    }

    def "13! -> 6_227_020_800"() {
        expect:
        FactorialGroovyTrampoline.getFactorial(13) == 6_227_020_800
    }

    def "14! -> 87_178_291_200"() {
        expect:
        FactorialGroovyTrampoline.getFactorial(14) == 87_178_291_200
    }
}
