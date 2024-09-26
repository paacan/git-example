package leetcode;

import java.util.HashSet;

public class leetcode771 {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            int pislo = 0;
            for (int i = 0; i < stones.length(); i++) {
                for (int j = 0; j < jewels.length() ; j++) {
                    if ( jewels.charAt(j)==stones.charAt(i)) {
                        pislo++;
                    }
                }
            }
            return pislo;
        }
    }
    class Solution2 {
        public int numJewelsInStones(String jewels, String stones) {
            HashSet<Character> bukwa = new HashSet<>();
            int pislo = 0 ;
            for (int i = 0; i < jewels.length() ; i++) {
                bukwa.add(jewels.charAt(i));
            }
            for (int i = 0; i < stones.length(); i++) {
                if(bukwa.contains(stones.charAt(i))) {
                    pislo++;
                }

            }
            return pislo;
        }
    }
}
