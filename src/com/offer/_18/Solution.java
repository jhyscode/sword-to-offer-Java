package com.offer._18;

import java.util.List;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/13 11:24
 * @Description ：
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {

        if (head.val == val) {
            return head.next;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val !=val) {
            pre = cur;
            cur = cur.next;
        }

        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }
}

