package com.company;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[]args) {
        int[] nums = new int[]{2,7,9,11};
        int target =11;
        int[] ints = new Demo1().twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public int[] twoSum( int[]  nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j] == target)
                    //返回索引的位置
                    return new int[]{i,j};
            }
        }

        return null;
    }
}
