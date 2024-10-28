package leetcode;

public class leetcode58 {
    //https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&envId=top-interview-150
    class Solution {
        public int lengthOfLastWord(String s) {
            int counter = 0 ;
            int i = s.length()-1;
            while (i>=0 && s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '?'){
                i--;
            }

            while (i>= 0 && s.charAt(i)!= ' '){
                counter++;
                i--;
            }
            return counter;
        }
    }
}
