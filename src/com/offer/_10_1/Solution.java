package com.offer._10_1;

import com.sun.xml.internal.ws.api.pipe.Fiber;

/**斐波那契数列
 * @author ：jhys
 * @date ：Created in 2020/11/26 16:27
 * @Description ：
 */
public class Solution {
    static int constantNum = 1000000007;
    public static int fib(int n) {
        int[] array = new int[101];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = (array[i-1]  + array[i-2]) % constantNum;
        }
        return array[n] % constantNum;
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}