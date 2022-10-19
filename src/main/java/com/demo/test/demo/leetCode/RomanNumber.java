package com.demo.test.demo.leetCode;


/**
 *  罗马数字转为数字
 */
public class RomanNumber {


    public static int getValue(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInt(String s) {
        if (s.length() > 15 || s.length() < 1) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            int a = getValue(chars[i]);
            int b = (i + 1) >= chars.length ? 0 : getValue(chars[i + 1]);
            if (a >= b) {
                result += a;
            } else {
                result -= a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "IV";
        System.out.println(romanToInt(a));
    }

}
