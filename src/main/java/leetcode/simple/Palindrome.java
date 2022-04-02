package leetcode.simple;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liumf
 * @date 23:04 2022/2/14
 * @className Palindrome
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 * @description 回文数
 */

public class Palindrome {


    @Test
    public void test() {


        int x = -121;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {



        return new StringBuffer(x+"").reverse().toString().equals(x+"") ? true : false;

    }


}
