package leetcode;

public class leetcode283 {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int a = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0) {
                nums[a++] = nums[i];
            }
            if (nums[i] == 0) {
                k++;
            }
        }
        while (k > 0) {
            nums[nums.length-k] = 0;
            k--;
        }

    }
}
