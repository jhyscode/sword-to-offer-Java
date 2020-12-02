package com.offer._14_1;

/**
 * 动态规划
 * @author ：jhys
 * @date ：Created in 2020/12/2 17:20
 * @Description ：
 */
public class Solution {

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],Math.max(j * (i - j),j * dp[i - j]));
            }
        }
        return dp[n];
    }

}
