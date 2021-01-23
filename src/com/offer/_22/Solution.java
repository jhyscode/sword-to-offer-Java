package com.offer._22;

/**
 * @author ：jhys
 * @date ：Created in 2021/1/23 22:44
 * @Description ：
 */

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}

public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
