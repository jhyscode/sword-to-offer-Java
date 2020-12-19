package com.offer._21;

/**
 * @author ：jhys
 * @date ：Created in 2020/12/19 21:41
 * @Description ：
 */
public class Solution {
    public int[] exchange(int[] nums) {
       int i = 0, j = nums.length - 1;
       int tmp;
       while (i < j) {
           while (i < j && (nums[i] & 1 ) == 1)  //检索到第一个偶数
               i++;
           while(i < j && (nums[j] & 1) == 0)  //检索到第一个奇数
               j--;
           tmp = nums[i];
           nums[i] = nums[j];
           nums[j] =tmp;
       }
       return nums;
    }
}
