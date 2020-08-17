package com.lyming;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 *
 * @author lyming
 * @date 2020/8/13 12:03 上午
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15} ;
        int[] sum = twoSum(arr, 9);
        for (int i : sum) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
