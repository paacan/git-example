package leetcode;

public class leetcode189 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-1,-100,3,99};
        int k = 2;
        Solution.rotate(nums,k);
    }
    //https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

    static class Solution {
        public static  void rotate(int[] nums, int k) {
            int n = nums.length;
            int last = nums[n-1];
            while (k > 0 ) {
                for (int i = nums.length-1; i > 0 ; i--) {
                    nums[i] = nums[i-1];
                }
                nums[0] = last;
                k--;
                last = nums[nums.length-1];


            }
        }
    }
}
