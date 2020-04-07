package utils;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public List<Integer> toLinkedList() {
        List<Integer> list = new LinkedList<>();
        var current = this;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        return list;
    }
}