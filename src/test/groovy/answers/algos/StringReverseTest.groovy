package answers.algos

import answers.algos.StringReverse
import spock.lang.Specification

class StringReverseTest extends Specification {
    def "WithRecur"() {
        expect:
        StringReverse.withRecur(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithTailRecur"() {
        expect:
        StringReverse.withTailRecur(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithStringBuilder"() {
        expect:
        StringReverse.withStringBuilder(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithLoop"() {
        expect:
        StringReverse.withLoop(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }
}
