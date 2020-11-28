package com.offer._11;

import java.time.chrono.MinguoChronology;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/28 13:02
 * @Description ：
 */
public class Solution {
    public static int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while(low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }

    public static void main(String[] args) {
        int[] array = {2,2,2,0,1};
        System.out.println(minArray(array));
    }
}
