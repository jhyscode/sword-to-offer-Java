package com.offer._10_2;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/26 17:11
 * @Description ：
 */
class Solution {
    public  static int numWays(int n) {
        if (n == 0){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}