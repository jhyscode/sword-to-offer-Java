package com.offer;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/13 15:11
 * @Description ：
 */
public class Test {
    public static void main(String[] args) {
        f(5);
    }

    public static int f(int n) {
        int temp;
        if (n == 1)
            return 1;
        else
            temp = n*f(n-1);
        System.out.println(n-1);
        return temp;
    }
}
