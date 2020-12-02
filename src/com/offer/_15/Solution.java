package com.offer._15;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/2 21:15
 * @Description ：
 */
public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
}
