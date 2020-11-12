package com.offer._4;

/**
 * 二维数组中的查找
 * @author ：jhys
 * @date ：Created in 2020/11/12 19:30
 * @Description ：
 */
public class Solution {

    public static boolean find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length ==0) {
            return false;
        }

        int i = 0;
        int j = array[0].length - 1;
        while(j >= 0 && i <= array.length - 1) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
