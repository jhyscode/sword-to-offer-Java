package com.offer._6;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * @author ：jhys
 * @date ：Created in 2020/11/12 21:43
 * @Description ：
 */
public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //使用 栈 这种数据结构
        Stack<Integer> stack = new Stack<>();
        //将链表元素全部存放在 栈 里面
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        //取出栈里面的元素
        while (!stack.isEmpty())
            ret.add(stack.pop());
        return ret;
    }
}

/**
 * 栈的本质就是递归，我们每访问一个节点的时候，先递归输出它后面的节点，再输出该节点本身
 */
class Solution1 {
    ArrayList<Integer> arraylist=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            if (listNode.next != null) {
                printListFromTailToHead(listNode.next);
            }
            arraylist.add(listNode.val);
        }
        return arraylist;
    }

}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    ListNode(){}
}