package com.offer._17;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/10 12:37
 * @Description ：
 */
public class Solution {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10,n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end ; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
