package leetcode;

public class leetcode3340 {
    //https://leetcode.com/problems/check-balanced-string/
    public static void main(String[] args) {
        String num = "24123";
        Solution solution = new Solution();
        solution.isBalanced(num);
    }
    static class Solution {
        public boolean isBalanced(String num) {
            int chetnoe = 0;
            int nechetnoe = 0;
            for (int i = 0; i < num.length() ; i++) {
                if( i % 2 == 0 ) {
                    chetnoe += Character.getNumericValue(num.charAt(i));
                }
                else {
                    nechetnoe += Character.getNumericValue(num.charAt(i));
                }

            }
            if ( chetnoe != nechetnoe) {
                return false;
            }
            else {
                return true;
            }

        }
    }
}
