package leetcode.simple;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Copyright: Copyright (c) 2021 DNT
 *
 * @ClassName: TwoNumSum
 * @Description: 两数之和
 * @Version: v1.0.0
 * @Author: liumf
 * @Date: 14:45 2022/2/11
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 14:45       liumf           v1.1.0
 */
public class TwoNumSum {

    @Test
    public void solution(){

        int[] numbers = new int[]{0,1,2,3};

        int target =4;

        // int[] ints = twoNumSum(numbers, target);

        int[] ints = twoNumSum2(numbers, target);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 时间复杂度O(N2)
     */


    public int[] twoNumSum(int[] nums,int target){

        int arrayLength = nums.length;

        for (int i=0;i<arrayLength;i++){

            for (int j =i+1;j<arrayLength;j++){

                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * hash表实现
     * 时间复杂度O(N)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoNumSum2(int[] nums,int target){

        HashMap<Integer, Integer> map = new HashMap<>(16);

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i],i);
        }


        return new int[0];
    }
}
