package com.offer._5;

/**
 * @author ：jhys
 * @date ：Created in 2020/11/12 20:17
 * @Description ：
 */
public class Solution {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer res = new StringBuffer();
        int len = str.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                res.append("02%");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("A B C");
        String s = replaceSpace(sb);
        System.out.println(s);
    }

}
