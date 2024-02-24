package org.tfoc;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {}

    public ListNode(int val) {

        this.val = val;
    }

    ListNode(int val, ListNode next) {

        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ListNode listNode)) return false;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

}
