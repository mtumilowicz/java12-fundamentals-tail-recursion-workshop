package workshop

import answers.FactorialGroovyTrampoline
import spock.lang.Specification

class FactorialGroovyTrampolineTest extends Specification {

    def "5! -> 120"() {
        expect:
        FactorialGroovyTrampolineWorkshop.getFactorial(5) == 120
    }

    def "11! -> 39_916_800"() {
        expect:
        FactorialGroovyTrampolineWorkshop.getFactorial(11) == 39_916_800

    }

    def "13! -> 6_227_020_800"() {
        expect:
        FactorialGroovyTrampolineWorkshop.getFactorial(13) == 6_227_020_800
    }

    def "14! -> 87_178_291_200"() {
        expect:
        FactorialGroovyTrampolineWorkshop.getFactorial(14) == 87_178_291_200
    }
}
