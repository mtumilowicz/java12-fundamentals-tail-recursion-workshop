package workshop.trampoline

import answers.trampoline.FactorialJavaTrampoline
import spock.lang.Specification

class FactorialJavaTrampolineWorkshopTest extends Specification {

    def factorial = new FactorialJavaTrampolineWorkshop()

    def "5! -> 120"() {
        expect:
        factorial.applyAsLong(5) == 120
    }

    def "11! -> 39_916_800"() {
        expect:
        factorial.applyAsLong(11) == 39_916_800

    }

    def "13! -> 6_227_020_800"() {
        expect:
        factorial.applyAsLong(13) == 6_227_020_800
    }

    def "14! -> 87_178_291_200"() {
        expect:
        factorial.applyAsLong(14) == 87_178_291_200
    }
}
