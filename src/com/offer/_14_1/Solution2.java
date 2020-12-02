package com.offer._14_1;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/2 20:45
 * @Description ：
 */
public class Solution2 {
    public static int cuttingRope(int n) {
        if(n <= 3) return n - 1;
        if(n == 4) return 4;
        long res = 1;
        while(n > 4)
        {
            res *= 3;
            res %= 1000000007;
            n -= 3;
        }
        // 最后n的值只有可能是：2、3、4。而2、3、4能得到的最大乘积恰恰就是自身值
        // 因为2、3不需要再剪了（剪了反而变小）；4剪成2x2是最大的，2x2恰巧等于4
        return (int) (res * n % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
