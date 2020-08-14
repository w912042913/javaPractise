package com.company;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.Arrays;
import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 11};
        int target = 11;
        int[] ints = new Demo1().twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
    public int[] twoSum( int[]  nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num =target -nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(i),i};
            }
            map.put(nums[i],i);
        }
      return null;}
    }

