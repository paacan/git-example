package leetcode;

import java.util.*;
import java.util.Map.Entry;

public class leetcode169 {
    //https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 1};;
        Solution sol = new Solution();
        System.out.println(sol.majorityElement(nums));

    }


    static class Solution {
        public int majorityElement(int[] nums) {

                Arrays.sort(nums);

                return nums[nums.length / 2];

        }
    }
    static class Solution1 {
        public int majorityElement(int[] nums) {

            HashMap<Integer,Integer> mapa = new HashMap<>();

            for (int i = 0; i < nums.length ; i++) {
                mapa.put(nums[i], mapa.getOrDefault(nums[i],0)+1);
            }
            int n = nums.length/2;
            for(Map.Entry<Integer,Integer> entry: mapa.entrySet()) {
                if(entry.getValue()>n) {
                    return entry.getKey();
                }
            }
            return 0;

        }
    }
}
