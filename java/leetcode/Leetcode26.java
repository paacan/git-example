package leetcode;

public class Leetcode26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,3,3,4,5,5,5};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0 ;
            for (int i = 0; i < nums.length ; i++) {
                if (i == 0 || nums[i] != nums[i-1]) {
                    nums[k++] = nums[i];
                }
            }
                return k;
            }
    }
}
