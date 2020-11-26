package com.offer._9;

import java.util.LinkedList;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/26 16:04
 * @Description ：
 */
public class Solution {

    private LinkedList<Integer> stack1 = new LinkedList<>();
    private LinkedList<Integer> stack2 = new LinkedList<>();


    public void enqueue(int node) {
        // stack1专门用于进入队列
        stack1.push(node);
    }

    // 出列操作。stack2不为空就直接出列；为空就将stack1中所有元素压入stack2中，再弹出栈顶元素。
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("队列为空");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }



}
