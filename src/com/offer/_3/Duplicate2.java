package com.offer._3;

/** 不修改数组找出重复的数字
 * @author ：jhys
 * @date ：Created in 2020/11/12 19:06
 * @Description ：
 */
public class Duplicate2 {
    /**
     *
     * @param intArray
     * @param duplicaiton 将首次找到的重复数字利用duplicaiton[0] = ?存入数组
     * @return
     */
    public static boolean findDuplicate(int[] intArray, int[] duplicaiton) {
        // 杜绝数组为空
        if (intArray.length == 0) {
            duplicaiton[0] = -1;
            return false;
        }
        // 杜绝数组有非法数字
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 1 || intArray[i] > intArray.length - 1) {
                duplicaiton[0] = -1;
                return false;
            }
        }

        int start = 1;
        int end = intArray.length - 1;
        while (end >= start) {
            // >> 右移一位相当于除以2
            int middle = ((end + start) >> 1);
            int count = countRange(intArray, start, middle);
            // 终止条件
            if (start == end) {
                if (count > 1) {
                    duplicaiton[0] = middle;
                    return true;
                } else {
                    break;
                }
            }
            if (count > (middle - start) + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }

        }
        duplicaiton[0] = -1;
        return false;

    }

    /**
     * 统计数组在区间里数字的个数
     * @param intArray
     * @param start
     * @param end
     * @return
     */
    public static int countRange(int[] intArray, int start, int end) {
        if (intArray.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i : intArray) {
            if (i >= start && i <= end) {
                count++;
            }
        }
        return count;
    }

}
