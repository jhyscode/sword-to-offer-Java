package com.offer._16;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/9 11:20
 * @Description ：
 */
public class Solution {
    public static  double myPow(double x, int n) {
        //特判
        if(x == 0){
            return 0;
        }
        long b = n;
        double res = 1.0;
        if(b < 0){
            b = -b;
            x = 1/x;
        }
        while(b > 0){
            if((b&1) == 1){
                res *= x;
            }
            b >>>= 1;
            x *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        myPow(3,5);
    }
}
