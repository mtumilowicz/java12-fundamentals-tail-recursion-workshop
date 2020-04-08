package answers

import answers.FactorialTrampoline
import spock.lang.Specification

class FactorialGroovyTrampolineTest extends Specification {

    def "5! -> 120"() {
        expect:
        FactorialTrampoline.getFactorial(5) == 120
    }

    def "11! -> 39_916_800"() {
        expect:
        FactorialTrampoline.getFactorial(11) == 39_916_800

    }

    def "13! -> 6_227_020_800"() {
        expect:
        FactorialTrampoline.getFactorial(13) == 6_227_020_800
    }

    def "14! -> 87_178_291_200"() {
        expect:
        FactorialTrampoline.getFactorial(14) == 87_178_291_200
    }
}
