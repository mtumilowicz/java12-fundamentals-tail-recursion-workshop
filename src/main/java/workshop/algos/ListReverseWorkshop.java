package workshop.algos;

import utils.ListNode;

public class ListReverseWorkshop {
    static ListNode withRecur(ListNode currentNode) {
        // hint: traverse all list recursively and reverse link for each node
        // hint: isLast, reverseLink, cutNext

        return null;
    }

    static ListNode withLoop(ListNode head) {
        // hint: move to pointers in a loop
        return null;
    }

    static ListNode withTailRecur(ListNode head) {
        return withTailRecur(head, null);
    }

    private static ListNode withTailRecur(ListNode head, ListNode reversed) {
        // hint: prepend in reversed

        return null;
    }

    private static ListNode prepend(ListNode newHead, ListNode list) {
        // hint: prepend newHead to list, and return it

        return null;
    }

    private static void reverseLink(ListNode node) {
        // hint: next
    }

    private static void cutNext(ListNode node) {
        // hint: set next to null
    }

    private static boolean isLast(ListNode node) {
        // last if next is null
        return false;
    }
}
