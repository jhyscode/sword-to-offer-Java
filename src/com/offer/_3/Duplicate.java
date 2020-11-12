package com.offer._3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/12 17:07
 * @Description ：
 */
public class Duplicate {

    public static int findDuplicate(int[] intArray) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if (map.get(intArray[i]) == null) {
                map.put(intArray[i], i);
            } else {
                return intArray[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,3,1,0,3,5};
        System.out.println(findDuplicate(array));
    }
}


