package answers.algos

import answers.algos.ListReverse
import utils.ListNode
import spock.lang.Specification

class ListReverseTest extends Specification {

    def list = get10ElementList()

    def "WithRecur"() {
        expect:
        ListReverse.withRecur(list).toLinkedList() == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    def "WithTailRecur"() {
        expect:
        ListReverse.withTailRecur(list).toLinkedList() == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    def "WithLoop"() {
        expect:
        ListReverse.withLoop(list).toLinkedList() == [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    private static ListNode get10ElementList() {
        def ln1 = new ListNode(1)
        def ln2 = new ListNode(2)
        def ln3 = new ListNode(3)
        def ln4 = new ListNode(4)
        def ln5 = new ListNode(5)
        def ln6 = new ListNode(6)
        def ln7 = new ListNode(7)
        def ln8 = new ListNode(8)
        def ln9 = new ListNode(9)
        def ln10 = new ListNode(10)

        ln1.next = ln2
        ln2.next = ln3
        ln3.next = ln4
        ln4.next = ln5
        ln5.next = ln6
        ln6.next = ln7
        ln7.next = ln8
        ln8.next = ln9
        ln9.next = ln10


        return ln1
    }
}
