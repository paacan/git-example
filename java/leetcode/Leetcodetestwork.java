package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcodetestwork {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap<>();
            int n = nums.length;
            for(int i =0 ; i < n;i++) {
                int complemet = target-nums[i];
                if (map.containsKey(complemet)) {
                    return new int[]{map.get(complemet),i};
                }
                else
                    map.put(nums[i],i);
            }
            return new int[]{};
        }
    }



}
