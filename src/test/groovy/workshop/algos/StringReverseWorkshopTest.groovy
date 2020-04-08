package workshop.algos

import spock.lang.Specification

class StringReverseWorkshopTest extends Specification {
    def "WithRecur"() {
        expect:
        StringReverseWorkshop.withRecur(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithTailRecur"() {
        expect:
        StringReverseWorkshop.withTailRecur(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithStringBuilder"() {
        expect:
        StringReverseWorkshop.withStringBuilder(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }

    def "WithLoop"() {
        expect:
        StringReverseWorkshop.withLoop(str) == result

        where:
        str      || result
        ''       || ''
        'a'      || 'a'
        '1234'   || '4321'
        'abcdef' || 'fedcba'
    }
}
